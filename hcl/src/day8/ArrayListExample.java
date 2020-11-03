package day8;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arraylistA=new ArrayList<Integer>();
		ArrayList<String> arraylistB=new ArrayList<String>();
		
		for(int i=0;i<5;i++) {
			arraylistA.add(i);
		}
		
		System.out.println(arraylistA);
		
		arraylistB.add("Beginner");
		arraylistB.add("java");
		arraylistB.add("tutorial");
		arraylistB.add(".");
		arraylistB.add(3,"com");
		arraylistB.add("java");
		arraylistB.add("site");
		
		System.out.println(arraylistB);
		
		System.out.println("Second element of arraylistB :" + arraylistB.get(2));
		
		arraylistB.remove("java");
		
		System.out.println("arraylistB after " +arraylistB);
		
		Iterator<Integer> i1=arraylistA.iterator();
		
		System.out.print("ArrayList arraylistA  ");
		
		while(i1.hasNext()) {
			System.out.print(i1.next()+" ");
		}
		System.out.println();
		
		System.out.print("ArrayList arraylistA    ");
		
		for(int j=0;j<arraylistA.size();j++) {
			System.out.print(arraylistA.get(j)+ " ");
		}
		System.out.println();
		
		//sort an arraylist
		System.out.println("Sorted ArrayList arraylistA");
		Collections.sort(arraylistA);
		System.out.print(arraylistA);
		
		Integer[] a= {11,12,13,14,15};
		List<Integer> arrlist=new ArrayList<Integer>(Arrays.asList(a));
		System.out.println("arrlist" +arrlist.get(0));
		
	}

}
