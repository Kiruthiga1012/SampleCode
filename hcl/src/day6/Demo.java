package day6;

public class Demo implements I{
	public void meth1() {
		System.out.println("In class demo meth1");
	}
	public void meth2() {
		System.out.println("In class demo meth2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj=new Demo();
		obj.meth1();
		obj.meth2();
		I.meth3();
		

	}

}
