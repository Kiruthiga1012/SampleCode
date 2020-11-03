package day9;

import java.text.*;
import java.util.*;
import java.util.Date;
 
public class DateExample {
 
   public static void main(String args[]) {
 
     // Get the Date
     Date now = new Date();
 
     DateFormat theDate = DateFormat.getDateInstance(DateFormat.SHORT);
     DateFormat germanDate = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMANY);
     DateFormat frenchDate = DateFormat.getDateInstance(DateFormat.LONG, Locale.JAPAN);
 
     // Format and print the dates
     System.out.println("Date in the default locale: " + theDate.format(now));
     System.out.println("Date in the German locale : " + germanDate.format(now));
     System.out.println("Date in the French locale : " + frenchDate.format(now));
     
    
   } 
}