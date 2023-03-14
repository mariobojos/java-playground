package org.example.calendarparsing;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalendarParser {
    protected static final String urlRegEx = "(https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9]+\\.[^\\s]{2,}|www\\.[a-zA-Z0-9]+\\.[^\\s]{2,})(\\?|\\&)([^=]+)\\=([^&]+)";
    protected static final String queryStringRegEx = "(\\?|\\&)([^=]+)\\=([^&]+)";
    protected static final String fieldSeparatorRegEx = "\"[A-Z]+:\"";

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
            //System.out.println(i);
            entries.set(i, parseEvent(entries.get(i)));
            //System.out.println(entries.get(i));
        }

        StringBuilder sb = new StringBuilder();
        for (String s: entries) {
            sb.append(s);
        }
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
