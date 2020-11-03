package day8;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> h1=new HashMap<String,Integer>();
		HashMap<String,Integer> h2=new HashMap<String,Integer>();
		
		h1.put(null, new Integer(1));
		h1.put("two", new Integer(2));
		h1.put("three", new Integer(3));
		h1.put("three", new Integer(5));
		
		h2.putAll(h1);
		System.out.println(h2);
		
		System.out.println("h1 contains " +h1.size()+ " Key value pairs");
		 
		if(h1.containsValue(new Integer(1))) {
			System.out.println("h1 contains 1 as a value");
		}
		else {
			System.out.println("h1 does not contains 1 as a value");
		}
		
		System.out.println("Retriving all keys from h1");
		
		Iterator<String> itr=h1.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Retriving all key value pairs");
		
		Iterator<Map.Entry<String,Integer>> itr1=h1.entrySet().iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("HashMap values");
		
		Iterator<Integer> itr3=h1.values().iterator();
		
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
		System.out.println("Using enhanced for loop");
		
		for(String key:h1.keySet()) {
			Integer value=h1.get(key);
			System.out.println(" " + key + " " +value);
		}
		
		for(Map.Entry<String,Integer> s:h1.entrySet()) {
			System.out.println(s.getKey()+ " " +s.getValue());
		}
		
		
	}

}
