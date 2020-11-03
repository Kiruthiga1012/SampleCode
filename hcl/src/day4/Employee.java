package day4;

import java.util.*;

public class Employee extends PhoneDetails {
	private int empId;
	private String empName;
	PhoneDetails[] phone;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId() {
		System.out.println("Enter the employee id");
		Scanner scanner=new Scanner(System.in);
		int empId=scanner.nextInt();
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName() {
		System.out.println("Enter the employee name");
		Scanner scanner=new Scanner(System.in);
		String empName=scanner.nextLine();
		this.empName = empName;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setEmpId();
		e1.setEmpName();
		System.out.println("Enter how many phones that employee have");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		PhoneDetails[] p=new PhoneDetails[num];
		for(int i=0;i<num;i++) {
			p[i]=new PhoneDetails();
			p[i].setPhoneId();
			p[i].setPhoneType();
			p[i].setPhoneNo();
		}

		System.out.println("Employee details ");
		System.out.println("Employee Id : " +e1.getEmpId());
		System.out.println("Employee Name : " +e1.getEmpName());
		
	}

}
