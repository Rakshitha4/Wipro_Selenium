package tasks.multithreading;

public class MyPrinterThread extends Thread{
	 public void run() {
		 for(int i = 0; i < 5; i++) {
			 System.out.println("Hello from Thread!");
			 try {
				 Thread.sleep(1000); // 1 second
			 } catch (InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyPrinterThread t = new MyPrinterThread();
		 t.start();
	}

}
