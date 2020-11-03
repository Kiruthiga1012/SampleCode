package day10;

class NewThread extends Thread {
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Child Thread " +i);
				Thread.sleep(600);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child thread");
	}

}
public class ExtendThread{
	public static void main(String[] args) {
		NewThread t=new NewThread();
		t.setName("Demo Thread");
		System.out.println("Child Thread : " +t);
		
		t.start();
		
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main Thread " +i);
				Thread.sleep(300);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main interrupted");
		}
		System.out.println("Exiting Main thread");
	}
}