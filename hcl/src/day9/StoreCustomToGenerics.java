package day9;

import java.util.*;

class Employee{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+ " " + name;
	}
}
public class StoreCustomToGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Kiruthiga");
		Employee e2=new Employee(2,"Keerthana");
		
		HashSet<Employee> h1=new HashSet<Employee>();
		h1.add(e1);
		h1.add(e2);
		
		Iterator<Employee> itr=h1.iterator();
		
		for(Employee e:h1)
			System.out.print(e + " ");
		
		System.out.println();
		
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
	}

}
