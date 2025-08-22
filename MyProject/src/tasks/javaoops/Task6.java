package tasks.javaoops;

class Calculator {
	 int add(int a, int b) {
		 return a + b;
	 }
	 double add(double a, double b) {
		 return a + b;
	 }
	 String add(String a, String b) {
		 return a + b;
	 }
}

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calculator calc = new Calculator();
		 System.out.println("Int Add: " + calc.add(2, 3));
		 System.out.println("Double Add: " + calc.add(2.5, 3.5));
		 System.out.println("String Add: " + calc.add("Hello", "World"));

	}

}
