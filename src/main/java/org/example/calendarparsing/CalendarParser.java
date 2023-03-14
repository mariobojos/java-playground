package org.example.calendarparsing;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalendarParser {
    protected static final String REGEX_URL = "(https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9]+\\.[^\\s]{2,}|www\\.[a-zA-Z0-9]+\\.[^\\s]{2,})(\\?|\\&)([^=]+)\\=([^&]+)";
    protected static final String REGEX_URL2 = "https?:";
    protected static final String REGEX_QUERY_STR = "(\\?|\\&)([^=]+)\\=([^&]+)";
    protected static final String REGEX_FIELD = "[A-Z]+:";
    protected static final String REGEX_NON_QUERY_STR = "[\\s\\[\\|\\]\\{\\}\"\\^`~#]{1,}";

    private String events;

    public CalendarParser(String events) {
        this.events = events;
    }

    public String parseCalendar() {
        // Convert string to List with DESCRIPTION as delimiter
        List<String> entries = Stream
                .of(events.split("DESCRIPTION"))
                .map(s -> new String(s))
                .collect(Collectors.toList());

        // Skip the first entry since it's the VCalendar prefix
        for (int i = 1; i < entries.size(); i++) {
            //entries.set(i, parseDescription(entries.get(i)));
        }

        StringBuilder sb = new StringBuilder();
        for (String s: entries) {
            sb.append(s);
        }
        return sb.toString();
    }

    public String parseDescription(String description) {
        // Isolate the Description entry
        int descEndIndex = indexOf(REGEX_FIELD, description, 0);

        String desc = description.substring(0, descEndIndex);

        StringBuilder newDesc = new StringBuilder();

        int startPtr = indexOf(REGEX_URL2, desc, 0);
        int endPtr = 0;
        int descPtr = 0;
        int lenDesc = desc.length();
        boolean addTag = false;

        while (startPtr < lenDesc && startPtr != -1) {
            // Check that it is not part of an <a> tag. If it has an href=" or > before the "http"
            if (desc.substring(startPtr-6, startPtr).equalsIgnoreCase("href=\"") || desc.substring(startPtr-1, startPtr).equalsIgnoreCase(">") || desc.substring(startPtr-1, startPtr).equalsIgnoreCase("\"")) {
                // <a> tag found, Find another URL
                startPtr = indexOf(REGEX_URL2, desc, endPtr);
                if (startPtr > 0 && startPtr < lenDesc) {
                    endPtr = indexOf(REGEX_NON_QUERY_STR, desc, startPtr);
                }
            } else {
                addTag = true;
                if (startPtr > 0 && startPtr < lenDesc) {
                    int te = indexOf(REGEX_URL, desc, startPtr);
                    endPtr = indexOf(REGEX_NON_QUERY_STR, desc, startPtr);

                    Pattern urlPattern = Pattern.compile(REGEX_URL);
                    Matcher matcher = urlPattern.matcher(desc);
                    if (matcher.find(startPtr)) {
                        desc = desc.replace(matcher.group(), "<a href=\"" + matcher.group() + "\">" + matcher.group() + "</a>");
                        endPtr = startPtr + matcher.group().length();
                    }
                    startPtr = indexOf(REGEX_URL2, desc, endPtr);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("DESCRIPTION");
        if (!addTag) {
            sb.append(description);
        } else {
            sb.append(desc);
        }
        return sb.toString();
    }

    public String partialParseDescription(String description) {
        // Isolate the Description entry
        String[] lines = description.split(REGEX_FIELD);

        String desc = lines[0];
        StringBuilder newDesc = new StringBuilder();

        int startPtr = desc.indexOf("http");
        int endPtr = 0;
        int descPtr = 0;
        int lenDesc = desc.length();
        while (startPtr != -1) {
            // Check that it is not part of an <a> tag. If it has an href=" or > before the "http"
            if (!(desc.substring(startPtr-6, startPtr).equalsIgnoreCase("href=\"") || desc.substring(startPtr-1, startPtr).equalsIgnoreCase(">"))) {
                // No <a> tag yet
                // Find the end of the current URL
                endPtr = startPtr + 1;
                int len = desc.length() - startPtr; // length of string to parse
                while (endPtr < len) {
                    char key = desc.charAt(startPtr);
                    int ascii = (int) key;
                    if (ascii < 128
                            || key != ' ' || key != '"' || key != '<' || key != '>' || key != '[' || key != '\\' || key != '>' || key != ']'
                            || key != '{' || key != '|' || key != '}' || key != '^' || key != '`' || key != '#') {
                        if (endPtr != len) {
                            endPtr++;
                        } else {
                            newDesc.append(desc.substring(descPtr, startPtr));
                            descPtr = endPtr;
                            newDesc.append(tagUrl(desc.substring(startPtr, endPtr)));
                        }
                    } else {
                        // Found end of URL
                        newDesc.append(desc.substring(descPtr, startPtr));
                        descPtr = endPtr;
                        newDesc.append(tagUrl(desc.substring(startPtr, endPtr)));
                    }
                }
            } else {
                char[] keys = {' ', '<', '\"', '>', '[', '\\', ']', '{', '|', '}', '^', '`', '#' };
                endPtr = queryStringInvalidCharIndex(desc, keys, startPtr);
            }

            startPtr = desc.indexOf("http", endPtr);
        }

        if (!newDesc.isEmpty()) {
            lines[0] = newDesc.toString();
        }

//        This catches ONLY A PORTION OF the query string
//        Pattern urlPattern = Pattern.compile(REGEX_URL);
//        Matcher matcher = urlPattern.matcher(desc);
//        while(matcher.find()) {
//            lines[0] = desc.replace(matcher.group(), "<a href=\r\n\"" + matcher.group() + "\"\r\n>" + matcher.group() + "\r\n</a>");
//        }

        StringBuilder sb = new StringBuilder();
        sb.append("DESCRIPTION");
        for (String s: lines) {
            sb.append(s);
        }
        return sb.toString();
    }

    public int indexOf(String regex, String s, int index) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.find(index) ? matcher.start() : -1;
    }


    private int queryStringInvalidCharIndex(String str, char[] keys, int startIndex) {
        List<Integer> result = new ArrayList<>();
        boolean found = false;
        for (char c: keys) {
            int res = str.indexOf(c, startIndex);
            result.add(res);
            if (res > -1) found = true;
        }

        if (!found) return -1;
//        int min = 0;
//        for (int r: result) {
//            if (r > -1 && r < min) {
//                min = r;
//            }
//        }

        int min = result.get(0);
        for (int i = 1; i < result.size(); i++) {
            if (result.get(i) > -1 && result.get(i) < min) {
                min = result.get(i);
            }
        }

        return min;
    }

    private String tagUrl(String url) {
        StringBuilder sb = new StringBuilder();
        sb.append("<a href=\r\n\"")
                .append(url)
                .append("\">\r\n")
                .append(url)
                .append("\r\n</a>")
        ;
        return sb.toString();
    }

    private String eventRegEx = ":Event Name:";

    private String parseEvent(String s) {
        return s.replace(eventRegEx, ":EVENT_NAME:");
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }
}
