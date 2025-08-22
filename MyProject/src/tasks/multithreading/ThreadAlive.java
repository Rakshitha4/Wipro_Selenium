package tasks.multithreading;


public class ThreadAlive extends Thread{
	 public void run() {
		 System.out.println("Thread running...");
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		 ThreadAlive t = new ThreadAlive();
		 System.out.println("Is Alive before start: " + t.isAlive());
		 t.start();
		 System.out.println("Is Alive after start: " + t.isAlive());
		 t.join();
		 System.out.println("Is Alive after join: " + t.isAlive());

	}

}
