package org.example.calendarparsing;

public class CalendarMain {
    public static String MAIN_CALENDAR = "BEGIN:VCALENDAR\n" +
            "PRODID:-//Trumba Corporation//Trumba Calendar Services 0.11.21309//EN\n" +
            "VERSION:2.0\n" +
            "CALSCALE:GREGORIAN\n" +
            "X-WR-CALNAME:Main Calendar\n" +
            "X-WR-TIMEZONE:America/New_York\n" +
            "METHOD:PUBLISH\n" +
            "BEGIN:VTIMEZONE\n" +
            "TZID:America/New_York\n" +
            "BEGIN:STANDARD\n" +
            "TZOFFSETFROM:-0400\n" +
            "TZOFFSETTO:-0500\n" +
            "TZNAME:EST\n" +
            "DTSTART:20071104T020000\n" +
            "RRULE:FREQ=YEARLY;BYMONTH=11;BYDAY=1SU\n" +
            "END:STANDARD\n" +
            "BEGIN:DAYLIGHT\n" +
            "TZOFFSETFROM:-0500\n" +
            "TZOFFSETTO:-0400\n" +
            "TZNAME:EDT\n" +
            "DTSTART:20070311T020000\n" +
            "RRULE:FREQ=YEARLY;BYMONTH=3;BYDAY=2SU\n" +
            "END:DAYLIGHT\n" +
            "END:VTIMEZONE\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:SPEAK CLUB Speech Competition\n" +
            "LOCATION:Great Hall - Auditorium Lobby\n" +
            "DTSTART;TZID=America/New_York:20230403T160000\n" +
            "DTEND;TZID=America/New_York:20230403T173000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Student Activit\n" +
            " ies\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event image\";ID=42;TYPE=Image:<a href=\"https:\n" +
            " //25livepub.collegenet.com/i/DgB0RFnGxPCwbqViOdACPbDB.png\" target=\"_blan\n" +
            " k\" rel=\"noopener\" title=\"https://25livepub.collegenet.com/i/DgB0RFnGxPCw\n" +
            " bqViOdACPbDB.png\">25livepub.collegenet.com&#8230\\;</a>\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25565;TYPE=SingleLine:2023-\n" +
            " AANVAP\n" +
            "DTSTAMP:20230314T101323Z\n" +
            "CATEGORIES:Main Calendar\n" +
            "UID:http://uid.trumba.com/event/845794928\n" +
            "X-TRUMBA-LINK:http://www.johnstoncc.edu/view-all-events.aspx?trumbaEmbed\n" +
            " =view%3devent%26eventid%3d845794928\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Red Cross Blood Drive\n" +
            "LOCATION:Great Hall - Auditorium Lobby\n" +
            "DTSTART;TZID=America/New_York:20230420T090000\n" +
            "DTEND;TZID=America/New_York:20230420T133000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Activity\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25565;TYPE=SingleLine:2022-\n" +
            " AANLKK\n" +
            "DTSTAMP:20230314T090907Z\n" +
            "DESCRIPTION:<p style=\"text-align: center\\; background: white\\;\" align=\"c\n" +
            " enter\"><strong><span style=\"font-size: 28.0pt\\; font-family: 'Arial'\\,sa\n" +
            " ns-serif\\; color: red\\;\">Community Blood Drive</span></strong></p> <p st\n" +
            " yle=\"text-align: center\\; background: white\\;\" align=\"center\"><span><str\n" +
            " ong><span style=\"font-size: 28.0pt\\; font-family: 'Arial'\\,sans-serif\\; \n" +
            " color: gray\\;\">Johnston Community College</span></strong></span></p> <p \n" +
            " style=\"text-align: center\\; background: white\\;\" align=\"center\"><span><s\n" +
            " trong><span style=\"font-size: 20.0pt\\; font-family: 'Arial'\\,sans-serif\n" +
            " \\; color: gray\\;\">&#160\\;</span></strong></span></p> <p style=\"text-align\n" +
            " : center\\; background: white\\;\" align=\"center\"><span><span style=\"font-s\n" +
            " ize: 20.0pt\\; font-family: 'Arial'\\,sans-serif\\; color: gray\\;\">Held In \n" +
            " The Frank Creech Art Gallery</span></span></p> <p style=\"text-align: cen\n" +
            " ter\\; background: white\\;\" align=\"center\"><span><span style=\"font-size: \n" +
            " 18.0pt\\; font-family: 'Arial'\\,sans-serif\\; color: gray\\;\">245 College R\n" +
            " oad</span></span></p> <p style=\"text-align: center\\; background: white\\;\n" +
            " \" align=\"center\"><span><span style=\"font-size: 18.0pt\\; font-family: 'Ar\n" +
            " ial'\\,sans-serif\\; color: gray\\;\">Smithfield\\, NC 27577</span></span></p\n" +
            " > <p style=\"text-align: center\\; background: white\\;\" align=\"center\"><sp\n" +
            " an><span style=\"font-size: 18.0pt\\; font-family: 'Arial'\\,sans-serif\\; c\n" +
            " olor: gray\\;\">&#160\\;</span></span></p> <p style=\"text-align: center\\; b\n" +
            " ackground: white\\;\" align=\"center\"><span><strong><span style=\"font-size:\n" +
            "  18.0pt\\; font-family: 'Arial'\\,sans-serif\\; color: gray\\;\">Tuesday\\, Ja\n" +
            " nuary 24<sup>th</sup></span></strong></span></p> <p style=\"text-align: c\n" +
            " enter\\; background: white\\;\" align=\"center\"><span><strong><span style=\"f\n" +
            " ont-size: 18.0pt\\; font-family: 'Arial'\\,sans-serif\\; color: gray\\;\">9 a\n" +
            " .m. &#8211\\; 1:30 p.m.</span></strong></span></p> <p style=\"text-align: \n" +
            " center\\; background: white\\;\" align=\"center\"><span><span style=\"font-siz\n" +
            " e: 16.0pt\\; font-family: 'Arial'\\,sans-serif\\; color: gray\\;\">To schedul\n" +
            " e your lifesaving appointment\\, visit&#160\\;</span></span><strong><em><u\n" +
            " ><span style=\"font-size: 16.0pt\\; font-family: 'Arial'\\,sans-serif\\; col\n" +
            " or: #ed5c57\\;\"><a href=\"https://nam04.safelinks.protection.outlook.com/?\n" +
            " url=http%3A%2F%2Fwww.redcrossblood.org%2F&amp\\;data=05%7C01%7Ckhmitchell\n" +
            " jr%40johnstoncc.edu%7C7193e9694df04737463d08daf8914339%7Ca15abbde35894af\n" +
            " 294737f4a25fac1ca%7C0%7C0%7C638095603454503483%7CUnknown%7CTWFpbGZsb3d8e\n" +
            " yJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C3000\n" +
            " %7C%7C%7C&amp\\;sdata=HHO4ASlylaZBhLH2kwrXh5BmLxRm3G4ehEHvr1PWcek%3D&amp\n" +
            " \\;reserved=0\" target=\"_blank\" rel=\"noopener\">www.redcrossblood.org</a><sp\n" +
            " an>&#160\\;</span>and enter sponsor code: JCC</span></u></em></strong></p\n" +
            " > <p style=\"text-align: center\\; background: white\\;\" align=\"center\"><sp\n" +
            " an><span style=\"font-size: 16.0pt\\; font-family: 'Arial'\\,sans-serif\\; c\n" +
            " olor: gray\\;\">&#160\\;</span></span></p> <p style=\"text-align: center\\; b\n" +
            " ackground: white\\;\" align=\"center\"><span><span style=\"font-size: 16.0pt\n" +
            " \\; font-family: 'Arial'\\,sans-serif\\; color: gray\\;\">16 year olds can don\n" +
            " ate with signed parental consent form</span></span></p> <p style=\"text-a\n" +
            " lign: center\\; background: white\\;\" align=\"center\"><span><span style=\"fo\n" +
            " nt-size: 16.0pt\\; font-family: 'Arial'\\,sans-serif\\; color: gray\\;\">We N\n" +
            " eed all Eligible donors to meet our goal!</span></span></p>\n" +
            "CATEGORIES:Main Calendar\n" +
            "UID:http://uid.trumba.com/event/796902356\n" +
            "X-TRUMBA-LINK:http://www.johnstoncc.edu/view-all-events.aspx?trumbaEmbed\n" +
            " =view%3devent%26eventid%3d796902356\n" +
            "END:VEVENT\n" +
            "END:VCALENDAR\n";
}
