package day5;
abstract class Person{
	void meth1() {
		System.out.println("In person class meth1");
	}
	 abstract void speak();
	 abstract void welcome();
}
class Teacher extends Person{
	void speak() {
		System.out.println("In teacher class speak method");
	}
	void welcome() {
		System.out.println("Welcome in teacher class");
	}
}
abstract class Student extends Person{
	void speak() {
		System.out.println("In student class speak method");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=new Teacher();
		Teacher obj1=new Teacher();
		obj.meth1();
		obj.speak();
		obj1.meth1();
		obj1.speak();
		}

}
