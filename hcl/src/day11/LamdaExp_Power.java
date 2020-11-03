package day11;

import java.util.function.BiFunction;


public class LamdaExp_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Double> obj=(num1,num2)->
		{
			Double n=Math.pow(num1, num2);
			return n;
		};
		
			
		
		System.out.println(obj.apply(2,3));
	}

}
