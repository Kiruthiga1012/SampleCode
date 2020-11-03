package day8;

import java.util.*;

public class CollectionDemo2 {

	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<String>();
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			
			String string = s.next();
			h1.add(string);
		}
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		for (int i = 0; i < 3; i++) {
			Integer value = s.nextInt();
			a1.add(value);
		}
		
		//HashMap<HashSet<String>,ArrayList<Integer>> h2=new HashMap<HashSet<String>,ArrayList<Integer>>();
		h2.put(h1, a1);
		
		System.out.println(h2);
		
		//Iterator<Map.Entry<String, Integer>> itr1= h2.entrySet().iterator();
		
	}

}
