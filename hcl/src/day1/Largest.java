package day1;

import java.util.Scanner;

public class Largest {
	int arr[],size;
	void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		size = scanner.nextInt();
		arr = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		
	}
	int great() {
		int greatest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (greatest > arr[i])
				continue;
			else
				greatest = arr[i];
		}
		return greatest;
	}

	public static void main(String[] args) {
		
		Largest obj = new Largest();
		obj.accept();
		System.out.println(obj.great());
	}

}
