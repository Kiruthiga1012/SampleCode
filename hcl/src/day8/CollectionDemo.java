package day8;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		
		HashSet<String> s=new HashSet<String>();
		s.add("Beginner");
		s.add("java");
		s.add("java");
		s.add("tutorial");
		
		System.out.println("Elements in set " + s);
		System.out.println("s contains java "+ s.contains("java"));
		
		TreeSet<String> t=new TreeSet<String>(s);
		
		System.out.println("t.equals s" + t.equals(s));
		
		System.out.println("Iterator 1");
		
		Iterator<String> itr=t.iterator();
		while(itr.hasNext()) {
			String e=(String)itr.next();
			System.out.println(e);
		}
		
		System.out.println("Iterator 2");
		
		for(String o:t) {
			System.out.println(o);
		}

	}

}
