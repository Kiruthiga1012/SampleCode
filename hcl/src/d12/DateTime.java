package d12;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		System.out.printf("%d-%d-%d",dd,mm,yy);
		
		System.out.println("\n" +date.getMonth());
		
		DateTimeFormatter date1=DateTimeFormatter.ofPattern("dd-mm-yy");
		String s=date.format(date1);
		System.out.println(s);
		
	}

}
