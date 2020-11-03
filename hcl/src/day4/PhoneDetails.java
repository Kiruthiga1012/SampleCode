package day4;

import java.util.Scanner;

public class PhoneDetails {
	int phoneId;
	String phoneType;
	long phoneNo;
	
	public void setPhoneId() {
		System.out.println("Enter the phoneid");
		Scanner scanner=new Scanner(System.in);
		int phoneId=scanner.nextInt();
		this.phoneId = phoneId;
	}

	public void setPhoneType(){
		System.out.println("Enter the phonetype");
		Scanner scanner=new Scanner(System.in);
		String phoneType=scanner.nextLine();
		this.phoneType = phoneType;
	}
	public void setPhoneNo() {
		System.out.println("Enter the phoneno");
		Scanner scanner=new Scanner(System.in);
		long phoneNo=scanner.nextLong();
		this.phoneNo = phoneNo;
	}
}
