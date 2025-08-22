package javathreads;

//with Thread synchronization
class PrintDemo1{
	public void printCount() {
		try {
			for(int i=5; i>0 ;i--) {
				System.out.println("Count: " + i);
			}
		}catch(Exception ex) {
			System.out.println("Thread Interrupted...");
		}
	}
}

class Task2a extends Thread{
	private Thread t;
	private String threadName;
	PrintDemo PD;
	
	Task2a(String threadName,PrintDemo PD){
		this.threadName=threadName;
		this.PD=PD;
	}
	
	public void run() {
		synchronized (PD) {
			
		}
		PD.printCount();
		System.out.println("Thread " + threadName + "exiting.");
	}
	public void start() {
		System.out.println("Satrting... " + threadName);
		if(t == null) {
			t=new Thread(this, threadName);
			t.start();
		}
	}
}

public class SynchronizedThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
