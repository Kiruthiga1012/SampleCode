package day3;

import java.util.Scanner;

public class ArrayOfObjects {
	int id;
	String name;
	void accept() {
		Scanner scanner=new Scanner(System.in);
		id=scanner.nextInt();
		name=scanner.nextLine();
		scanner.close();
	}
	void display() {
		System.out.println("Student id : " +id+ " Name : " +name);
	}
	public static void main(String[] args) {
		ArrayOfObjects[] obj=new ArrayOfObjects[10];
		for(int i=0;i<10;i++) {
			obj[i]=new ArrayOfObjects();
			obj[i].accept();
			obj[i].display();
		}
		

	}

}
