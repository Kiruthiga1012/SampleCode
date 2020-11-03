package day10;

import java.util.*;

class Addition implements Runnable {
	int a;

	public Addition(int a) {
		this.a = a;
	}

	public void run() {
		addRandom();
	}

	public void addRandom() {
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		//for (int i = 0; i < 5; i++) {
			System.out.println("Thread being generated: " + n);
		//}
		//synchronized (this) {
			a += n;
		//}

	}
}

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		Addition sum = new Addition(x);

		Thread t1 = new Thread(sum);
		Thread t2 = new Thread(sum);
		Thread t3 = new Thread(sum);
		Thread t4 = new Thread(sum);
		Thread t5 = new Thread(sum);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.print("Sum of 5 threads: " + sum.a);

	}

}
