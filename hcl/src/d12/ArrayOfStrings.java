package d12;

import java.util.Arrays;
import java.util.List;

public class ArrayOfStrings {

	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("Apple","Orange","Mango");
		
		System.out.println(l);
		
		l.stream().map(i->i.length()).forEach(System.out::println);
		
	}

}
