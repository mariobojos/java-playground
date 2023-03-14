package org.example.calendarparsing;

public class CalendarStudent {
    public static String STUDENT_LIFE_CAL = "BEGIN:VCALENDAR\n" +
            "PRODID:-//Trumba Corporation//Trumba Calendar Services 0.11.21309//EN\n" +
            "VERSION:2.0\n" +
            "CALSCALE:GREGORIAN\n" +
            "X-WR-CALNAME:Calendar - Student Life\n" +
            "X-WR-TIMEZONE:America/Los_Angeles\n" +
            "METHOD:PUBLISH\n" +
            "BEGIN:VTIMEZONE\n" +
            "TZID:America/Los_Angeles\n" +
            "BEGIN:STANDARD\n" +
            "TZOFFSETFROM:-0700\n" +
            "TZOFFSETTO:-0800\n" +
            "TZNAME:PST\n" +
            "DTSTART:20071104T020000\n" +
            "RRULE:FREQ=YEARLY;BYMONTH=11;BYDAY=1SU\n" +
            "END:STANDARD\n" +
            "BEGIN:DAYLIGHT\n" +
            "TZOFFSETFROM:-0800\n" +
            "TZOFFSETTO:-0700\n" +
            "TZNAME:PDT\n" +
            "DTSTART:20070311T020000\n" +
            "RRULE:FREQ=YEARLY;BYMONTH=3;BYDAY=2SU\n" +
            "END:DAYLIGHT\n" +
            "END:VTIMEZONE\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Yoga Tuesdays\n" +
            "DTSTART;TZID=America/Los_Angeles:20230314T150000\n" +
            "DTEND;TZID=America/Los_Angeles:20230314T160000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Special Class\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Yoga Tue\n" +
            " sdays\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:CAMPUS\n" +
            "  ACTIVITIES BOARD\\, STUDENT LIFE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALAWL\n" +
            "DTSTAMP:20230105T152825Z\n" +
            "DESCRIPTION:Event Name: Yoga Tuesdays<br>Organization: CAMPUS ACTIVITIES\n" +
            "  BOARD\\, STUDENT LIFE<br>Event Locator: 2023-AALAWL<br><br><p>How will y\n" +
            " ou start your week? Come join us for a session of relaxation and energiz\n" +
            " ing yoga. Yoga Tuesdays take place from 3-4 p.m. in the Health and Welln\n" +
            " ess Center (building 31)\\, room 135A.</p> <p>Improve your strength\\, bal\n" +
            " ance\\, and flexibility through our yoga sessions every Tuesday though Ma\n" +
            " rch 14. These sessions are free and open to anyone to join!</p> <p>Any q\n" +
            " uestions? Email us at <a href=\"mailto:studentlife@spscc.edu\" target=\"_bl\n" +
            " ank\" rel=\"noopener\">studentlife@spscc.edu</a>.</p> <p><em><strong>*TICKE\n" +
            " TS AND/OR REGISTRATION IS NOT REQUIRED FOR THIS EVENT! You can simply sh\n" +
            " ow up!*</strong></em></p> <p>For reasonable accommodation requests\\, ple\n" +
            " ase contact Access Services at <a href=\"mailto:access.services@spscc.edu\n" +
            " \" target=\"_blank\" rel=\"noopener\">access.services@spscc.edu</a>.</p> <p><\n" +
            " img src=\"https://img.evbuc.com/https%3A%2F%2Fcdn.evbuc.com%2Fimages%2F41\n" +
            " 9071609%2F184710419038%2F1%2Foriginal.20230105-225139?w=940&amp\\;auto=fo\n" +
            " rmat%2Ccompress&amp\\;q=75&amp\\;sharp=10&amp\\;rect=0%2C0%2C1920%2C960&amp\n" +
            " \\;s=f3c9b92bb931a3816fc616dc6da2aaec\" style=\"width:425px\\;max-width:100%\n" +
            " \\;\"></p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/788008166\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d788008166\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Jazz Concert: Swing into Spring\n" +
            "LOCATION:Kenneth J. Minnaert Center for the Arts Main Stage (Bldg 21)\n" +
            "DTSTART;TZID=America/Los_Angeles:20230314T193000\n" +
            "DTEND;TZID=America/Los_Angeles:20230314T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Jazz Con\n" +
            " cert: Swing into Spring\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:Music\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2021-\n" +
            " AAKMJW\n" +
            "DTSTAMP:20230313T105223Z\n" +
            "DESCRIPTION:Event Name: Jazz Concert: Swing into Spring<br>Organization:\n" +
            "  Music<br>Event Locator: 2021-AAKMJW<br><br><p>The SPSCC Jazz Band\\, und\n" +
            " er the direction of Brad Schrandt\\, present an evening concert featuring\n" +
            "  both large group and small group ensembles performing selections showca\n" +
            " sing songs to help you swing into spring!</p> <p>The concert is free for\n" +
            "  all SPSCC students\\, staff &amp\\; faculty and a suggested $15 donation \n" +
            " at the door for the community.</p> <p>&#160\\;</p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "GEO:47.024437;-122.92978\n" +
            "UID:http://uid.trumba.com/event/745403890\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d745403890\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Monthly Brown Bag Discussion\n" +
            "LOCATION:Mottman Campus Building 22 Room 270\n" +
            "DTSTART;TZID=America/Los_Angeles:20230315T120000\n" +
            "DTEND;TZID=America/Los_Angeles:20230315T130000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Training / Prof\n" +
            " essional Development / Workshop\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Monthly \n" +
            " Brown Bag Discussion\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DIVERS\n" +
            " ITY AND EQUITY\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Categories\";ID=12013;TYPE=SingleLine:Diversit\n" +
            " y &amp\\; Equity Center\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Web Site\";ID=12014;TYPE=Url:<a href=\"https://\n" +
            " www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content\n" +
            " =DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_source=publish\n" +
            " sharelink\" target=\"_blank\" rel=\"noopener\" title=\"https://www.canva.com/d\n" +
            " esign/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content=DAFXgm7WKEQ&ut\n" +
            " m_campaign=designshare&utm_medium=link&utm_source=publishsharelink\">www.\n" +
            " canva.com&#8230\\;</a>\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALDNB\n" +
            "DTSTAMP:20230303T104443Z\n" +
            "DESCRIPTION:Event Name: Monthly Brown Bag Discussion<br>Organization: DI\n" +
            " VERSITY AND EQUITY<br>Categories: Diversity & Equity Center<br>Web Site:\n" +
            "  https://www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?ut\n" +
            " m_content=DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_sourc\n" +
            " e=publishsharelink<br>Event Locator: 2023-AALDNB<br><br><p><span>Join us\n" +
            "  in exchanging and hearing various perspectives and lived experiences in\n" +
            "  a safe and respectful space. Each month the topic changes! <strong>No r\n" +
            " egistration is required.</strong></span></p>\n" +
            "CATEGORIES:DEC Calendar\n" +
            "GEO:47.02288;-122.9305\n" +
            "UID:http://uid.trumba.com/event/834144941\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d834144941\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Monthly Brown Bag Discussion\n" +
            "LOCATION:Mottman Campus Building 22 Room 270\n" +
            "DTSTART;TZID=America/Los_Angeles:20230315T120000\n" +
            "DTEND;TZID=America/Los_Angeles:20230315T130000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Training / Prof\n" +
            " essional Development / Workshop\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Monthly \n" +
            " Brown Bag Discussion\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DIVERS\n" +
            " ITY AND EQUITY\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Categories\";ID=12013;TYPE=SingleLine:Diversit\n" +
            " y &amp\\; Equity Center\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Web Site\";ID=12014;TYPE=Url:<a href=\"https://\n" +
            " www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content\n" +
            " =DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_source=publish\n" +
            " sharelink\" target=\"_blank\" rel=\"noopener\" title=\"https://www.canva.com/d\n" +
            " esign/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content=DAFXgm7WKEQ&ut\n" +
            " m_campaign=designshare&utm_medium=link&utm_source=publishsharelink\">www.\n" +
            " canva.com&#8230\\;</a>\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALDNB\n" +
            "DTSTAMP:20230303T104456Z\n" +
            "DESCRIPTION:Event Name: Monthly Brown Bag Discussion<br>Organization: DI\n" +
            " VERSITY AND EQUITY<br>Categories: Diversity & Equity Center<br>Web Site:\n" +
            "  https://www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?ut\n" +
            " m_content=DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_sourc\n" +
            " e=publishsharelink<br>Event Locator: 2023-AALDNB<br><br><p><span>Join us\n" +
            "  in exchanging and hearing various perspectives and lived experiences in\n" +
            "  a safe and respectful space. Each month the topic changes! <strong>No r\n" +
            " egistration is required.</strong></span></p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "GEO:47.02288;-122.9305\n" +
            "UID:http://uid.trumba.com/event/835824584\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d835824584\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Super Mario Trivia\n" +
            "DTSTART;TZID=America/Los_Angeles:20230316T170000\n" +
            "DTEND;TZID=America/Los_Angeles:20230316T180000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Club Activity\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Super Ma\n" +
            " rio Trivia\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:CAMPUS\n" +
            "  ACTIVITIES BOARD\\, STUDENT LIFE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALDTX\n" +
            "DTSTAMP:20230310T112000Z\n" +
            "DESCRIPTION:Event Name: Super Mario Trivia<br>Organization: CAMPUS ACTIV\n" +
            " ITIES BOARD\\, STUDENT LIFE<br>Event Locator: 2023-AALDTX<br><br>&lt\\;p d\n" +
            " ata-key=&quot\\;40&quot\\;&gt\\;&lt\\;span data-key=&quot\\;39&quot\\;&gt\\;Wha\n" +
            " t is Mario&#39\\;s favorite type of fabric? Denim\\, denim\\, denim! <br>&l\n" +
            " t\\;p data-key=&quot\\;68&quot\\;&gt\\;&lt\\;span data-key=&quot\\;67&quot\\;&g\n" +
            " t\\;In honor of National Mario Day on March 10\\, Student Life invites you\n" +
            "  to Super Mario Trivia! <br>&lt\\;p data-key=&quot\\;42&quot\\;&gt\\;&lt\\;sp\n" +
            " an data-key=&quot\\;41&quot\\;&gt\\;Come fly by\\, test your knowledge\\, and\n" +
            "  join us for Mario trivia on Thursday\\, March 16 at 5 p.m.! Prizes will \n" +
            " be given to top 3 winners. <br>&lt\\;p data-key=&quot\\;44&quot\\;&gt\\;&lt\n" +
            " \\;span data-key=&quot\\;43&quot\\;&gt\\;Join the fun via Zoom using Zoom ID \n" +
            " 849-0117-3350.<br>&lt\\;p data-key=&quot\\;46&quot\\;&gt\\;&lt\\;span data-ke\n" +
            " y=&quot\\;45&quot\\;&gt\\;Join here: <a href=\"https://spscc.zoom.us/j/84901\n" +
            " 173350\" data-key=\"57\" target=\"_blank\" rel=\"noopener\">&lt\\;span data-key=\n" +
            " &quot\\;56&quot\\;&gt\\;https://spscc.zoom.us/j/84901173350</a><br>&lt\\;p d\n" +
            " ata-key=&quot\\;81&quot\\;&gt\\;&lt\\;span data-key=&quot\\;80&quot\\;&gt\\;Got\n" +
            "  questions? Email us at <a href=\"mailto:studentlife@spscc.edu\" target=\"_\n" +
            " blank\" rel=\"noopener\">studentlife@spscc.edu</a>. <br>&lt\\;p data-key=&qu\n" +
            " ot\\;85&quot\\;&gt\\;&lt\\;span data-key=&quot\\;84&quot\\;&gt\\;&lt\\;em data-s\n" +
            " late-leaf=&quot\\;true&quot\\;&gt\\;&lt\\;strong data-slate-leaf=&quot\\;true\n" +
            " &quot\\;&gt\\;*TICKETS AND/OR REGISTRATION IS NOT REQUIRED FOR THIS EVENT!\n" +
            "  You can simply show up!* <br>&lt\\;p data-key=&quot\\;89&quot\\; data-slat\n" +
            " e-fragment=&quot\\;JTdCJTIyb2JqZWN0JTIyJTNBJTIyZG9jdW1lbnQlMjIlMkMlMjJkYX\n" +
            " RhJTIyJTNBJTdCJTdEJTJDJTIybm9kZXMlMjIlM0ElNUIlN0IlMjJvYmplY3QlMjIlM0ElMj\n" +
            " JibG9jayUyMiUyQyUyMnR5cGUlMjIlM0ElMjJwYXJhZ3JhcGglMjIlMkMlMjJkYXRhJTIyJT\n" +
            " NBJTdCJTdEJTJDJTIybm9kZXMlMjIlM0ElNUIlN0IlMjJvYmplY3QlMjIlM0ElMjJ0ZXh0JT\n" +
            " IyJTJDJTIybGVhdmVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTIybGVhZiUyMiUyQy\n" +
            " UyMnRleHQlMjIlM0ElMjJXaGF0JTIwaXMlMjBNYXJpbydzJTIwZmF2b3JpdGUlMjB0eXBlJT\n" +
            " Iwb2YlMjBmYWJyaWMlM0YlMjBEZW5pbSUyQyUyMGRlbmltJTJDJTIwZGVuaW0hJTIwJTIyJT\n" +
            " JDJTIybWFya3MlMjIlM0ElNUIlNUQlN0QlNUQlN0QlNUQlN0QlMkMlN0IlMjJvYmplY3QlMj\n" +
            " IlM0ElMjJibG9jayUyMiUyQyUyMnR5cGUlMjIlM0ElMjJwYXJhZ3JhcGglMjIlMkMlMjJkYX\n" +
            " RhJTIyJTNBJTdCJTdEJTJDJTIybm9kZXMlMjIlM0ElNUIlN0IlMjJvYmplY3QlMjIlM0ElMj\n" +
            " J0ZXh0JTIyJTJDJTIybGVhdmVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTIybGVhZi\n" +
            " UyMiUyQyUyMnRleHQlMjIlM0ElMjJJbiUyMGhvbm9yJTIwb2YlMjBOYXRpb25hbCUyME1hcm\n" +
            " lvJTIwRGF5JTIwb24lMjBNYXJjaCUyMDEwJTJDJTIwU3R1ZGVudCUyMExpZmUlMjBpbnZpdG\n" +
            " VzJTIweW91JTIwdG8lMjBTdXBlciUyME1hcmlvJTIwVHJpdmlhISUyMCUyMiUyQyUyMm1hcm\n" +
            " tzJTIyJTNBJTVCJTVEJTdEJTVEJTdEJTVEJTdEJTJDJTdCJTIyb2JqZWN0JTIyJTNBJTIyYm\n" +
            " xvY2slMjIlMkMlMjJ0eXBlJTIyJTNBJTIycGFyYWdyYXBoJTIyJTJDJTIyZGF0YSUyMiUzQS\n" +
            " U3QiU3RCUyQyUyMm5vZGVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTIydGV4dCUyMi\n" +
            " UyQyUyMmxlYXZlcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMmxlYWYlMjIlMkMlMj\n" +
            " J0ZXh0JTIyJTNBJTIyQ29tZSUyMGZseSUyMGJ5JTJDJTIwdGVzdCUyMHlvdXIlMjBrbm93bG\n" +
            " VkZ2UlMkMlMjBhbmQlMjBqb2luJTIwdXMlMjBmb3IlMjBNYXJpbyUyMHRyaXZpYSUyMG9uJT\n" +
            " IwVGh1cnNkYXklMkMlMjBNYXJjaCUyMDE2JTIwYXQlMjA1JTIwcC5tLiElMjBQcml6ZXMlMj\n" +
            " B3aWxsJTIwYmUlMjBnaXZlbiUyMHRvJTIwdG9wJTIwMyUyMHdpbm5lcnMuJTIwJTIyJTJDJT\n" +
            " IybWFya3MlMjIlM0ElNUIlNUQlN0QlNUQlN0QlNUQlN0QlMkMlN0IlMjJvYmplY3QlMjIlM0\n" +
            " ElMjJibG9jayUyMiUyQyUyMnR5cGUlMjIlM0ElMjJwYXJhZ3JhcGglMjIlMkMlMjJkYXRhJT\n" +
            " IyJTNBJTdCJTdEJTJDJTIybm9kZXMlMjIlM0ElNUIlN0IlMjJvYmplY3QlMjIlM0ElMjJ0ZX\n" +
            " h0JTIyJTJDJTIybGVhdmVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTIybGVhZiUyMi\n" +
            " UyQyUyMnRleHQlMjIlM0ElMjJKb2luJTIwdGhlJTIwZnVuJTIwdmlhJTIwWm9vbSUyMHVzaW\n" +
            " 5nJTIwWm9vbSUyMElEJTIwODQ5LTAxMTctMzM1MC4lMjIlMkMlMjJtYXJrcyUyMiUzQSU1Qi\n" +
            " U1RCU3RCU1RCU3RCU1RCU3RCUyQyU3QiUyMm9iamVjdCUyMiUzQSUyMmJsb2NrJTIyJTJDJT\n" +
            " IydHlwZSUyMiUzQSUyMnBhcmFncmFwaCUyMiUyQyUyMmRhdGElMjIlM0ElN0IlN0QlMkMlMj\n" +
            " Jub2RlcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMnRleHQlMjIlMkMlMjJsZWF2ZX\n" +
            " MlMjIlM0ElNUIlN0IlMjJvYmplY3QlMjIlM0ElMjJsZWFmJTIyJTJDJTIydGV4dCUyMiUzQS\n" +
            " UyMkpvaW4lMjBoZXJlJTNBJTIwJTIyJTJDJTIybWFya3MlMjIlM0ElNUIlNUQlN0QlNUQlN0\n" +
            " QlMkMlN0IlMjJvYmplY3QlMjIlM0ElMjJpbmxpbmUlMjIlMkMlMjJ0eXBlJTIyJTNBJTIybG\n" +
            " luayUyMiUyQyUyMmRhdGElMjIlM0ElN0IlMjJocmVmJTIyJTNBJTIyaHR0cHMlM0ElMkYlMk\n" +
            " ZzcHNjYy56b29tLnVzJTJGaiUyRjg0OTAxMTczMzUwJTIyJTdEJTJDJTIybm9kZXMlMjIlM0\n" +
            " ElNUIlN0IlMjJvYmplY3QlMjIlM0ElMjJ0ZXh0JTIyJTJDJTIybGVhdmVzJTIyJTNBJTVCJT\n" +
            " dCJTIyb2JqZWN0JTIyJTNBJTIybGVhZiUyMiUyQyUyMnRleHQlMjIlM0ElMjJodHRwcyUzQS\n" +
            " UyRiUyRnNwc2NjLnpvb20udXMlMkZqJTJGODQ5MDExNzMzNTAlMjIlMkMlMjJtYXJrcyUyMi\n" +
            " UzQSU1QiU1RCU3RCU1RCU3RCU1RCU3RCUyQyU3QiUyMm9iamVjdCUyMiUzQSUyMnRleHQlMj\n" +
            " IlMkMlMjJsZWF2ZXMlMjIlM0ElNUIlN0IlMjJvYmplY3QlMjIlM0ElMjJsZWFmJTIyJTJDJT\n" +
            " IydGV4dCUyMiUzQSUyMiUyMiUyQyUyMm1hcmtzJTIyJTNBJTVCJTVEJTdEJTVEJTdEJTVEJT\n" +
            " dEJTJDJTdCJTIyb2JqZWN0JTIyJTNBJTIyYmxvY2slMjIlMkMlMjJ0eXBlJTIyJTNBJTIycG\n" +
            " FyYWdyYXBoJTIyJTJDJTIyZGF0YSUyMiUzQSU3QiU3RCUyQyUyMm5vZGVzJTIyJTNBJTVCJT\n" +
            " dCJTIyb2JqZWN0JTIyJTNBJTIydGV4dCUyMiUyQyUyMmxlYXZlcyUyMiUzQSU1QiU3QiUyMm\n" +
            " 9iamVjdCUyMiUzQSUyMmxlYWYlMjIlMkMlMjJ0ZXh0JTIyJTNBJTIyR290JTIwcXVlc3Rpb2\n" +
            " 5zJTNGJTIwRW1haWwlMjB1cyUyMGF0JTIwc3R1ZGVudGxpZmUlNDBzcHNjYy5lZHUuJTVDci\n" +
            " UyMiUyQyUyMm1hcmtzJTIyJTNBJTVCJTVEJTdEJTVEJTdEJTVEJTdEJTJDJTdCJTIyb2JqZW\n" +
            " N0JTIyJTNBJTIyYmxvY2slMjIlMkMlMjJ0eXBlJTIyJTNBJTIycGFyYWdyYXBoJTIyJTJDJT\n" +
            " IyZGF0YSUyMiUzQSU3QiU3RCUyQyUyMm5vZGVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJT\n" +
            " NBJTIydGV4dCUyMiUyQyUyMmxlYXZlcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMm\n" +
            " xlYWYlMjIlMkMlMjJ0ZXh0JTIyJTNBJTIyJTVDciUyMiUyQyUyMm1hcmtzJTIyJTNBJTVCJT\n" +
            " VEJTdEJTVEJTdEJTVEJTdEJTJDJTdCJTIyb2JqZWN0JTIyJTNBJTIyYmxvY2slMjIlMkMlMj\n" +
            " J0eXBlJTIyJTNBJTIycGFyYWdyYXBoJTIyJTJDJTIyZGF0YSUyMiUzQSU3QiU3RCUyQyUyMm\n" +
            " 5vZGVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTIydGV4dCUyMiUyQyUyMmxlYXZlcy\n" +
            " UyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMmxlYWYlMjIlMkMlMjJ0ZXh0JTIyJTNBJT\n" +
            " IyKlRJQ0tFVFMlMjBBTkQlMkZPUiUyMFJFR0lTVFJBVElPTiUyMElTJTIwTk9UJTIwUkVRVU\n" +
            " lSRUQlMjBGT1IlMjBUSElTJTIwRVZFTlQhJTIwWW91JTIwY2FuJTIwc2ltcGx5JTIwc2hvdy\n" +
            " UyMHVwISolNUNyJTIyJTJDJTIybWFya3MlMjIlM0ElNUIlN0IlMjJvYmplY3QlMjIlM0ElMj\n" +
            " JtYXJrJTIyJTJDJTIydHlwZSUyMiUzQSUyMmJvbGQlMjIlMkMlMjJkYXRhJTIyJTNBJTdCJT\n" +
            " dEJTdEJTJDJTdCJTIyb2JqZWN0JTIyJTNBJTIybWFyayUyMiUyQyUyMnR5cGUlMjIlM0ElMj\n" +
            " JpdGFsaWMlMjIlMkMlMjJkYXRhJTIyJTNBJTdCJTdEJTdEJTVEJTdEJTVEJTdEJTVEJTdEJT\n" +
            " JDJTdCJTIyb2JqZWN0JTIyJTNBJTIyYmxvY2slMjIlMkMlMjJ0eXBlJTIyJTNBJTIycGFyYW\n" +
            " dyYXBoJTIyJTJDJTIyZGF0YSUyMiUzQSU3QiU3RCUyQyUyMm5vZGVzJTIyJTNBJTVCJTdCJT\n" +
            " Iyb2JqZWN0JTIyJTNBJTIydGV4dCUyMiUyQyUyMmxlYXZlcyUyMiUzQSU1QiU3QiUyMm9iam\n" +
            " VjdCUyMiUzQSUyMmxlYWYlMjIlMkMlMjJ0ZXh0JTIyJTNBJTIyJTVDciUyMiUyQyUyMm1hcm\n" +
            " tzJTIyJTNBJTVCJTVEJTdEJTVEJTdEJTVEJTdEJTJDJTdCJTIyb2JqZWN0JTIyJTNBJTIyYm\n" +
            " xvY2slMjIlMkMlMjJ0eXBlJTIyJTNBJTIycGFyYWdyYXBoJTIyJTJDJTIyZGF0YSUyMiUzQS\n" +
            " U3QiU3RCUyQyUyMm5vZGVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTIydGV4dCUyMi\n" +
            " UyQyUyMmxlYXZlcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMmxlYWYlMjIlMkMlMj\n" +
            " J0ZXh0JTIyJTNBJTIyRm9yJTIwcmVhc29uYWJsZSUyMGFjY29tbW9kYXRpb24lMjByZXF1ZX\n" +
            " N0cyUyQyUyMHBsZWFzZSUyMGNvbnRhY3QlMjBBY2Nlc3MlMjBTZXJ2aWNlcyUyMGF0JTIwYW\n" +
            " NjZXNzLnNlcnZpY2VzJTQwc3BzY2MuZWR1LiUyMiUyQyUyMm1hcmtzJTIyJTNBJTVCJTVEJT\n" +
            " dEJTVEJTdEJTVEJTdEJTVEJTdE&quot\\;&gt\\;&lt\\;span data-key=&quot\\;88&quot\n" +
            " \\;&gt\\;For reasonable accommodation requests\\, please contact Access Serv\n" +
            " ices at <a href=\"mailto:access.services@spscc.edu\" target=\"_blank\" rel=\"\n" +
            " noopener\">access.services@spscc.edu</a>.<br>&lt\\;p data-key=&quot\\;89&qu\n" +
            " ot\\;&#8230\\;\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/841952434\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d841952434\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Circle Up! Clipper Support Group\n" +
            "DTSTART;TZID=America/Los_Angeles:20230317T130000\n" +
            "DTEND;TZID=America/Los_Angeles:20230317T143000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Club Activity\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Circle U\n" +
            " p! Clipper Support Group\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:CAMPUS\n" +
            "  ACTIVITIES BOARD\\, COUNSELING\\, STUDENT LIFE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALAWZ\n" +
            "DTSTAMP:20230105T172011Z\n" +
            "DESCRIPTION:Event Name: Circle Up! Clipper Support Group<br>Organization\n" +
            " : CAMPUS ACTIVITIES BOARD\\, COUNSELING\\, STUDENT LIFE<br>Event Locator: \n" +
            " 2023-AALAWZ<br><br>&lt\\;p data-key=&quot\\;17&quot\\;&gt\\;&lt\\;span data-k\n" +
            " ey=&quot\\;18&quot\\;&gt\\;Circle Up!\\, our weekly community building and s\n" +
            " upport group\\, is back for Winter Quarter! Join us each Friday from 1-2:\n" +
            " 30 p.m. online via Zoom.<br>&lt\\;p data-key=&quot\\;19&quot\\;&gt\\;&lt\\;sp\n" +
            " an data-key=&quot\\;20&quot\\;&gt\\;Need a supportive\\, welcoming environme\n" +
            " nt to talk to? You are supported by the counselors at SPSCC. Join SPSCC \n" +
            " counselors Cass Manalastas and Sally Sharbaugh every Friday to connect w\n" +
            " ith fellow SPSCC students. You can join using Zoom meeting code 817-2277\n" +
            " -9244. Join here: <a href=\"https://spscc.zoom.us/j/81722779244\" data-key\n" +
            " =\"21\" target=\"_blank\" rel=\"noopener\">&lt\\;span data-key=&quot\\;22&quot\\;\n" +
            " &gt\\;https://spscc.zoom.us/j/81722779244</a><br>&lt\\;p data-key=&quot\\;2\n" +
            " 3&quot\\;&gt\\;&lt\\;span data-key=&quot\\;24&quot\\;&gt\\;Got questions? Emai\n" +
            " l us at <a href=\"mailto:studentlife@spscc.edu\" target=\"_blank\" rel=\"noop\n" +
            " ener\">studentlife@spscc.edu</a>.&#160\\;<br>&lt\\;p data-key=&quot\\;25&quo\n" +
            " t\\;&gt\\;&lt\\;span data-key=&quot\\;26&quot\\;&gt\\;&lt\\;em data-slate-leaf=\n" +
            " &quot\\;true&quot\\;&gt\\;&lt\\;strong data-slate-leaf=&quot\\;true&quot\\;&gt\n" +
            " \\;*TICKETS AND/OR REGISTRATION IS NOT REQUIRED FOR THIS EVENT! You can s\n" +
            " imply show up!*<br>&lt\\;p data-key=&quot\\;28&quot\\; data-slate-fragment=\n" +
            " &quot\\;JTdCJTIyb2JqZWN0JTIyJTNBJTIyZG9jdW1lbnQlMjIlMkMlMjJkYXRhJTIyJTNBJ\n" +
            " TdCJTdEJTJDJTIybm9kZXMlMjIlM0ElNUIlN0IlMjJvYmplY3QlMjIlM0ElMjJibG9jayUyM\n" +
            " iUyQyUyMnR5cGUlMjIlM0ElMjJwYXJhZ3JhcGglMjIlMkMlMjJkYXRhJTIyJTNBJTdCJTIyY\n" +
            " 2xhc3NOYW1lJTIyJTNBbnVsbCU3RCUyQyUyMm5vZGVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0J\n" +
            " TIyJTNBJTIydGV4dCUyMiUyQyUyMmxlYXZlcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQ\n" +
            " SUyMmxlYWYlMjIlMkMlMjJ0ZXh0JTIyJTNBJTIyQ2lyY2xlJTIwVXAhJTJDJTIwb3VyJTIwd\n" +
            " 2Vla2x5JTIwY29tbXVuaXR5JTIwYnVpbGRpbmclMjBhbmQlMjBzdXBwb3J0JTIwZ3JvdXAlM\n" +
            " kMlMjBpcyUyMGJhY2slMjBmb3IlMjBXaW50ZXIlMjBRdWFydGVyISUyMEpvaW4lMjB1cyUyM\n" +
            " GVhY2glMjBGcmlkYXklMjBmcm9tJTIwMS0yJTNBMzAlMjBwLm0uJTIwb25saW5lJTIwdmlhJ\n" +
            " TIwWm9vbS4lMjIlMkMlMjJtYXJrcyUyMiUzQSU1QiU1RCU3RCU1RCU3RCU1RCU3RCUyQyU3Q\n" +
            " iUyMm9iamVjdCUyMiUzQSUyMmJsb2NrJTIyJTJDJTIydHlwZSUyMiUzQSUyMnBhcmFncmFwa\n" +
            " CUyMiUyQyUyMmRhdGElMjIlM0ElN0IlMjJjbGFzc05hbWUlMjIlM0FudWxsJTdEJTJDJTIyb\n" +
            " m9kZXMlMjIlM0ElNUIlN0IlMjJvYmplY3QlMjIlM0ElMjJ0ZXh0JTIyJTJDJTIybGVhdmVzJ\n" +
            " TIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTIybGVhZiUyMiUyQyUyMnRleHQlMjIlM0ElM\n" +
            " jJOZWVkJTIwYSUyMHN1cHBvcnRpdmUlMkMlMjB3ZWxjb21pbmclMjBlbnZpcm9ubWVudCUyM\n" +
            " HRvJTIwdGFsayUyMHRvJTNGJTIwWW91JTIwYXJlJTIwc3VwcG9ydGVkJTIwYnklMjB0aGUlM\n" +
            " jBjb3Vuc2Vsb3JzJTIwYXQlMjBTUFNDQy4lMjBKb2luJTIwU1BTQ0MlMjBjb3Vuc2Vsb3JzJ\n" +
            " TIwQ2FzcyUyME1hbmFsYXN0YXMlMjBhbmQlMjBTYWxseSUyMFNoYXJiYXVnaCUyMGV2ZXJ5J\n" +
            " TIwRnJpZGF5JTIwdG8lMjBjb25uZWN0JTIwd2l0aCUyMGZlbGxvdyUyMFNQU0NDJTIwc3R1Z\n" +
            " GVudHMuJTIwWW91JTIwY2FuJTIwam9pbiUyMHVzaW5nJTIwWm9vbSUyMG1lZXRpbmclMjBjb\n" +
            " 2RlJTIwODE3LTIyNzctOTI0NC4lMjBKb2luJTIwaGVyZSUzQSUyMCUyMiUyQyUyMm1hcmtzJ\n" +
            " TIyJTNBJTVCJTVEJTdEJTVEJTdEJTJDJTdCJTIyb2JqZWN0JTIyJTNBJTIyaW5saW5lJTIyJ\n" +
            " TJDJTIydHlwZSUyMiUzQSUyMmxpbmslMjIlMkMlMjJkYXRhJTIyJTNBJTdCJTIyY2xhc3NOY\n" +
            " W1lJTIyJTNBbnVsbCUyQyUyMmhyZWYlMjIlM0ElMjJodHRwcyUzQSUyRiUyRnNwc2NjLnpvb\n" +
            " 20udXMlMkZqJTJGODE3MjI3NzkyNDQlMjIlN0QlMkMlMjJub2RlcyUyMiUzQSU1QiU3QiUyM\n" +
            " m9iamVjdCUyMiUzQSUyMnRleHQlMjIlMkMlMjJsZWF2ZXMlMjIlM0ElNUIlN0IlMjJvYmplY\n" +
            " 3QlMjIlM0ElMjJsZWFmJTIyJTJDJTIydGV4dCUyMiUzQSUyMmh0dHBzJTNBJTJGJTJGc3BzY\n" +
            " 2Muem9vbS51cyUyRmolMkY4MTcyMjc3OTI0NCUyMiUyQyUyMm1hcmtzJTIyJTNBJTVCJTVEJ\n" +
            " TdEJTVEJTdEJTVEJTdEJTJDJTdCJTIyb2JqZWN0JTIyJTNBJTIydGV4dCUyMiUyQyUyMmxlY\n" +
            " XZlcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMmxlYWYlMjIlMkMlMjJ0ZXh0JTIyJ\n" +
            " TNBJTIyJTIyJTJDJTIybWFya3MlMjIlM0ElNUIlNUQlN0QlNUQlN0QlNUQlN0QlMkMlN0IlM\n" +
            " jJvYmplY3QlMjIlM0ElMjJibG9jayUyMiUyQyUyMnR5cGUlMjIlM0ElMjJwYXJhZ3JhcGglM\n" +
            " jIlMkMlMjJkYXRhJTIyJTNBJTdCJTIyY2xhc3NOYW1lJTIyJTNBbnVsbCU3RCUyQyUyMm5vZ\n" +
            " GVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTIydGV4dCUyMiUyQyUyMmxlYXZlcyUyM\n" +
            " iUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMmxlYWYlMjIlMkMlMjJ0ZXh0JTIyJTNBJTIyR\n" +
            " 290JTIwcXVlc3Rpb25zJTNGJTIwRW1haWwlMjB1cyUyMGF0JTIwc3R1ZGVudGxpZmUlNDBzc\n" +
            " HNjYy5lZHUuJUMyJUEwJTIyJTJDJTIybWFya3MlMjIlM0ElNUIlNUQlN0QlNUQlN0QlNUQlN\n" +
            " 0QlMkMlN0IlMjJvYmplY3QlMjIlM0ElMjJibG9jayUyMiUyQyUyMnR5cGUlMjIlM0ElMjJwY\n" +
            " XJhZ3JhcGglMjIlMkMlMjJkYXRhJTIyJTNBJTdCJTIyY2xhc3NOYW1lJTIyJTNBbnVsbCU3R\n" +
            " CUyQyUyMm5vZGVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTIydGV4dCUyMiUyQyUyM\n" +
            " mxlYXZlcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMmxlYWYlMjIlMkMlMjJ0ZXh0J\n" +
            " TIyJTNBJTIyKlRJQ0tFVFMlMjBBTkQlMkZPUiUyMFJFR0lTVFJBVElPTiUyMElTJTIwTk9UJ\n" +
            " TIwUkVRVUlSRUQlMjBGT1IlMjBUSElTJTIwRVZFTlQhJTIwWW91JTIwY2FuJTIwc2ltcGx5J\n" +
            " TIwc2hvdyUyMHVwISolMjIlMkMlMjJtYXJrcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQ\n" +
            " SUyMm1hcmslMjIlMkMlMjJ0eXBlJTIyJTNBJTIyYm9sZCUyMiUyQyUyMmRhdGElMjIlM0ElN\n" +
            " 0IlN0QlN0QlMkMlN0IlMjJvYmplY3QlMjIlM0ElMjJtYXJrJTIyJTJDJTIydHlwZSUyMiUzQ\n" +
            " SUyMml0YWxpYyUyMiUyQyUyMmRhdGElMjIlM0ElN0IlN0QlN0QlNUQlN0QlNUQlN0QlNUQlN\n" +
            " 0QlMkMlN0IlMjJvYmplY3QlMjIlM0ElMjJibG9jayUyMiUyQyUyMnR5cGUlMjIlM0ElMjJwY\n" +
            " XJhZ3JhcGglMjIlMkMlMjJkYXRhJTIyJTNBJTdCJTIyY2xhc3NOYW1lJTIyJTNBbnVsbCU3R\n" +
            " CUyQyUyMm5vZGVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTIydGV4dCUyMiUyQyUyM\n" +
            " mxlYXZlcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMmxlYWYlMjIlMkMlMjJ0ZXh0J\n" +
            " TIyJTNBJTIyRm9yJTIwcmVhc29uYWJsZSUyMGFjY29tbW9kYXRpb24lMjByZXF1ZXN0cyUyQ\n" +
            " yUyMHBsZWFzZSUyMGNvbnRhY3QlMjBBY2Nlc3MlMjBTZXJ2aWNlcyUyMGF0JTIwYWNjZXNzL\n" +
            " nNlcnZpY2VzJTQwc3BzY2MuZWR1LiUyMiUyQyUyMm1hcmtzJTIyJTNBJTVCJTVEJTdEJTVEJ\n" +
            " TdEJTVEJTdEJTVEJTdE&quot\\;&gt\\;&lt\\;span data-key=&quot\\;29&quot\\;&gt\\;F\n" +
            " or reasonable accommodation requests\\, please contact Access Services at\n" +
            "  <a href=\"mailto:access.services@spscc.edu\" target=\"_blank\" rel=\"noopene\n" +
            " r\">access.services@spscc.edu</a>.<br>&lt\\;p data-key=&quot\\;28&quot\\; da\n" +
            " ta-slate-fragment=&quot\\;JTdCJTIyb2JqZWN0JTIyJTNBJTIyZG9jdW1lbnQlMjIlMkM\n" +
            " lMjJkYXRhJTIyJTNBJTdCJTdEJTJDJTIybm9kZXMlMjIlM0ElNUIlN0IlMjJvYmplY3QlMjI\n" +
            " lM0ElMjJibG9jayUyMiUyQyUyMnR5cGUlMjIlM0ElMjJwYXJhZ3JhcGglMjIlMkMlMjJkYXR\n" +
            " hJTIyJTNBJTdCJTIyY2xhc3NOYW1lJTIyJTNBbnVsbCU3RCUyQyUyMm5vZGVzJTIyJTNBJTV\n" +
            " CJTdCJTIyb2JqZWN0JTIyJTNBJTIydGV4dCUyMiUyQyUyMmxlYXZlcyUyMiUzQSU1QiU3QiU\n" +
            " yMm9iamVjdCUyMiUzQSUyMmxlYWYlMjIlMkMlMjJ0ZXh0JTIyJTNBJTIyQ2lyY2xlJTIwVXA\n" +
            " hJTJDJTIwb3VyJTIwd2Vla2x5JTIwY29tbXVuaXR5JTIwYnVpbGRpbmclMjBhbmQlMjBzdXB\n" +
            " wb3J0JTIwZ3JvdXAlMkMlMjBpcyUyMGJhY2slMjBmb3IlMjBXaW50ZXIlMjBRdWFydGVyISU\n" +
            " yMEpvaW4lMjB1cyUyMGVhY2glMjBGcmlkYXklMjBmcm9tJTIwMS0yJTNBMzAlMjBwLm0uJTI\n" +
            " wb25saW5lJTIwdmlhJTIwWm9vbS4lMjIlMkMlMjJtYXJrcyUyMiUzQSU1QiU1RCU3RCU1RCU\n" +
            " 3RCU1RCU3RCUyQyU3QiUyMm9iamVjdCUyMiUzQSUyMmJsb2NrJTIyJTJDJTIydHlwZSUyMiU\n" +
            " zQSUyMnBhcmFncmFwaCUyMiUyQyUyMmRhdGElMjIlM0ElN0IlMjJjbGFzc05hbWUlMjIlM0F\n" +
            " udWxsJTdEJTJDJTIybm9kZXMlMjIlM0ElNUIlN0IlMjJvYmplY3QlMjIlM0ElMjJ0ZXh0JTI\n" +
            " yJTJDJTIybGVhdmVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTIybGVhZiUyMiUyQyU\n" +
            " yMnRleHQlMjIlM0ElMjJOZWVkJTIwYSUyMHN1cHBvcnRpdmUlMkMlMjB3ZWxjb21pbmclMjB\n" +
            " lbnZpcm9ubWVudCUyMHRvJTIwdGFsayUyMHRvJTNGJTIwWW91JTIwYXJlJTIwc3VwcG9ydGV\n" +
            " kJTIwYnklMjB0aGUlMjBjb3Vuc2Vsb3JzJTIwYXQlMjBTUFNDQy4lMjBKb2luJTIwU1BTQ0M\n" +
            " lMjBjb3Vuc2Vsb3JzJTIwQ2FzcyUyME1hbmFsYXN0YXMlMjBhbmQlMjBTYWxseSUyMFNoYXJ\n" +
            " iYXVnaCUyMGV2ZXJ5JTIwRnJpZGF5JTIwdG8lMjBjb25uZWN0JTIwd2l0aCUyMGZlbGxvdyU\n" +
            " yMFNQU0NDJTIwc3R1ZGVudHMuJTIwWW91JTIwY2FuJTIwam9pbiUyMHVzaW5nJTIwWm9vbSU\n" +
            " yMG1lZXRpbmclMjBjb2RlJTIwODE3LTIyNzctOTI0NC4lMjBKb2luJTIwaGVyZSUzQSUyMCU\n" +
            " yMiUyQyUyMm1hcmtzJTIyJTNBJTVCJTVEJTdEJTVEJTdEJTJDJTdCJTIyb2JqZWN0JTIyJTN\n" +
            " BJTIyaW5saW5lJTIyJTJDJTIydHlwZSUyMiUzQSUyMmxpbmslMjIlMkMlMjJkYXRhJTIyJTN\n" +
            " BJTdCJTIyY2xhc3NOYW1lJTIyJTNBbnVsbCUyQyUyMmhyZWYlMjIlM0ElMjJodHRwcyUzQSU\n" +
            " yRiUyRnNwc2NjLnpvb20udXMlMkZqJTJGODE3MjI3NzkyNDQlMjIlN0QlMkMlMjJub2RlcyU\n" +
            " yMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMnRleHQlMjIlMkMlMjJsZWF2ZXMlMjIlM0E\n" +
            " lNUIlN0IlMjJvYmplY3QlMjIlM0ElMjJsZWFmJTIyJTJDJTIydGV4dCUyMiUzQSUyMmh0dHB\n" +
            " zJTNBJTJGJTJGc3BzY2Muem9vbS51cyUyRmolMkY4MTcyMjc3OTI0NCUyMiUyQyUyMm1hcmt\n" +
            " zJTIyJTNBJTVCJTVEJTdEJTVEJTdEJTVEJTdEJTJDJTdCJTIyb2JqZWN0JTIyJTNBJTIydGV\n" +
            " 4dCUyMiUyQyUyMmxlYXZlcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMmxlYWYlMjI\n" +
            " lMkMlMjJ0ZXh0JTIyJTNBJTIyJTIyJTJDJTIybWFya3MlMjIlM0ElNUIlNUQlN0QlNUQlN0Q\n" +
            " lNUQlN0QlMkMlN0IlMjJvYmplY3QlMjIlM0ElMjJibG9jayUyMiUyQyUyMnR5cGUlMjIlM0E\n" +
            " lMjJwYXJhZ3JhcGglMjIlMkMlMjJkYXRhJTIyJTNBJTdCJTIyY2xhc3NOYW1lJTIyJTNBbnV\n" +
            " sbCU3RCUyQyUyMm5vZGVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTIydGV4dCUyMiU\n" +
            " yQyUyMmxlYXZlcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMmxlYWYlMjIlMkMlMjJ\n" +
            " 0ZXh0JTIyJTNBJTIyR290JTIwcXVlc3Rpb25zJTNGJTIwRW1haWwlMjB1cyUyMGF0JTIwc3R\n" +
            " 1ZGVudGxpZmUlNDBzcHNjYy5lZHUuJUMyJUEwJTIyJTJDJTIybWFya3MlMjIlM0ElNUIlNUQ\n" +
            " lN0QlNUQlN0QlNUQlN0QlMkMlN0IlMjJvYmplY3QlMjIlM0ElMjJibG9jayUyMiUyQyUyMnR\n" +
            " 5cGUlMjIlM0ElMjJwYXJhZ3JhcGglMjIlMkMlMjJkYXRhJTIyJTNBJTdCJTIyY2xhc3NOYW1\n" +
            " lJTIyJTNBbnVsbCU3RCUyQyUyMm5vZGVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTI\n" +
            " ydGV4dCUyMiUyQyUyMmxlYXZlcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMmxlYWY\n" +
            " lMjIlMkMlMjJ0ZXh0JTIyJTNBJTIyKlRJQ0tFVFMlMjBBTkQlMkZPUiUyMFJFR0lTVFJBVEl\n" +
            " PTiUyMElTJTIwTk9UJTIwUkVRVUlSRUQlMjBGT1IlMjBUSElTJTIwRVZFTlQhJTIwWW91JTI\n" +
            " wY2FuJTIwc2ltcGx5JTIwc2hvdyUyMHVwISolMjIlMkMlMjJtYXJrcyUyMiUzQSU1QiU3QiU\n" +
            " yMm9iamVjdCUyMiUzQSUyMm1hcmslMjIlMkMlMjJ0eXBlJTIyJTNBJTIyYm9sZCUyMiUyQyU\n" +
            " yMmRhdGElMjIlM0ElN0IlN0QlN0QlMkMlN0IlMjJvYmplY3QlMjIlM0ElMjJtYXJrJTIyJTJ\n" +
            " DJTIydHlwZSUyMiUzQSUyMml0YWxpYyUyMiUyQyUyMmRhdGElMjIlM0ElN0IlN0QlN0QlNUQ\n" +
            " lN0QlNUQlN0QlNUQlN0QlMkMlN0IlMjJvYmplY3QlMjIlM0ElMjJibG9jayUyMiUyQyUyMnR\n" +
            " 5cGUlMjIlM0ElMjJwYXJhZ3JhcGglMjIlMkMlMjJkYXRhJTIyJTNBJTdCJTIyY2xhc3NOYW1\n" +
            " lJTIyJTNBbnVsbCU3RCUyQyUyMm5vZGVzJTIyJTNBJTVCJTdCJTIyb2JqZWN0JTIyJTNBJTI\n" +
            " ydGV4dCUyMiUyQyUyMmxlYXZlcyUyMiUzQSU1QiU3QiUyMm9iamVjdCUyMiUzQSUyMmxlYWY\n" +
            " lMjIlMkMlMjJ0ZXh0JTIyJTNBJTIyRm9yJTIwcmVhc29uYWJsZSUyMGFjY29tbW9kYXRpb24\n" +
            " lMjByZXF1ZXN0cyUyQyUyMHBsZWFzZSUyMGNvbnRhY3QlMjBBY2Nlc3MlMjBTZXJ2aWNlcyU\n" +
            " yMGF0JTIwYWNjZXNzLnNlcnZpY2VzJTQwc3BzY2MuZWR1LiUyMiUyQyUyMm1hcmtzJTIyJTN\n" +
            " BJTVCJTVEJTdEJTVEJTdEJTVEJTdEJTVEJTdE&quot\\;&gt\\;&lt\\;span data-key=&quo\n" +
            " t\\;29&quot\\;&gt\\;<img src=\"https://img.evbuc.com/https%3A%2F%2Fcdn.evbuc\n" +
            " .com%2Fimages%2F419131449%2F184710419038%2F1%2Foriginal.20230106-003850?\n" +
            " w=940&amp\\;auto=format%2Ccompress&amp\\;q=75&amp\\;sharp=10&amp\\;rect=0%2C\n" +
            " 0%2C1920%2C960&amp\\;s=35e3b480e5a5c49aae9573c37f5b8f77\" style=\"width:425\n" +
            " px\\;max-width:100%\\;\">\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/788059197\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d788059197\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Choir Concert: Folksong\n" +
            "LOCATION:Kenneth J. Minnaert Center for the Arts Main Stage (Bldg 21)\\, \n" +
            " Mottman Campus Building 21 Lobby Room 201\n" +
            "DTSTART;TZID=America/Los_Angeles:20230317T193000\n" +
            "DTEND;TZID=America/Los_Angeles:20230317T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Choir Co\n" +
            " ncert: Folksong\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:Music\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2021-\n" +
            " AAKMKA\n" +
            "DTSTAMP:20230313T105223Z\n" +
            "DESCRIPTION:Event Name: Choir Concert: Folksong<br>Organization: Music<b\n" +
            " r>Event Locator: 2021-AAKMKA<br><br><p>Under the direction of Dr. John G\n" +
            " uarente\\, the SPSCC Choirs present an eclectic evening of folk music fro\n" +
            " m different traditions\\, including songs from the African\\, Asian\\, Euro\n" +
            " pean\\, and Pacific Island diasporas in <em>Folksong</em>. The concert wi\n" +
            " ll take place on March 17 at 7:30 p.m.</p> <p>The concert is free for al\n" +
            " l SPSCC students\\, staff &amp\\; faculty and a suggested $15 donation at \n" +
            " the door for the community.</p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/745403891\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d745403891\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Orchestra Concert: Vows &amp\\; Chorales\n" +
            "LOCATION:Kenneth J. Minnaert Center for the Arts Main Stage (Bldg 21)\\, \n" +
            " Mottman Campus Building 21 Lobby Room 201\n" +
            "DTSTART;TZID=America/Los_Angeles:20230318T193000\n" +
            "DTEND;TZID=America/Los_Angeles:20230318T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Orchestr\n" +
            " a Concert: Vows &amp\\; Chorales\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:Music\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2021-\n" +
            " AAKMKB\n" +
            "DTSTAMP:20230313T105223Z\n" +
            "DESCRIPTION:Event Name: Orchestra Concert: Vows & Chorales<br>Organizati\n" +
            " on: Music<br>Event Locator: 2021-AAKMKB<br><br><p>The SPSCC Symphony Orc\n" +
            " hestra presents&#160\\;<em>Vows &amp\\; Chorales</em>&#160\\;on March 18 at\n" +
            "  7:30 p.m. To open the concert\\, members of the orchestra will perform B\n" +
            " ach chorales in small groups. The concert will feature Anton&#237\\;n Dvo\n" +
            " r&#225\\;k&#8217\\;s cheerfully optimistic Symphony No. 8\\, which depicts \n" +
            " bird calls\\, tranquil landscapes\\, a small village band\\, and several Bo\n" +
            " hemian folk dances and melodies. Also featured is the first SPSCC studen\n" +
            " t to solo with the orchestra: Bassist Jordan Pilla will take center stag\n" +
            " e\\, playing Max Bruch&#8217\\;s&#160\\;<em>Kol Nidrei</em>.</p> <p>&#160\\;\n" +
            " </p> <p>The concert is free for all SPSCC students\\, staff &amp\\; facult\n" +
            " y and a suggested $15 donation at the door for the community.</p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/745403892\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d745403892\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Self-Care Workshop\n" +
            "LOCATION:Mottman Campus Building 22 Room 270\n" +
            "DTSTART;TZID=America/Los_Angeles:20230413T150000\n" +
            "DTEND;TZID=America/Los_Angeles:20230413T160000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Training / Prof\n" +
            " essional Development / Workshop\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Self-Car\n" +
            " e Workshops\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DIVERS\n" +
            " ITY AND EQUITY\\, COUNSELING\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Categories\";ID=12013;TYPE=SingleLine:Quarter \n" +
            " - Winter\\, Diversity &amp\\; Equity Center\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALCTH\n" +
            "DTSTAMP:20230207T101344Z\n" +
            "DESCRIPTION:Event Name: Self-Care Workshops<br>Organization: DIVERSITY A\n" +
            " ND EQUITY\\, COUNSELING<br>Categories: Quarter - Winter\\, Diversity & Equ\n" +
            " ity Center<br>Event Locator: 2023-AALCTH<br><br><p style=\"text-align: ce\n" +
            " nter\\;\"><strong>Self-Care Workshop</strong></p> <p style=\"text-align: ce\n" +
            " nter\\;\"><strong>Hosted by Daphne Rasche\\, Peer Mentor\\, and IGNITE stude\n" +
            " nt and</strong></p> <p style=\"text-align: center\\;\"><strong>Sally Sharba\n" +
            " ugh\\, Faculty/Mental Health Counselor</strong></p> <p>Please join us for\n" +
            "  the first in a series of Self-care Workshops co-hosted by DEIC and Coun\n" +
            " seling Services.&#160\\; In this workshop\\, Daphne and Sally will share s\n" +
            " tories of how mindfulness meditation helped them during particularly dif\n" +
            " ficult times.&#160\\; We&#8217\\;ll guide students through simple practica\n" +
            " l mindfulness strategies to reduce stress.&#160\\; We will also dispel so\n" +
            " me myths about mindfulness and ground our time together by highlighting \n" +
            " contemporary practices for BIPOC communities and BIPOC meditation teache\n" +
            " rs.&#160\\; This is a great workshop for the &#8220\\;mindful curious&#822\n" +
            " 1\\; or those who want to learn more about mindfulness through a diversit\n" +
            " y and equity lens.&#160\\; Open to students\\, staff\\, and faculty.</p> <p\n" +
            " >We will offer Self-care workshops on the second Thursday of each month \n" +
            " so mark your calendars for future dates:&#160\\; March 9\\, April 13\\, and\n" +
            "  May 11</p>\n" +
            "CATEGORIES:DEC Calendar\n" +
            "GEO:47.02288;-122.9305\n" +
            "UID:http://uid.trumba.com/event/816928317\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d816928317\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Self-Care Workshop\n" +
            "LOCATION:Mottman Campus Building 22 Room 270\n" +
            "DTSTART;TZID=America/Los_Angeles:20230413T150000\n" +
            "DTEND;TZID=America/Los_Angeles:20230413T160000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Training / Prof\n" +
            " essional Development / Workshop\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Self-Car\n" +
            " e Workshops\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DIVERS\n" +
            " ITY AND EQUITY\\, COUNSELING\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Categories\";ID=12013;TYPE=SingleLine:Quarter \n" +
            " - Winter\\, Diversity &amp\\; Equity Center\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALCTH\n" +
            "DTSTAMP:20230207T101353Z\n" +
            "DESCRIPTION:Event Name: Self-Care Workshops<br>Organization: DIVERSITY A\n" +
            " ND EQUITY\\, COUNSELING<br>Categories: Quarter - Winter\\, Diversity & Equ\n" +
            " ity Center<br>Event Locator: 2023-AALCTH<br><br><p style=\"text-align: ce\n" +
            " nter\\;\"><strong>Self-Care Workshop</strong></p> <p style=\"text-align: ce\n" +
            " nter\\;\"><strong>Hosted by Daphne Rasche\\, Peer Mentor\\, and IGNITE stude\n" +
            " nt and</strong></p> <p style=\"text-align: center\\;\"><strong>Sally Sharba\n" +
            " ugh\\, Faculty/Mental Health Counselor</strong></p> <p>Please join us for\n" +
            "  the first in a series of Self-care Workshops co-hosted by DEIC and Coun\n" +
            " seling Services.&#160\\; In this workshop\\, Daphne and Sally will share s\n" +
            " tories of how mindfulness meditation helped them during particularly dif\n" +
            " ficult times.&#160\\; We&#8217\\;ll guide students through simple practica\n" +
            " l mindfulness strategies to reduce stress.&#160\\; We will also dispel so\n" +
            " me myths about mindfulness and ground our time together by highlighting \n" +
            " contemporary practices for BIPOC communities and BIPOC meditation teache\n" +
            " rs.&#160\\; This is a great workshop for the &#8220\\;mindful curious&#822\n" +
            " 1\\; or those who want to learn more about mindfulness through a diversit\n" +
            " y and equity lens.&#160\\; Open to students\\, staff\\, and faculty.</p> <p\n" +
            " >We will offer Self-care workshops on the second Thursday of each month \n" +
            " so mark your calendars for future dates:&#160\\; March 9\\, April 13\\, and\n" +
            "  May 11</p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "GEO:47.02288;-122.9305\n" +
            "UID:http://uid.trumba.com/event/817009877\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d817009877\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Safe Zone Training: Spring 2023\n" +
            "DTSTART;TZID=America/Los_Angeles:20230414T130000\n" +
            "DTEND;TZID=America/Los_Angeles:20230414T143000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Training / Prof\n" +
            " essional Development / Workshop\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:SAFE ZON\n" +
            " E TRAINING: SPRING 2023\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DIVERS\n" +
            " ITY AND EQUITY\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Categories\";ID=12013;TYPE=SingleLine:Diversit\n" +
            " y &amp\\; Equity Center\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Web Site\";ID=12014;TYPE=Url:<a href=\"https://\n" +
            " spscc.edu/student-life/diversity-center\" target=\"_blank\" rel=\"noopener\" \n" +
            " title=\"https://spscc.edu/student-life/diversity-center\">spscc.edu&#8230\n" +
            " \\;</a>\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALBCJ\n" +
            "DTSTAMP:20230112T231117Z\n" +
            "DESCRIPTION:Event Name: SAFE ZONE TRAINING: SPRING 2023<br>Organization:\n" +
            "  DIVERSITY AND EQUITY<br>Categories: Diversity & Equity Center<br>Web Si\n" +
            " te: https://spscc.edu/student-life/diversity-center<br>Event Locator: 20\n" +
            " 23-AALBCJ<br><br><p>Becoming a Safe Zone participant is voluntary and re\n" +
            " quires a serious commitment\\, please attend with a learning mindset.&#16\n" +
            " 0\\;</p> <p><strong><a href=\"https://app.smartsheet.com/b/form/beeff88640\n" +
            " 5f4424b9c90872f89deb36\" target=\"_blank\" rel=\"noopener\">Sign up for this \n" +
            " session &amp\\; future sessions here.&#160\\;</a></strong></p>\n" +
            "CATEGORIES:DEC Calendar\n" +
            "UID:http://uid.trumba.com/event/793459019\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d793459019\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Monthly Brown Bag Discussion\n" +
            "LOCATION:Mottman Campus Building 22 Room 270\n" +
            "DTSTART;TZID=America/Los_Angeles:20230419T120000\n" +
            "DTEND;TZID=America/Los_Angeles:20230419T130000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Training / Prof\n" +
            " essional Development / Workshop\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Monthly \n" +
            " Brown Bag Discussion\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DIVERS\n" +
            " ITY AND EQUITY\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Categories\";ID=12013;TYPE=SingleLine:Diversit\n" +
            " y &amp\\; Equity Center\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Web Site\";ID=12014;TYPE=Url:<a href=\"https://\n" +
            " www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content\n" +
            " =DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_source=publish\n" +
            " sharelink\" target=\"_blank\" rel=\"noopener\" title=\"https://www.canva.com/d\n" +
            " esign/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content=DAFXgm7WKEQ&ut\n" +
            " m_campaign=designshare&utm_medium=link&utm_source=publishsharelink\">www.\n" +
            " canva.com&#8230\\;</a>\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALDNB\n" +
            "DTSTAMP:20230303T104443Z\n" +
            "DESCRIPTION:Event Name: Monthly Brown Bag Discussion<br>Organization: DI\n" +
            " VERSITY AND EQUITY<br>Categories: Diversity & Equity Center<br>Web Site:\n" +
            "  https://www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?ut\n" +
            " m_content=DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_sourc\n" +
            " e=publishsharelink<br>Event Locator: 2023-AALDNB<br><br><p><span>Join us\n" +
            "  in exchanging and hearing various perspectives and lived experiences in\n" +
            "  a safe and respectful space. Each month the topic changes! <strong>No r\n" +
            " egistration is required.</strong></span></p>\n" +
            "CATEGORIES:DEC Calendar\n" +
            "GEO:47.02288;-122.9305\n" +
            "UID:http://uid.trumba.com/event/834144945\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d834144945\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Monthly Brown Bag Discussion\n" +
            "LOCATION:Mottman Campus Building 22 Room 270\n" +
            "DTSTART;TZID=America/Los_Angeles:20230419T120000\n" +
            "DTEND;TZID=America/Los_Angeles:20230419T130000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Training / Prof\n" +
            " essional Development / Workshop\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Monthly \n" +
            " Brown Bag Discussion\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DIVERS\n" +
            " ITY AND EQUITY\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Categories\";ID=12013;TYPE=SingleLine:Diversit\n" +
            " y &amp\\; Equity Center\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Web Site\";ID=12014;TYPE=Url:<a href=\"https://\n" +
            " www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content\n" +
            " =DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_source=publish\n" +
            " sharelink\" target=\"_blank\" rel=\"noopener\" title=\"https://www.canva.com/d\n" +
            " esign/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content=DAFXgm7WKEQ&ut\n" +
            " m_campaign=designshare&utm_medium=link&utm_source=publishsharelink\">www.\n" +
            " canva.com&#8230\\;</a>\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALDNB\n" +
            "DTSTAMP:20230303T104457Z\n" +
            "DESCRIPTION:Event Name: Monthly Brown Bag Discussion<br>Organization: DI\n" +
            " VERSITY AND EQUITY<br>Categories: Diversity & Equity Center<br>Web Site:\n" +
            "  https://www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?ut\n" +
            " m_content=DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_sourc\n" +
            " e=publishsharelink<br>Event Locator: 2023-AALDNB<br><br><p><span>Join us\n" +
            "  in exchanging and hearing various perspectives and lived experiences in\n" +
            "  a safe and respectful space. Each month the topic changes! <strong>No r\n" +
            " egistration is required.</strong></span></p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "GEO:47.02288;-122.9305\n" +
            "UID:http://uid.trumba.com/event/835824585\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d835824585\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Monthly Brown Bag Discussion\n" +
            "LOCATION:Mottman Campus Building 22 Room 270\n" +
            "DTSTART;TZID=America/Los_Angeles:20230517T120000\n" +
            "DTEND;TZID=America/Los_Angeles:20230517T130000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Training / Prof\n" +
            " essional Development / Workshop\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Monthly \n" +
            " Brown Bag Discussion\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DIVERS\n" +
            " ITY AND EQUITY\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Categories\";ID=12013;TYPE=SingleLine:Diversit\n" +
            " y &amp\\; Equity Center\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Web Site\";ID=12014;TYPE=Url:<a href=\"https://\n" +
            " www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content\n" +
            " =DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_source=publish\n" +
            " sharelink\" target=\"_blank\" rel=\"noopener\" title=\"https://www.canva.com/d\n" +
            " esign/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content=DAFXgm7WKEQ&ut\n" +
            " m_campaign=designshare&utm_medium=link&utm_source=publishsharelink\">www.\n" +
            " canva.com&#8230\\;</a>\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALDNB\n" +
            "DTSTAMP:20230303T104443Z\n" +
            "DESCRIPTION:Event Name: Monthly Brown Bag Discussion<br>Organization: DI\n" +
            " VERSITY AND EQUITY<br>Categories: Diversity & Equity Center<br>Web Site:\n" +
            "  https://www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?ut\n" +
            " m_content=DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_sourc\n" +
            " e=publishsharelink<br>Event Locator: 2023-AALDNB<br><br><p><span>Join us\n" +
            "  in exchanging and hearing various perspectives and lived experiences in\n" +
            "  a safe and respectful space. Each month the topic changes! <strong>No r\n" +
            " egistration is required.</strong></span></p>\n" +
            "CATEGORIES:DEC Calendar\n" +
            "GEO:47.02288;-122.9305\n" +
            "UID:http://uid.trumba.com/event/834144947\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d834144947\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Monthly Brown Bag Discussion\n" +
            "LOCATION:Mottman Campus Building 22 Room 270\n" +
            "DTSTART;TZID=America/Los_Angeles:20230517T120000\n" +
            "DTEND;TZID=America/Los_Angeles:20230517T130000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Training / Prof\n" +
            " essional Development / Workshop\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Monthly \n" +
            " Brown Bag Discussion\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DIVERS\n" +
            " ITY AND EQUITY\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Categories\";ID=12013;TYPE=SingleLine:Diversit\n" +
            " y &amp\\; Equity Center\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Web Site\";ID=12014;TYPE=Url:<a href=\"https://\n" +
            " www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content\n" +
            " =DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_source=publish\n" +
            " sharelink\" target=\"_blank\" rel=\"noopener\" title=\"https://www.canva.com/d\n" +
            " esign/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content=DAFXgm7WKEQ&ut\n" +
            " m_campaign=designshare&utm_medium=link&utm_source=publishsharelink\">www.\n" +
            " canva.com&#8230\\;</a>\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALDNB\n" +
            "DTSTAMP:20230303T104457Z\n" +
            "DESCRIPTION:Event Name: Monthly Brown Bag Discussion<br>Organization: DI\n" +
            " VERSITY AND EQUITY<br>Categories: Diversity & Equity Center<br>Web Site:\n" +
            "  https://www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?ut\n" +
            " m_content=DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_sourc\n" +
            " e=publishsharelink<br>Event Locator: 2023-AALDNB<br><br><p><span>Join us\n" +
            "  in exchanging and hearing various perspectives and lived experiences in\n" +
            "  a safe and respectful space. Each month the topic changes! <strong>No r\n" +
            " egistration is required.</strong></span></p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "GEO:47.02288;-122.9305\n" +
            "UID:http://uid.trumba.com/event/835824586\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d835824586\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Theatre: Sunday in the Park with George\n" +
            "LOCATION:Kenneth J. Minnaert Center for the Arts Main Stage (Bldg 21)\\, \n" +
            " Mottman Campus Building 21 Lobby Room 201\\, Mottman Campus Building 21 R\n" +
            " oom 263 Dressing Room A\\, Mottman Campus Building 21 Room 266 Dressing R\n" +
            " oom B\\, Mottman Campus Building 21 Green Room 269\n" +
            "DTSTART;TZID=America/Los_Angeles:20230526T193000\n" +
            "DTEND;TZID=America/Los_Angeles:20230526T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Theatre:\n" +
            "  Sunday in the Park with George\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DRAMA\n" +
            "DTSTAMP:20221027T124224Z\n" +
            "DESCRIPTION:Event Name: Theatre: Sunday in the Park with George<br>Organ\n" +
            " ization: DRAMA<br>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/745403893\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d745403893\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Theatre: Sunday in the Park with George\n" +
            "LOCATION:Kenneth J. Minnaert Center for the Arts Main Stage (Bldg 21)\\, \n" +
            " Mottman Campus Building 21 Lobby Room 201\\, Mottman Campus Building 21 R\n" +
            " oom 263 Dressing Room A\\, Mottman Campus Building 21 Room 266 Dressing R\n" +
            " oom B\\, Mottman Campus Building 21 Green Room 269\n" +
            "DTSTART;TZID=America/Los_Angeles:20230527T193000\n" +
            "DTEND;TZID=America/Los_Angeles:20230527T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Theatre:\n" +
            "  Sunday in the Park with George\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DRAMA\n" +
            "DTSTAMP:20221027T124224Z\n" +
            "DESCRIPTION:Event Name: Theatre: Sunday in the Park with George<br>Organ\n" +
            " ization: DRAMA<br>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/745403894\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d745403894\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Closed for Holiday\n" +
            "DTSTART;TZID=America/Los_Angeles:20230529T000000\n" +
            "DTEND;TZID=America/Los_Angeles:20230529T233000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Calendar Announ\n" +
            " cement\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Closed f\n" +
            " or Holiday\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:PUBLIC\n" +
            "  RELATIONS\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2022-\n" +
            " AALAFZ\n" +
            "DTSTAMP:20230118T134632Z\n" +
            "DESCRIPTION:Event Name: Closed for Holiday<br>Organization: PUBLIC RELAT\n" +
            " IONS<br>Event Locator: 2022-AALAFZ<br><br><p>SPSCC is closed on May 29th\n" +
            "  for Memorial Day.</p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/775018072\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d775018072\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Theatre: Sunday in the Park with George\n" +
            "LOCATION:Kenneth J. Minnaert Center for the Arts Main Stage (Bldg 21)\\, \n" +
            " Mottman Campus Building 21 Lobby Room 201\\, Mottman Campus Building 21 R\n" +
            " oom 263 Dressing Room A\\, Mottman Campus Building 21 Room 266 Dressing R\n" +
            " oom B\\, Mottman Campus Building 21 Green Room 269\n" +
            "DTSTART;TZID=America/Los_Angeles:20230602T193000\n" +
            "DTEND;TZID=America/Los_Angeles:20230602T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Theatre:\n" +
            "  Sunday in the Park with George\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DRAMA\n" +
            "DTSTAMP:20221027T124224Z\n" +
            "DESCRIPTION:Event Name: Theatre: Sunday in the Park with George<br>Organ\n" +
            " ization: DRAMA<br>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/745403895\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d745403895\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Theatre: Sunday in the Park with George\n" +
            "LOCATION:Kenneth J. Minnaert Center for the Arts Main Stage (Bldg 21)\\, \n" +
            " Mottman Campus Building 21 Lobby Room 201\\, Mottman Campus Building 21 R\n" +
            " oom 263 Dressing Room A\\, Mottman Campus Building 21 Room 266 Dressing R\n" +
            " oom B\\, Mottman Campus Building 21 Green Room 269\n" +
            "DTSTART;TZID=America/Los_Angeles:20230603T193000\n" +
            "DTEND;TZID=America/Los_Angeles:20230603T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Theatre:\n" +
            "  Sunday in the Park with George\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DRAMA\n" +
            "DTSTAMP:20221027T124224Z\n" +
            "DESCRIPTION:Event Name: Theatre: Sunday in the Park with George<br>Organ\n" +
            " ization: DRAMA<br>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/745403896\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d745403896\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:IGNITE &amp\\; Black Scholars End of Year Celebration 22-23\n" +
            "LOCATION:Percival Dining Room (Bldg 27)\\, Student Union Building Commons\n" +
            "  (Bldg 27)\\, Mottman Campus Building 27 Room 113\\, Mottman Campus Buildi\n" +
            " ng 27 Room 114\\, Gaming Room (Bldg 27)\\, Mottman Campus Building 27 Room\n" +
            "  119\\, Student Union Building Cafeteria (Bldg 27)\\,&#8230\\;\n" +
            "DTSTART;TZID=America/Los_Angeles:20230607T120000\n" +
            "DTEND;TZID=America/Los_Angeles:20230607T133000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Banquet\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:IGNITE/B\n" +
            " SP End of Year Celebration\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DIVERS\n" +
            " ITY AND EQUITY\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Categories\";ID=12013;TYPE=SingleLine:Diversit\n" +
            " y &amp\\; Equity Center\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Web Site\";ID=12014;TYPE=Url:<a href=\"https://\n" +
            " spscc.zoom.us/j/89332747365\" target=\"_blank\" rel=\"noopener\" title=\"https\n" +
            " ://spscc.zoom.us/j/89332747365\">spscc.zoom.us&#8230\\;</a>\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2022-\n" +
            " AAKXXN\n" +
            "DTSTAMP:20230125T075215Z\n" +
            "DESCRIPTION:Event Name: IGNITE/BSP End of Year Celebration<br>Organizati\n" +
            " on: DIVERSITY AND EQUITY<br>Categories: Diversity & Equity Center<br>Web\n" +
            "  Site: https://spscc.zoom.us/j/89332747365<br>Event Locator: 2022-AAKXXN\n" +
            " <br><br><p><strong>The Office of Diversity &amp\\; Equity would like to c\n" +
            " elebrate our <a href=\"https://spscc.edu/student-life/diversity-center\" t\n" +
            " arget=\"_blank\" rel=\"noopener\">IGNITE &amp\\; Black Scholar</a> students a\n" +
            " nd their accomplishments within the 2022-2023 Academic Year.&#160\\;</str\n" +
            " ong><em>All students\\, faculty\\, and staff are welcome to join us! </em>\n" +
            " </p> <p><u>Here&#8217\\;s what you can expect: </u></p><br><ul> <li>A mes\n" +
            " sage from Dr. Stokes<br></li><li>IGNITE/BSP Student Speakers<br></li><li\n" +
            " >Award Ceremony for Faculty &amp\\; Students<br></li><li>&amp\\; more&#823\n" +
            " 0\\;!<br></li></ul><br><p>Seeing our students reach their goals represent\n" +
            " s the collective efforts of our campus community!</p>\n" +
            "CATEGORIES:DEC Calendar\n" +
            "UID:http://uid.trumba.com/event/736722456\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d736722456\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Jazz Concert: Jazzed Up for Summer\n" +
            "LOCATION:Kenneth J. Minnaert Center for the Arts Main Stage (Bldg 21)\\, \n" +
            " Mottman Campus Building 21 Lobby Room 201\n" +
            "DTSTART;TZID=America/Los_Angeles:20230613T193000\n" +
            "DTEND;TZID=America/Los_Angeles:20230613T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Jazz Con\n" +
            " cert: Jazzed Up for Summer\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:Music\n" +
            "DTSTAMP:20221027T124224Z\n" +
            "DESCRIPTION:Event Name: Jazz Concert: Jazzed Up for Summer<br>Organizati\n" +
            " on: Music<br><br><p>The SPSCC Jazz Ensembles\\, under the direction of Br\n" +
            " ad Schrandt\\, present an evening concert featuring both large group and \n" +
            " small group ensembles performing selections showcasing songs to get you \n" +
            " jazzed for summer.</p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/745403897\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d745403897\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:2023 Commencement Ceremony\n" +
            "DTSTART;TZID=America/Los_Angeles:20230617T100000\n" +
            "DTEND;TZID=America/Los_Angeles:20230617T120000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Ceremony\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:2023 Com\n" +
            " mencement Ceremony\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:PUBLIC\n" +
            "  RELATIONS\\, STUDENT ENGAGEMENT\\, STUDENT LIFE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALCVW\n" +
            "DTSTAMP:20230308T161532Z\n" +
            "DESCRIPTION:Event Name: 2023 Commencement Ceremony<br>Organization: PUBL\n" +
            " IC RELATIONS\\, STUDENT ENGAGEMENT\\, STUDENT LIFE<br>Event Locator: 2023-\n" +
            " AALCVW<br><br><p><strong>The 58th SPSCC Commencement Ceremony will be he\n" +
            " ld on June 17\\, 2023\\, at 10 a.m. at The Evergreen State College&#39\\;s \n" +
            " Red Square.</strong></p> <p>No tickets are required to attend this event\n" +
            " .</p> <p><strong>Find more information on the <a href=\"https://spscc.edu\n" +
            " /graduation\" target=\"_blank\" rel=\"noopener\">Commencement webpage</a>.</s\n" +
            " trong></p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/818745923\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d818745923\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Closed for Holiday\n" +
            "DTSTART;TZID=America/Los_Angeles:20230619T000000\n" +
            "DTEND;TZID=America/Los_Angeles:20230619T233000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Calendar Announ\n" +
            " cement\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Closed f\n" +
            " or Holiday\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:PUBLIC\n" +
            "  RELATIONS\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2022-\n" +
            " AALAGA\n" +
            "DTSTAMP:20230118T134632Z\n" +
            "DESCRIPTION:Event Name: Closed for Holiday<br>Organization: PUBLIC RELAT\n" +
            " IONS<br>Event Locator: 2022-AALAGA<br><br><p>SPSCC is closed on June 19t\n" +
            " h for Juneteenth.</p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/775018073\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d775018073\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Monthly Brown Bag Discussion\n" +
            "LOCATION:Mottman Campus Building 22 Room 270\n" +
            "DTSTART;TZID=America/Los_Angeles:20230621T120000\n" +
            "DTEND;TZID=America/Los_Angeles:20230621T130000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Training / Prof\n" +
            " essional Development / Workshop\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Monthly \n" +
            " Brown Bag Discussion\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DIVERS\n" +
            " ITY AND EQUITY\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Categories\";ID=12013;TYPE=SingleLine:Diversit\n" +
            " y &amp\\; Equity Center\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Web Site\";ID=12014;TYPE=Url:<a href=\"https://\n" +
            " www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content\n" +
            " =DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_source=publish\n" +
            " sharelink\" target=\"_blank\" rel=\"noopener\" title=\"https://www.canva.com/d\n" +
            " esign/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content=DAFXgm7WKEQ&ut\n" +
            " m_campaign=designshare&utm_medium=link&utm_source=publishsharelink\">www.\n" +
            " canva.com&#8230\\;</a>\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALDNB\n" +
            "DTSTAMP:20230303T104443Z\n" +
            "DESCRIPTION:Event Name: Monthly Brown Bag Discussion<br>Organization: DI\n" +
            " VERSITY AND EQUITY<br>Categories: Diversity & Equity Center<br>Web Site:\n" +
            "  https://www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?ut\n" +
            " m_content=DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_sourc\n" +
            " e=publishsharelink<br>Event Locator: 2023-AALDNB<br><br><p><span>Join us\n" +
            "  in exchanging and hearing various perspectives and lived experiences in\n" +
            "  a safe and respectful space. Each month the topic changes! <strong>No r\n" +
            " egistration is required.</strong></span></p>\n" +
            "CATEGORIES:DEC Calendar\n" +
            "GEO:47.02288;-122.9305\n" +
            "UID:http://uid.trumba.com/event/834144948\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d834144948\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Monthly Brown Bag Discussion\n" +
            "LOCATION:Mottman Campus Building 22 Room 270\n" +
            "DTSTART;TZID=America/Los_Angeles:20230621T120000\n" +
            "DTEND;TZID=America/Los_Angeles:20230621T130000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Training / Prof\n" +
            " essional Development / Workshop\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Monthly \n" +
            " Brown Bag Discussion\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:DIVERS\n" +
            " ITY AND EQUITY\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Categories\";ID=12013;TYPE=SingleLine:Diversit\n" +
            " y &amp\\; Equity Center\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Web Site\";ID=12014;TYPE=Url:<a href=\"https://\n" +
            " www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content\n" +
            " =DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_source=publish\n" +
            " sharelink\" target=\"_blank\" rel=\"noopener\" title=\"https://www.canva.com/d\n" +
            " esign/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?utm_content=DAFXgm7WKEQ&ut\n" +
            " m_campaign=designshare&utm_medium=link&utm_source=publishsharelink\">www.\n" +
            " canva.com&#8230\\;</a>\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2023-\n" +
            " AALDNB\n" +
            "DTSTAMP:20230303T104457Z\n" +
            "DESCRIPTION:Event Name: Monthly Brown Bag Discussion<br>Organization: DI\n" +
            " VERSITY AND EQUITY<br>Categories: Diversity & Equity Center<br>Web Site:\n" +
            "  https://www.canva.com/design/DAFXgm7WKEQ/vUxX5Jyk8rJNnTCd_03VLw/view?ut\n" +
            " m_content=DAFXgm7WKEQ&utm_campaign=designshare&utm_medium=link&utm_sourc\n" +
            " e=publishsharelink<br>Event Locator: 2023-AALDNB<br><br><p><span>Join us\n" +
            "  in exchanging and hearing various perspectives and lived experiences in\n" +
            "  a safe and respectful space. Each month the topic changes! <strong>No r\n" +
            " egistration is required.</strong></span></p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "GEO:47.02288;-122.9305\n" +
            "UID:http://uid.trumba.com/event/835824587\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d835824587\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Closed for Holiday\n" +
            "DTSTART;TZID=America/Los_Angeles:20230704T000000\n" +
            "DTEND;TZID=America/Los_Angeles:20230704T233000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Calendar Announ\n" +
            " cement\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Closed f\n" +
            " or Holiday\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:PUBLIC\n" +
            "  RELATIONS\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2022-\n" +
            " AALAGB\n" +
            "DTSTAMP:20230118T134633Z\n" +
            "DESCRIPTION:Event Name: Closed for Holiday<br>Organization: PUBLIC RELAT\n" +
            " IONS<br>Event Locator: 2022-AALAGB<br><br><p>SPSCC is closed on July 4th\n" +
            "  for Independence Day.</p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/775018074\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d775018074\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Closed for Holiday\n" +
            "DTSTART;TZID=America/Los_Angeles:20230904T000000\n" +
            "DTEND;TZID=America/Los_Angeles:20230904T233000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Calendar Announ\n" +
            " cement\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=12008;TYPE=SingleLine:Closed f\n" +
            " or Holiday\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=12010;TYPE=SingleLine:PUBLIC\n" +
            "  RELATIONS\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25502;TYPE=SingleLine:2022-\n" +
            " AALAGC\n" +
            "DTSTAMP:20230118T134633Z\n" +
            "DESCRIPTION:Event Name: Closed for Holiday<br>Organization: PUBLIC RELAT\n" +
            " IONS<br>Event Locator: 2022-AALAGC<br><br><p>SPSCC is closed on Septembe\n" +
            " r 4th for Labor Day.</p>\n" +
            "CATEGORIES:Calendar - Student Life\n" +
            "UID:http://uid.trumba.com/event/775018075\n" +
            "X-TRUMBA-LINK:https://spscc.edu/student-life?trumbaEmbed=view%3devent%26\n" +
            " eventid%3d775018075\n" +
            "END:VEVENT\n" +
            "END:VCALENDAR\n";
}
