package day10;

import java.util.Random;

class CommonObject1 implements Runnable {
	int num;
	Random r = new Random();
	CommonObject1 co;

	public CommonObject1(CommonObject1 co) {
		this.co = co;
		num = r.nextInt(10);

	}

	public void run() {
		try {
			synchronized (co) {

				System.out.println("Thread :" + Thread.currentThread() + "   " + co.num);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class ThreadTest2 {
	public ThreadTest2() {
		CommonObject1 co = new CommonObject1(co);
		Thread t1 = new Thread(new CommonObject1(co));

		Thread t2 = new Thread(new CommonObject1(co));
		t1.start();

		t2.start();

	}

	public static void main(String[] args) {
		new ThreadTest2();
	}
}
