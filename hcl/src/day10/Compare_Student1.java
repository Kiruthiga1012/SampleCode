package day10;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator;

import java.util.List;

import java.util.ListIterator;

public class Compare_Student1 {

	public static void main(String a[]) {

		Student1 st1 = new Student1("gaurav");

		Student1 st2 = new Student1("Amit");

		Student1 st3 = new Student1("annu");

		Student1 st4 = new Student1("Mohit");

		List<Student1> ls = new ArrayList<Student1>();

		ls.add(st1);

		ls.add(st2);

		ls.add(st3);

		ls.add(st4);

		Collections.sort(ls);

		Iterator itr = ls.iterator();

		while (itr.hasNext()) {

			Object element = itr.next();

			Student1 st = (Student1) element;

			System.out.println("name ::" + st.name  + "\n");

		}

	}

}

class Student1 implements Comparable {

	String name;
	

	Student1(String name) {
		this.name = name;
		
	}

	public int compareTo(Object o)

	{
		int i=name.compareToIgnoreCase(((Student1)o).name);
		  
		  if (i==0)
			  return 0; 
		  else if (i>0) 
			  return 1; 
		  else 
			  return -1;
		/*
		 * if ((this.age) == ((Student) o).age) return 0; else if ((this.age) >
		 * ((Student) o).age) return 1; else return -1;
		 */
		//return this.age-((Student)o).age;
	}
//	

	
	  
	 

}
