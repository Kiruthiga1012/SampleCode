package day8;

import java.util.*;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h1=new HashSet<String>();
		
		for(int i=0;i<3;i++) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the string");
			String string=s.next();
			h1.add(string);
		}
		
		System.out.println(h1);
		
		ArrayList<String> arraylist=new ArrayList<String>(h1);
		
		Iterator<String> itr=arraylist.iterator();
		
		System.out.println("Iterator 1");
		
		for(String o: arraylist) {
			System.out.print(o+ " ");
		}
		
		System.out.println("\nIterator 2");
		
		while(itr.hasNext()) {
			String e=(String)itr.next();
			System.out.print(e + " ");
			}
	}

}
