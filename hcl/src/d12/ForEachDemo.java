package d12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		l=Arrays.asList(1,2,3);
		
		l.forEach(i->{
			System.out.println(i);
		});
		
		System.out.println();
		
		l.forEach(System.out::println);
	}

}
