package day4;

import java.util.Scanner;

public class Simple_tester implements Prime_tester {
	public void checkPrime(int num) {
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) 
				count++;
		}
		if(count==0) 
			System.out.println(num + " is prime number");
		else
			System.out.println(num + " is not a prime number");
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		Simple_tester obj=new Simple_tester();
		obj.checkPrime(num);
		scanner.close();

	}

}
