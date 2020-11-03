package day3;

import java.util.Scanner;

public class ArrayOfObject {
	int id;
	String name;
	void accept() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the id and name");
		id=scanner.nextInt();
		name=scanner.nextLine();
	}
	void display() {
		System.out.println("Student id : " +id+ " Name : " +name);
	}
	public static void main(String[] args) {
		ArrayOfObject[] obj=new ArrayOfObject[2];
		for(int i=0;i<obj.length;i++) {
			
			obj[i]=new ArrayOfObject();
			obj[i].accept();
			obj[i].display();
		}
		

	}

}
