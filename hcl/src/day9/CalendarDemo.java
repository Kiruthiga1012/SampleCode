package day9;

import java.util.*;
public class CalendarDemo {
public static void main(String[] args) {
	
	
 Calendar c= Calendar.getInstance();
 //Displays the current calendar
 System.out.println("Calendar before Setting is "+c.getTime());    
 //Sets all the calendar field values and the time value of this Calendar
 //undefined.
 int year = c.get(Calendar.YEAR);
 int month = c.get(Calendar.MONTH);      // 0 to 11
 int day = c.get(Calendar.DAY_OF_MONTH);
 System.out.printf("%4d%4d%4d",year,month,day);
 c.clear();
 System.out.println();
 //Sets the values for the calendar fields YEAR, MONTH,and DAY_OF_MONTH.
 c.set(2007,10,27);
 //Displays the calendar after setting
 System.out.println("Calendar after Setting is "+c.getTime());    
    }
} 
