package d12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Get2MaximumValues {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(2,3,1,8,5,7,6);
		System.out.print("List elements " +l );
		System.out.println("\nGreatest two numbers from the list");
		l.stream().sorted(Comparator.reverseOrder()).limit(2).forEach(System.out::println);
	}
}
