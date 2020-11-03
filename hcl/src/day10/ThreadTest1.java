package day10;

import java.util.*;

class RandomNumber extends Thread{
	int[] num=new int[5];
	//RandomNumber rm1;
	public RandomNumber() {
		//rm1=rm;
		Random r=new Random();
		for(int i=0;i<num.length;i++) {
			num[i]=r.nextInt(10);
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
	}
	public void add(int[] n) {
		for(int j=0;j<n.length;j++)
			n[j]+=n[j];
	System.out.println(n);
	}
	public void run() {
		synchronized {
			add(num);
		}
	}
}
public class ThreadTest1 {

	public static void main(String[] args) {

		//RandomNumber r1=new RandomNumber();
		Thread t1=new Thread(new RandomNumber());
		
		//RandomNumber r3=new RandomNumber();
	}

}
