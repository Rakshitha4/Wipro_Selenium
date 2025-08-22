package tasks.wrapperclass;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer a = 100; // autoboxing
		 Integer b = new Integer(100); // explicit wrapper
		 System.out.println("== result: " + (a == b)); // false (reference comparison)
		 System.out.println(".equals() result: " + a.equals(b)); // true (value comparison)
	}

}
