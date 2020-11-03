package day10;
class New_Thread implements Runnable{
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
public class Implement_Thread {

	public static void main(String[] args) {
		
		New_Thread obj=new New_Thread();
		Thread t=new Thread(obj);
		t.start();
		
		System.out.println("State of thread t" +t.getState());
		
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main Thread " +i);
				Thread.sleep(300);
			}
			t.join();
		}
		
		
		catch(InterruptedException e) {
			System.out.println("Main interrupted");
		}
		System.out.println("Exiting Main thread");
		
	}

}
