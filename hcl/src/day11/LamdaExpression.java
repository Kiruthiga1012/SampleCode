package day11;
interface Task1{
	 void add(int num);
}

interface Task2{
	 void sum(int num1,int num2);
}

interface Task3{
	 void length(String str);
}

interface Task4{
	 void print(String string);
}
public class LamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 t1=(num)->System.out.println(10+num);
		t1.add(20);
		
		Task2 t2=(num1,num2)->System.out.println(num1+num2);
		t2.sum(10, 20);
		
		Task3 t3=(str)->System.out.println(str.length());
		t3.length("Hello");
		
		Task4 t4=(string)->System.out.println(string);
		t4.print("Hello World");
	}

}
