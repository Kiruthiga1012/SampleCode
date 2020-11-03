package day11;
interface Transaction{
	void withdraw(int amt);
}
public class LamdaExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction obj=(int amt)->System.out.println("amt " +amt);
		obj.withdraw(100);
	}

}
