package day6;

import java.util.Scanner;

public class Operations {
	Scanner scanner=new Scanner(System.in);
	private int i;
	private String string;
	char[] arr;
	void chooseOption() {
		do {
			System.out.println("1.append 2.# 3.remove 4.upper");
			System.out.println("Enter your choice");
			int option=scanner.nextInt();
			switch(option) {
			case 1:
				append();
				break;
			case 2:
				replaceHash();
				break;
			case 3:
				removeDuplicate();
				break;
			case 4:
				upper();
				break;
			default:
				System.out.println("Invalid option");
				break;
			}

			System.out.println("Do you want to continue");
			System.out.println("1.continue 2.exit"); i=scanner.nextInt();


		}while(i==1);

	}
	void append() {
		System.out.println("Enter the string that to be appended");
		Scanner scanner=new Scanner(System.in);
		string=scanner.nextLine();
		//string=string+string1;
		System.out.println(string);
	}
	void replaceHash() {
		arr=string.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				arr[i]='#';
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	void removeDuplicate() {
		int n=arr.length;
		for (int i = 0; i <n; i++) {
			for (int j = i + 1; j <n; j++) {
				if (arr[i] == arr[j]) {
					for (int k = j + 1; k<n; k++) {
						arr[k - 1] = arr[k];
					}
					n--;
					j--;
				}
			}
		}
		System.out.println("\nAfter removing duplicate");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}

	}
	void upper() {
		for(int i=0;i<arr.length;i++){
		    System.out.print(Character.toUpperCase(arr[i]));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations obj=new Operations();
		obj.chooseOption();

	}

}
