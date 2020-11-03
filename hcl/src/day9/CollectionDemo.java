package day9;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> t1=new TreeMap<String,Integer>();
		//t1.put(null, new Integer(1));
		t1.put("two", new Integer(2));
		t1.put("three", new Integer(3));
		t1.put("four", null);
		
		System.out.println(t1);
		
		//HashTable<String,Integer> h1=new HashTable<String,Integer>();
		
		LinkedHashSet<Integer> h1=new LinkedHashSet<Integer>();
		h1.add(1);
		h1.add(null);
		h1.add(3);
		h1.add(null);
		
		System.out.println(h1);
	}

}
