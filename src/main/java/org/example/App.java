package org.example;

import org.example.calendarparsing.Calendar;
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
        String events = cp.parseCalendar();
        System.out.println(events);
    }
}
