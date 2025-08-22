package tasks.multithreading;

public class CounterThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Counting:" +i);
			try {
				Thread.sleep(1000); //which is 1 sec
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		CounterThread t=new CounterThread();
		t.start();
		t.join(); //main thread waits here
		System.out.println("Main thread done.");
	}

}
