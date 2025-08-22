package tasks.multithreading;

public class RunnableCounter implements Runnable{
	 public void run() {
		 for(int i = 1; i <= 10; i++) {
			 System.out.println("Count: " + i);
		 }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RunnableCounter task = new RunnableCounter();
		 Thread thread = new Thread(task);
		 thread.start();

	}

}
