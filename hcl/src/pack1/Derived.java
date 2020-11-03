package pack1;
import pack2.*;

public class Derived extends Base implements I{
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
	}
	public void meth3() {
		System.out.println("meth3");
	}
	public void meth4() {
		System.out.println("meth4");
	}
	public void meth5() {
		System.out.println("meth5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d=new Derived();
		d.con();
		d.con1();
		d.meth1();
		d.meth2();
		d.meth3();
		d.meth4();
		d.meth5();

	}

}
