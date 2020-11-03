package d12;

import java.time.LocalDate;
import java.time.Period;

public class DOB {

	public static void main(String[] args) {
	
		LocalDate dob=LocalDate.of(1998, 12, 10);
		LocalDate currentDate=LocalDate.now();
		
		System.out.println(dob);
		
		Period period=Period.between(dob, currentDate);
		System.out.println("Age : "+period.getYears());
	}

}
