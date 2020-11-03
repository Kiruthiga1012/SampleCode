package day7;

import java.util.Scanner;

public class Input_Mismatch_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter integer value");
			num=s.nextInt();
			System.out.println(num);
		}
		catch(Exception e) {
			//System.out.println(e);
			System.out.println("input mismatch please enter the integer value");
		}
		finally {
			s.close();
		}
		

	}

}
