package day10;

class Callme {

	   void  call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

// File Name : Caller.java
class Caller implements Runnable {
	String  msg;
	Callme target;

	Thread t;

	public Caller(Thread t,Callme targ, String s) {
		t = new Thread(this);
		target = targ;
		msg = s;
		
		t.start();
	}

	// synchronized calls to call()
	public void run() {
		synchronized(target) { // synchronized block  or statement
		target.call(msg);
		}
	}
}

class Synchronization {
	public static void main(String args[]) {
		
		Callme target1 = new Callme();
        Thread t=null;
    	Caller ob2 = new Caller(t,target1,"Synchronize");
		Caller ob1 = new Caller(t,target1,"Hello");
		Caller ob3 = new Caller(t,target1,"World");

	}
}
