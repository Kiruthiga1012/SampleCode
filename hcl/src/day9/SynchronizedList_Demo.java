package day9;
import java.util.*;
public class SynchronizedList_Demo {

	public static void main(String args[])
	{
		
		List<String> a=new ArrayList<String>();
		List  a1=Collections.synchronizedList(a);
	 
		a1.add("apple");
		a1.add("mouse");
		
	 
			Iterator   iterator = a1.iterator();
			while (iterator.hasNext()) {
				System.out.println("item: " + iterator.next());
			}
	 
				
		
	}
}
