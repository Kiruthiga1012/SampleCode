package day9;

import java.util.HashSet;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp(12,"ABC");
		Emp e2=new Emp(13,"DEC");
		Emp e3=new Emp(12,"ABC");
		Emp e4=new Emp(14,"KKK");
		HashSet<Emp> hs=new HashSet<Emp>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		
		System.out.println(hs.size());
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		
		
		
	}

}
