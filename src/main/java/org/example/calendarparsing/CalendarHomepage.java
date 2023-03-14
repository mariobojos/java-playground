package org.example.calendarparsing;

public class CalendarHomepage {
    public static String HOMEPAGE_CALENDAR_RESOURCES = "BEGIN:VCALENDAR\n" +
            "PRODID:-//Trumba Corporation//Trumba Calendar Services 0.11.21309//EN\n" +
            "VERSION:2.0\n" +
            "CALSCALE:GREGORIAN\n" +
            "X-WR-CALNAME:Homepage Calendar Resource\n" +
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
            "SUMMARY:Winter 2023 Semester Important Dates\n" +
            "DTSTART;TZID=America/New_York:20230317T080000\n" +
            "DTEND;TZID=America/New_York:20230317T225900\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:RO_Calendar\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=4665;TYPE=SingleLine:23/WI Imp\n" +
            " ortant Dates\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:REGISTRA\n" +
            " R\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACJPCJ\n" +
            "DTSTAMP:20230310T092137Z\n" +
            "DESCRIPTION:Event Name: 23/WI Important Dates<br>Event State: Confirmed<\n" +
            " br>Organization: REGISTRAR<br>Event Locator: 2022-ACJPCJ<br><br>Last Day\n" +
            "  to Withdraw with a &quot\\;&quot\\;W&quot\\;&quot\\; Grade\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/578526432\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d578526432\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Dinner and Gallery talk with Lynn Boland\n" +
            "LOCATION:Marshall M. Fredericks Sculpture Museum Lobby\\, Arbury Fine Art\n" +
            " s Center 107 Sculpture Gallery Classroom - Special Academic Space\n" +
            "DTSTART;TZID=America/New_York:20230325T183000\n" +
            "DTEND;TZID=America/New_York:20230325T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Museum\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:MARSHALL\n" +
            "  FREDERICKS SCULPTURE MUSEUM\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:Alliso\n" +
            " n\\, Laurie\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Diagram Link\";ID=21855;TYPE=Url:<a href=\"http\n" +
            " s://diagram.socialtables.com/diagram/58938edc-d6cf-463a-ae32-edabafc20ed\n" +
            " 3\" target=\"_blank\" rel=\"noopener\" title=\"https://diagram.socialtables.co\n" +
            " m/diagram/58938edc-d6cf-463a-ae32-edabafc20ed3\">diagram.socialtables.com\n" +
            " &#8230\\;</a>\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2023-\n" +
            " ACNHRF\n" +
            "DTSTAMP:20230314T084255Z\n" +
            "DESCRIPTION:Event State: Confirmed<br>Organization: MARSHALL FREDERICKS \n" +
            " SCULPTURE MUSEUM<br>Submitter Name: Allison\\, Laurie<br>Diagram Link: ht\n" +
            " tps://diagram.socialtables.com/diagram/58938edc-d6cf-463a-ae32-edabafc20\n" +
            " ed3<br>Event Locator: 2023-ACNHRF<br><br><p><strong>Saturday\\, March 25\n" +
            " \\, 2023\\, 6:30-9:30pm&#160\\;</strong></p> <p><strong>Dinner and Movie wit\n" +
            " h the Curator</strong><strong>&#160\\;</strong></p> <p>Enjoy dinner in th\n" +
            " e Museum and take in an exciting lecture titled&#160\\;<strong>&quot\\;</s\n" +
            " trong>Art of the 1960s and the Quirks of a College Collection&quot\\;<str\n" +
            " ong>&#160\\;</strong>with the&#160\\;<em>Off Kilter\\, On Point</em>&#160\\;\n" +
            " exhibition curator Lynn Boland\\, Ph.D. Using the&#160\\;<em>Off Kilter\\, \n" +
            " On Point</em>&#160\\;exhibition\\, Dr. Boland will give a brief overview o\n" +
            " f the main trends in US art of the 1960s\\, seen through the lens of coll\n" +
            " ecting trends of the 1980s\\, with commentary on the particularities of u\n" +
            " niversity collecting.&#160\\;Afterwards guests can enjoy a 2002 video by&\n" +
            " #160\\;<em>Off Kilter</em>&#160\\;exhibition artist Ray Johnson called&#16\n" +
            " 0\\;<em>How to Draw a Bunny</em>\\, directed by Detroit native John W. Wal\n" +
            " ter. The video explores the life of&#160\\;Johnson\\, a&#160\\;Detroit-born\n" +
            "  pop\\, collage and performance artist.&#160\\;&#160\\;</p>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/803206563\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d803206563\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Jazz Fest\n" +
            "LOCATION:Performing Arts Center Rhea E. Miller Recital Hall\n" +
            "DTSTART;TZID=America/New_York:20230331T080000\n" +
            "DTEND;TZID=America/New_York:20230331T170000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Concert\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF MUSIC\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:McQuar\n" +
            " ter\\, Kelly\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACKZHK\n" +
            "DTSTAMP:20230314T084256Z\n" +
            "DESCRIPTION:Organization: DEPARTMENT OF MUSIC<br>Submitter Name: McQuart\n" +
            " er\\, Kelly<br>Event State: Confirmed<br>Event Locator: 2022-ACKZHK<br>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/611676100\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d611676100\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Jazz Fest Jazz Combo Concert\n" +
            "LOCATION:Performing Arts Center Rhea E. Miller Recital Hall\n" +
            "DTSTART;TZID=America/New_York:20230331T193000\n" +
            "DTEND;TZID=America/New_York:20230331T210000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Concert\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF MUSIC\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:McQuar\n" +
            " ter\\, Kelly\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2023-\n" +
            " ACNHNZ\n" +
            "DTSTAMP:20230314T084256Z\n" +
            "DESCRIPTION:Organization: DEPARTMENT OF MUSIC<br>Submitter Name: McQuart\n" +
            " er\\, Kelly<br>Event State: Confirmed<br>Event Locator: 2023-ACNHNZ<br>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/797093931\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d797093931\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Jazz Fest\n" +
            "LOCATION:Performing Arts Center Rhea E. Miller Recital Hall\n" +
            "DTSTART;TZID=America/New_York:20230401T080000\n" +
            "DTEND;TZID=America/New_York:20230401T170000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Concert\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF MUSIC\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:McQuar\n" +
            " ter\\, Kelly\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACKZHK\n" +
            "DTSTAMP:20230314T084256Z\n" +
            "DESCRIPTION:Organization: DEPARTMENT OF MUSIC<br>Submitter Name: McQuart\n" +
            " er\\, Kelly<br>Event State: Confirmed<br>Event Locator: 2022-ACKZHK<br>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/611676101\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d611676101\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Jazz Fest Jazz Ensemble Concert\n" +
            "LOCATION:Performing Arts Center Rhea E. Miller Recital Hall\n" +
            "DTSTART;TZID=America/New_York:20230401T193000\n" +
            "DTEND;TZID=America/New_York:20230401T210000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Concert\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF MUSIC\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:McQuar\n" +
            " ter\\, Kelly\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2023-\n" +
            " ACNHPB\n" +
            "DTSTAMP:20230314T084256Z\n" +
            "DESCRIPTION:Organization: DEPARTMENT OF MUSIC<br>Submitter Name: McQuart\n" +
            " er\\, Kelly<br>Event State: Confirmed<br>Event Locator: 2023-ACNHPB<br>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/797093932\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d797093932\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Climate Control Lecture\n" +
            "LOCATION:Curtiss Hall Banquet A\\, Curtiss Hall Banquet B\\, Curtiss Hall \n" +
            " Banquet C\n" +
            "DTSTART;TZID=America/New_York:20230411T183000\n" +
            "DTEND;TZID=America/New_York:20230411T203000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Lecture\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DIVERSIT\n" +
            " Y PROGRAMS\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:Thorns\n" +
            " \\, Mamie\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACNDZK\n" +
            "DTSTAMP:20230314T084256Z\n" +
            "DESCRIPTION:Organization: DIVERSITY PROGRAMS<br>Event State: Confirmed<b\n" +
            " r>Submitter Name: Thorns\\, Mamie<br>Event Locator: 2022-ACNDZK<br>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/841203084\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d841203084\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Chia-Ying Chan Piano Solo Recital\n" +
            "LOCATION:Performing Arts Center Rhea E. Miller Recital Hall\n" +
            "DTSTART;TZID=America/New_York:20230412T193000\n" +
            "DTEND;TZID=America/New_York:20230412T220000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Recital\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:McQuar\n" +
            " ter\\, Kelly\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF MUSIC\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACLAPQ\n" +
            "DTSTAMP:20230314T084257Z\n" +
            "DESCRIPTION:Submitter Name: McQuarter\\, Kelly<br>Organization: DEPARTMEN\n" +
            " T OF MUSIC<br>Event State: Confirmed<br>Event Locator: 2022-ACLAPQ<br>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/632601708\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d632601708\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Urinetown\n" +
            "LOCATION:Malcolm Field Performing Arts Theatre\n" +
            "DTSTART;TZID=America/New_York:20230412T193000\n" +
            "DTEND;TZID=America/New_York:20230412T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF THEATRE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:Helmre\n" +
            " ich\\, Kelly\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2018-\n" +
            " ABRDGB\n" +
            "DTSTAMP:20230314T084256Z\n" +
            "DESCRIPTION:Organization: DEPARTMENT OF THEATRE<br>Submitter Name: Helmr\n" +
            " eich\\, Kelly<br>Event State: Confirmed<br>Event Locator: 2018-ABRDGB<br>\n" +
            " <br><p>In a Gotham-like city\\, a terrible water shortage\\, caused by a 2\n" +
            " 0-year drought\\, has led to a government-enforced ban on private toilets\n" +
            " . The citizens must use public amenities\\, regulated by a single malevol\n" +
            " ent company that profits by charging admission for one of humanity&#39\\;\n" +
            " s most basic needs. Amid the people\\, a hero decides that he&#39\\;s had \n" +
            " enough and plans a revolution to lead them all to freedom!</p> <p>Inspir\n" +
            " ed by the works of Bertolt Brecht and Kurt Weill\\,&#160\\;<em>Urinetown</\n" +
            " em>&#160\\;is a hilarious musical satire of the legal system\\, capitalism\n" +
            " \\, social irresponsibility\\, populism\\, bureaucracy\\, corporate mismanag\n" +
            " ement\\, municipal politics and musical theatre itself! Hilariously funny\n" +
            "  and touchingly honest\\,&#160\\;<em>Urinetown</em>&#160\\;provides a fresh\n" +
            "  perspective on one of America&#39\\;s greatest art forms.</p>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/804563949\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d804563949\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Urinetown\n" +
            "LOCATION:Malcolm Field Performing Arts Theatre\n" +
            "DTSTART;TZID=America/New_York:20230413T193000\n" +
            "DTEND;TZID=America/New_York:20230413T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF THEATRE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:Helmre\n" +
            " ich\\, Kelly\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2018-\n" +
            " ABRDGB\n" +
            "DTSTAMP:20230314T084257Z\n" +
            "DESCRIPTION:Organization: DEPARTMENT OF THEATRE<br>Submitter Name: Helmr\n" +
            " eich\\, Kelly<br>Event State: Confirmed<br>Event Locator: 2018-ABRDGB<br>\n" +
            " <br><p>In a Gotham-like city\\, a terrible water shortage\\, caused by a 2\n" +
            " 0-year drought\\, has led to a government-enforced ban on private toilets\n" +
            " . The citizens must use public amenities\\, regulated by a single malevol\n" +
            " ent company that profits by charging admission for one of humanity&#39\\;\n" +
            " s most basic needs. Amid the people\\, a hero decides that he&#39\\;s had \n" +
            " enough and plans a revolution to lead them all to freedom!</p> <p>Inspir\n" +
            " ed by the works of Bertolt Brecht and Kurt Weill\\,&#160\\;<em>Urinetown</\n" +
            " em>&#160\\;is a hilarious musical satire of the legal system\\, capitalism\n" +
            " \\, social irresponsibility\\, populism\\, bureaucracy\\, corporate mismanag\n" +
            " ement\\, municipal politics and musical theatre itself! Hilariously funny\n" +
            "  and touchingly honest\\,&#160\\;<em>Urinetown</em>&#160\\;provides a fresh\n" +
            "  perspective on one of America&#39\\;s greatest art forms.</p>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/804563950\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d804563950\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Urinetown\n" +
            "LOCATION:Malcolm Field Performing Arts Theatre\n" +
            "DTSTART;TZID=America/New_York:20230414T193000\n" +
            "DTEND;TZID=America/New_York:20230414T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF THEATRE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:Helmre\n" +
            " ich\\, Kelly\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2018-\n" +
            " ABRDGB\n" +
            "DTSTAMP:20230314T084257Z\n" +
            "DESCRIPTION:Organization: DEPARTMENT OF THEATRE<br>Submitter Name: Helmr\n" +
            " eich\\, Kelly<br>Event State: Confirmed<br>Event Locator: 2018-ABRDGB<br>\n" +
            " <br><p>In a Gotham-like city\\, a terrible water shortage\\, caused by a 2\n" +
            " 0-year drought\\, has led to a government-enforced ban on private toilets\n" +
            " . The citizens must use public amenities\\, regulated by a single malevol\n" +
            " ent company that profits by charging admission for one of humanity&#39\\;\n" +
            " s most basic needs. Amid the people\\, a hero decides that he&#39\\;s had \n" +
            " enough and plans a revolution to lead them all to freedom!</p> <p>Inspir\n" +
            " ed by the works of Bertolt Brecht and Kurt Weill\\,&#160\\;<em>Urinetown</\n" +
            " em>&#160\\;is a hilarious musical satire of the legal system\\, capitalism\n" +
            " \\, social irresponsibility\\, populism\\, bureaucracy\\, corporate mismanag\n" +
            " ement\\, municipal politics and musical theatre itself! Hilariously funny\n" +
            "  and touchingly honest\\,&#160\\;<em>Urinetown</em>&#160\\;provides a fresh\n" +
            "  perspective on one of America&#39\\;s greatest art forms.</p>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/804563951\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d804563951\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Encore\n" +
            "LOCATION:Performing Arts Center Rhea E. Miller Recital Hall\n" +
            "DTSTART;TZID=America/New_York:20230415T140000\n" +
            "DTEND;TZID=America/New_York:20230415T153000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:ENCORE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:Henige\n" +
            " \\, Elissa\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACLLVW\n" +
            "DTSTAMP:20230314T084257Z\n" +
            "DESCRIPTION:Organization: ENCORE<br>Submitter Name: Henige\\, Elissa<br>E\n" +
            " vent State: Confirmed<br>Event Locator: 2022-ACLLVW<br>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/804563952\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d804563952\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Urinetown\n" +
            "LOCATION:Malcolm Field Performing Arts Theatre\n" +
            "DTSTART;TZID=America/New_York:20230415T193000\n" +
            "DTEND;TZID=America/New_York:20230415T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF THEATRE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:Helmre\n" +
            " ich\\, Kelly\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2018-\n" +
            " ABRDGB\n" +
            "DTSTAMP:20230314T084257Z\n" +
            "DESCRIPTION:Organization: DEPARTMENT OF THEATRE<br>Submitter Name: Helmr\n" +
            " eich\\, Kelly<br>Event State: Confirmed<br>Event Locator: 2018-ABRDGB<br>\n" +
            " <br><p>In a Gotham-like city\\, a terrible water shortage\\, caused by a 2\n" +
            " 0-year drought\\, has led to a government-enforced ban on private toilets\n" +
            " . The citizens must use public amenities\\, regulated by a single malevol\n" +
            " ent company that profits by charging admission for one of humanity&#39\\;\n" +
            " s most basic needs. Amid the people\\, a hero decides that he&#39\\;s had \n" +
            " enough and plans a revolution to lead them all to freedom!</p> <p>Inspir\n" +
            " ed by the works of Bertolt Brecht and Kurt Weill\\,&#160\\;<em>Urinetown</\n" +
            " em>&#160\\;is a hilarious musical satire of the legal system\\, capitalism\n" +
            " \\, social irresponsibility\\, populism\\, bureaucracy\\, corporate mismanag\n" +
            " ement\\, municipal politics and musical theatre itself! Hilariously funny\n" +
            "  and touchingly honest\\,&#160\\;<em>Urinetown</em>&#160\\;provides a fresh\n" +
            "  perspective on one of America&#39\\;s greatest art forms.</p>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/804563953\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d804563953\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:SVSU Choirs in Concert\n" +
            "LOCATION:Performing Arts Center Rhea E. Miller Recital Hall\n" +
            "DTSTART;TZID=America/New_York:20230418T193000\n" +
            "DTEND;TZID=America/New_York:20230418T210000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF MUSIC\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:McQuar\n" +
            " ter\\, Kelly\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACKCZB\n" +
            "DTSTAMP:20230314T084257Z\n" +
            "DESCRIPTION:Organization: DEPARTMENT OF MUSIC<br>Submitter Name: McQuart\n" +
            " er\\, Kelly<br>Event State: Confirmed<br>Event Locator: 2022-ACKCZB<br>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/804563954\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d804563954\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Concert Band Concert\n" +
            "LOCATION:Malcolm Field Performing Arts Theatre\n" +
            "DTSTART;TZID=America/New_York:20230419T193000\n" +
            "DTEND;TZID=America/New_York:20230419T220000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Concert\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF MUSIC\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:McQuar\n" +
            " ter\\, Kelly\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACLCJB\n" +
            "DTSTAMP:20230314T084257Z\n" +
            "DESCRIPTION:Organization: DEPARTMENT OF MUSIC<br>Submitter Name: McQuart\n" +
            " er\\, Kelly<br>Event State: Confirmed<br>Event Locator: 2022-ACLCJB<br>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/656081674\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d656081674\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Foreign Language Day\n" +
            "LOCATION:Curtiss Hall Alumni Lounge\\, Malcolm Field Performing Arts Thea\n" +
            " tre\\, Curtiss Hall 204 - Conference Room\\, Groening Commons G6\\, Groenin\n" +
            " g Commons Mezzanine West\\, Curtiss Hall Seminar G\n" +
            "DTSTART;TZID=America/New_York:20230420T090000\n" +
            "DTEND;TZID=America/New_York:20230420T133000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Performance\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:MODERN F\n" +
            " OREIGN LANGUAGE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:Dix\\, \n" +
            " Monika\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACMVKS\n" +
            "DTSTAMP:20230314T084258Z\n" +
            "DESCRIPTION:Organization: MODERN FOREIGN LANGUAGE<br>Submitter Name: Dix\n" +
            " \\, Monika<br>Event State: Confirmed<br>Event Locator: 2022-ACMVKS<br><br\n" +
            " ><p>The MFL Department will host its 48th Foreign Language Day on Thursd\n" +
            " ay\\, April 20\\, 2023 from 9:00am-1:30pm in the Malcolm Field Theater (al\n" +
            " ready received the ok from the Theater Department that the theater is av\n" +
            " ailable on this day). This event includes performance sin various langua\n" +
            " ges.</p>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/793467173\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d793467173\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:History Department - Student Open House\n" +
            "LOCATION:Brown Hall 214 - Classroom\\, Brown Hall 216 - Classroom\n" +
            "DTSTART;TZID=America/New_York:20230420T150000\n" +
            "DTEND;TZID=America/New_York:20230420T173000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Meeting\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF HISTORY\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:Opheim\n" +
            " \\, Sharon\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2023-\n" +
            " ACNMQS\n" +
            "DTSTAMP:20230314T084258Z\n" +
            "DESCRIPTION:Organization: DEPARTMENT OF HISTORY<br>Submitter Name: Ophei\n" +
            " m\\, Sharon<br>Event State: Confirmed<br>Event Locator: 2023-ACNMQS<br><b\n" +
            " r><p><strong>History Department Open House/Meeting</strong>.&#160\\; Facu\n" +
            " lty will meet with students to discuss items pertinent to History majors\n" +
            "  and minors.&#160\\; Installation of honor students into Phi Alpha Theta \n" +
            " - the History National Honor Society will also take place.</p>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/817807394\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d817807394\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Valley Steel\n" +
            "LOCATION:Performing Arts Center Rhea E. Miller Recital Hall\n" +
            "DTSTART;TZID=America/New_York:20230420T193000\n" +
            "DTEND;TZID=America/New_York:20230420T213000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Concert\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:DEPARTME\n" +
            " NT OF MUSIC\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:McQuar\n" +
            " ter\\, Kelly\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACKXZV\n" +
            "DTSTAMP:20230314T084258Z\n" +
            "DESCRIPTION:Organization: DEPARTMENT OF MUSIC<br>Submitter Name: McQuart\n" +
            " er\\, Kelly<br>Event State: Confirmed<br>Event Locator: 2022-ACKXZV<br>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/804563955\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d804563955\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Winter 2023 Semester Important Dates\n" +
            "DTSTART;TZID=America/New_York:20230422T080000\n" +
            "DTEND;TZID=America/New_York:20230422T163000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:RO_Calendar\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=4665;TYPE=SingleLine:23/WI Imp\n" +
            " ortant Dates\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:REGISTRA\n" +
            " R\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACJPCM\n" +
            "DTSTAMP:20230310T092137Z\n" +
            "DESCRIPTION:Event Name: 23/WI Important Dates<br>Event State: Confirmed<\n" +
            " br>Organization: REGISTRAR<br>Event Locator: 2022-ACJPCM<br><br>Classes \n" +
            " End\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/578526434\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d578526434\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Winter 2023 Semester Important Dates\n" +
            "DTSTART;TZID=America/New_York:20230424T080000\n" +
            "DTEND;TZID=America/New_York:20230424T163000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:RO_Calendar\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=4665;TYPE=SingleLine:23/WI Imp\n" +
            " ortant Dates\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:REGISTRA\n" +
            " R\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACJPCN\n" +
            "DTSTAMP:20230310T092138Z\n" +
            "DESCRIPTION:Event Name: 23/WI Important Dates<br>Event State: Confirmed<\n" +
            " br>Organization: REGISTRAR<br>Event Locator: 2022-ACJPCN<br><br>Final Ex\n" +
            " ams Begin\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/578526435\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d578526435\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Winter 2023 Semester Important Dates\n" +
            "DTSTART;TZID=America/New_York:20230429T080000\n" +
            "DTEND;TZID=America/New_York:20230429T163000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:RO_Calendar\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=4665;TYPE=SingleLine:23/WI Imp\n" +
            " ortant Dates\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:REGISTRA\n" +
            " R\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACJPCP\n" +
            "DTSTAMP:20230310T092138Z\n" +
            "DESCRIPTION:Event Name: 23/WI Important Dates<br>Event State: Confirmed<\n" +
            " br>Organization: REGISTRAR<br>Event Locator: 2022-ACJPCP<br><br>Final Ex\n" +
            " ams End\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/578526436\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d578526436\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Winter 2023 Semester Important Dates\n" +
            "DTSTART;TZID=America/New_York:20230503T080000\n" +
            "DTEND;TZID=America/New_York:20230503T120000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:RO_Calendar\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=4665;TYPE=SingleLine:23/WI Imp\n" +
            " ortant Dates\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:REGISTRA\n" +
            " R\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACJPCR\n" +
            "DTSTAMP:20230310T092139Z\n" +
            "DESCRIPTION:Event Name: 23/WI Important Dates<br>Event State: Confirmed<\n" +
            " br>Organization: REGISTRAR<br>Event Locator: 2022-ACJPCR<br><br>Grades D\n" +
            " ue - Registrar&#39\\;s Office by Noon\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/578526437\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d578526437\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Winter 2023 Semester Important Dates\n" +
            "DTSTART;TZID=America/New_York:20230505T080000\n" +
            "DTEND;TZID=America/New_York:20230505T163000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:RO_Calendar\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=4665;TYPE=SingleLine:23/WI Imp\n" +
            " ortant Dates\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:REGISTRA\n" +
            " R\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACJPCS\n" +
            "DTSTAMP:20230310T092139Z\n" +
            "DESCRIPTION:Event Name: 23/WI Important Dates<br>Event State: Confirmed<\n" +
            " br>Organization: REGISTRAR<br>Event Locator: 2022-ACJPCS<br><br>Commence\n" +
            " ment\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/578526438\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d578526438\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Winter Commencement Ceremony\n" +
            "LOCATION:Ryder Center O&#39\\;Neill Arena\\, Ryder Center O&#39\\;Neill Are\n" +
            " na East Multipurpose Practice Floor\\, Ryder Center O&#39\\;Neill Arena We\n" +
            " st Basketball Game Court\\, Ryder Center Conference Room\\, Ryder Center O\n" +
            " &#39\\;Neill Arena 2nd Floor South Concourse\\, Ryder Center O&#39\\;Neill&\n" +
            " #8230\\;\n" +
            "DTSTART;TZID=America/New_York:20230505T120000\n" +
            "DTEND;TZID=America/New_York:20230505T190000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:Commencement\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:ALUMNI R\n" +
            " ELATIONS\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Submitter Name\";ID=369;TYPE=SingleLine:Taylor\n" +
            " \\, Nic\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2023-\n" +
            " ACNGHN\n" +
            "DTSTAMP:20230314T092648Z\n" +
            "DESCRIPTION:Organization: ALUMNI RELATIONS<br>Submitter Name: Taylor\\, N\n" +
            " ic<br>Event State: Confirmed<br>Event Locator: 2023-ACNGHN<br>\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/792113402\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d792113402\n" +
            "END:VEVENT\n" +
            "BEGIN:VEVENT\n" +
            "SUMMARY:Winter 2023 Semester Important Dates\n" +
            "DTSTART;TZID=America/New_York:20230605T080000\n" +
            "DTEND;TZID=America/New_York:20230605T163000\n" +
            "X-MICROSOFT-CDO-ALLDAYEVENT:FALSE\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Type\";ID=12;TYPE=number:RO_Calendar\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Name\";ID=4665;TYPE=SingleLine:23/WI Imp\n" +
            " ortant Dates\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event State\";ID=4357;TYPE=SingleLine:Confirme\n" +
            " d\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Organization\";ID=367;TYPE=SingleLine:REGISTRA\n" +
            " R\n" +
            "X-TRUMBA-CUSTOMFIELD;NAME=\"Event Locator\";ID=25448;TYPE=SingleLine:2022-\n" +
            " ACJPCQ\n" +
            "DTSTAMP:20230310T092139Z\n" +
            "DESCRIPTION:Event Name: 23/WI Important Dates<br>Event State: Confirmed<\n" +
            " br>Organization: REGISTRAR<br>Event Locator: 2022-ACJPCQ<br><br>Incomple\n" +
            " te Expiration Date - Due to Registrar\n" +
            "CATEGORIES:Homepage Calendar Resource\n" +
            "UID:http://uid.trumba.com/event/578526439\n" +
            "X-TRUMBA-LINK:http://www.svsu.edu/calendar/homepagecalendar?trumbaEmbed=\n" +
            " view%3devent%26eventid%3d578526439\n" +
            "END:VEVENT\n" +
            "END:VCALENDAR\n";
}
