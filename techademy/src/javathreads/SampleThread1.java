package javathreads;

public class SampleThread1 extends Thread{
	
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleThread1 obj = new SampleThread1();
		obj.start();

	}

}
