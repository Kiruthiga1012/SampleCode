package day4;

import java.util.*;

public class Employee1 extends PhoneDetails {
	private int empId;
	private String empName;
	PhoneDetails phone;
	public PhoneDetails getPhone() {
		return phone;
	}
	public void setPhone(PhoneDetails phone) {
		this.phone = phone;
	}


	Scanner scanner=new Scanner(System.in);

	/*
	 * public PhoneDetails[] getPhone() { return phone; } public void
	 * setPhone(PhoneDetails[] phone,int num) { for(int i=0;i<num;i++) {
	 * 
	 * }
	 * 
	 * }
	 */

	public int getEmpId() {
		return empId;
	}
	public void setEmpId() {
		System.out.println("Enter the employee id");
		int empId=scanner.nextInt();
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName() {
		System.out.println("Enter the employee name");
		String empName=scanner.nextLine();
		this.empName = empName;
	}


	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpId();
		e1.setEmpName();
		PhoneDetails p=new PhoneDetails();
		p.setPhoneId();
		p.setPhoneType();
		p.setPhoneNo();
		e1.getPhone(e1.setPhone(p));
		System.out.println("Employee details ");
		System.out.println("Employee Id : " +e1.getEmpId());
		System.out.println("Employee Name : " +e1.getEmpName());
	}

}
