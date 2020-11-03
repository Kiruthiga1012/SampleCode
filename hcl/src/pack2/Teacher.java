package pack2;
import pack1.*;

public class Teacher extends Person {
	public void speak() {
		System.out.println("In teacher class speak method");
	}
	public void welcome() {
		System.out.println("In teacher class welcome method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=new Teacher();
		//Teacher obj=new Teacher();
		obj.meth1();
		obj.meth2();
		obj.speak();
		obj.welcome();
		

	}

}
