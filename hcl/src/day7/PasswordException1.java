package day7;

import java.util.Scanner;
class InCorrectPasswordException1 extends Exception{
	public String toString() {
		return "your three attempts are over";
	}
}

public class PasswordException1 extends RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count=0;
		String password = "kiruthiga";
		Scanner s = new Scanner(System.in);
		try{
			do {
				System.out.println("Enter the password");
				String pass=s.nextLine();	
				if(password.equals(pass)) {
					System.out.println("Welcome");
					break;
				}
				else {
					count++;
					System.out.println("Invalid password");
				}
					
			}while(count!=3);
			if(count==3)
				throw new InCorrectPasswordException1();
		}
		catch(InCorrectPasswordException1 e) {
			System.out.println(e);
		}
				
		 

	}

}
