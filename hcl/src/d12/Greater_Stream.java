package d12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Greater_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(7,10,2,34,21,21);
		
		System.out.println(l);
		
		List<Integer> l1=l.stream().filter(i->i>10).distinct().collect(Collectors.toList());
		System.out.println(l1);
		
		 l=l.stream().map(i->i+10).collect(Collectors.toList());
		System.out.println(l);
		
		 l.stream().map(i->i+10).forEach(System.out::println);
		
		List<Integer> l2=l.stream().filter(i->i>10).limit(2).collect(Collectors.toList());
		System.out.println(l2);
	}

}
