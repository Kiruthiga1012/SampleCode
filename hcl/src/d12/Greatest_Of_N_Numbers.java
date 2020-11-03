package d12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Greatest_Of_N_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(1,3,5,7,9);
		
		System.out.println(l);
		
	
		Optional<Integer> l1=l.stream().reduce((x,y)->x>y?x:y);
		
		if(l1.isPresent()) {
			System.out.println("Greatest Number : "+l1.get());
		}
	}

}
