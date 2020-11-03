package day10;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator;

import java.util.List;

import java.util.ListIterator;

public class Compare_Student {

	public static void main(String a[]) {

		Student st1 = new Student("gaurav", 24);

		Student st2 = new Student("Amit", 20);

		Student st3 = new Student("Annu", 23);

		Student st4 = new Student("Mohit", 21);

		List<Student> ls = new ArrayList<Student>();

		ls.add(st1);

		ls.add(st2);

		ls.add(st3);

		ls.add(st4);

		Collections.sort(ls);

		Iterator itr = ls.iterator();

		while (itr.hasNext()) {

			Object element = itr.next();

			Student st = (Student) element;

			System.out.println("name ::" + st.name + " Age :" + st.age + "\n");

		}

	}

}

class Student implements Comparable {

	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object o)

	{
		int i=name.compareToIgnoreCase(((Student)o).name);
		  
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
