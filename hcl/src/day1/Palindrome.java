package day1;

import java.util.Scanner;

public class Palindrome {
	String word;

	void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		word = scanner.nextLine();
		scanner.close();
	}

	boolean check() {
		StringBuffer stringBuffer = new StringBuffer(word);
		stringBuffer = stringBuffer.reverse();
		String string = stringBuffer.toString();

		if (word.equals(string)) {
			System.out.println(word + " is palindrome");
			return true;
		} else {
			System.out.println(word + " is not palindrome");
			return false;
		}
	}

	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		obj.accept();
		obj.check();
	}
}
