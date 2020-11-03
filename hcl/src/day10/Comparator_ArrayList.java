package day10;

import java.util.*;

public class Comparator_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<String>();
		l1.add("Apple");
		l1.add("apple");
		l1.add("Yellow");
		l1.add("ball");
		 
		System.out.println(l1);
		
		Collections.sort(l1);
		
		System.out.println("After sorting " +l1);
	}

}
