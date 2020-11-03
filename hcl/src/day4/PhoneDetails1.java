package day4;

import java.util.Scanner;

public class PhoneDetails1 {
	int phoneId;
	String phoneType;
	long phoneNo;
	Scanner scanner=new Scanner(System.in);
	public void setPhoneId() {
		System.out.println("Enter the phoneid");
		int phoneId=scanner.nextInt();
		this.phoneId = phoneId;
	}

	public void setPhoneType(){
		System.out.println("Enter the phonetype");
		String phoneType=scanner.nextLine();
		this.phoneType = phoneType;
	}

	public void setPhoneNo() {
		System.out.println("Enter the phoneno");
		long phoneNo=scanner.nextLong();
		this.phoneNo = phoneNo;
	}

}
