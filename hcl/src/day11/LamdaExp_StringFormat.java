package day11;

import java.util.function.Consumer;

public class LamdaExp_StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Function<String,String> obj=(str1)->str1;
		Consumer<String> obj=(str1)->
		{
			char[] arr=str1.toCharArray();
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+ " ");
		};
		obj.accept("Hello");
	}

}
