package day7;

import java.util.Scanner;
class InCorrectPasswordException extends RuntimeException{
	public String toString() {
		return "Incorrect Passowrd";
	}
}

public class PasswordException extends RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "kiruthiga";
		Scanner s = new Scanner(System.in);
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("Enter the password");
				String pass = s.nextLine();
				if (password.equals(pass)) {
					System.out.println("Welcome");
					break;
				}
				
			} 
			throw new PasswordException();

		} catch (InCorrectPasswordException e) {
			System.out.println(e);
		} finally {
			s.close();
		}

	}

}
