package org.example;

import org.example.calendarparsing.Calendar;
import org.example.calendarparsing.CalendarHomepage;
import org.example.calendarparsing.CalendarParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Parse Calendar with ICS format");
        CalendarParser cp = new CalendarParser(Calendar.entry);
        CalendarParser cpHome = new CalendarParser(CalendarHomepage.HOMEPAGE_CALENDAR_RESOURCES);

//        System.out.println("AFTER PARSING ....");
//        System.out.println(events);

        System.out.println(cp.parseCalendar());
        //System.out.println(cpHome.parseCalendar());
    }
}
