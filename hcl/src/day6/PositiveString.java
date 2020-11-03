package day6;

import java.util.Scanner;

public class PositiveString {
	int flag=0;
	
	public boolean positiveString(String s) {
		
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String text=scanner.nextLine();
		PositiveString obj=new PositiveString();
		boolean b=obj.positiveString(text);
	}

}
