package day6;

import java.util.*;

public class ConvertingFirstCharacterToUpper {

	public void ConvertingToUpper() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		char[] arr = str.toCharArray();

		arr[0] = Character.toUpperCase(arr[0]);

		for (int j = 1; j < arr.length; j++) {
			if (Character.isWhitespace(arr[j]))
				arr[j + 1] = Character.toUpperCase(arr[j + 1]);
		}

		for (char i : arr)
			System.out.print(i);

	}

	public static void main(String[] args) {

		ConvertingFirstCharacterToUpper obj = new ConvertingFirstCharacterToUpper();
		obj.ConvertingToUpper();

	}

}
