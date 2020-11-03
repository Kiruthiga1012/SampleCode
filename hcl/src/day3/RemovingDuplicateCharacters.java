package day3;

import java.util.Arrays;

public class RemovingDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'A','B','A','C','K','Z','E'};
		//char[] temp=new char[7];
		int n=7;
		Arrays.sort(arr);
		System.out.println("\nAfter sorting");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					for(int k=j+1;k<n;k++) {
						arr[k-1]=arr[k];
					}
					n--;
					j--;
				}
			}
			
		}
		System.out.println("\nAfter duplicate");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
			
		
		
		
		
	

	}

}
