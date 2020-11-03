package day11;
@FunctionalInterface
interface GreatestOfTwoNumbers{
	void greatest(int num1,int num2);
}
public class GreatestOf2Nums_Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatestOfTwoNumbers obj=(num1,num2)->
		{
			if(num1>num2)
				System.out.println("Greatest number " +num1);
			else
				System.out.println("Greatest number " +num2);
		};
		obj.greatest(10, 20);
	}

}
