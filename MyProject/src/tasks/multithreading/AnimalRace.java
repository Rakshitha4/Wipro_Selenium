package tasks.multithreading;

public class AnimalRace extends Thread{
	 public AnimalRace(String name) {
		 super(name);
	 }
	 
	public void run() {
		 for(int i = 1; i <= 5; i++) {
			 System.out.println(getName() + " running " + i);
			 try {
				 Thread.sleep((int)(Math.random() * 1000));
			 } catch(Exception e) {}
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new AnimalRace("Tortoise").start();
		 new AnimalRace("Rabbit").start();
		 new AnimalRace("Dog").start();

	}

}
