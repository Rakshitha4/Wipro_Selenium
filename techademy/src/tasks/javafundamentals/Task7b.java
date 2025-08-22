package tasks.javafundamentals;

public class Task7b {
//	default values of uninitialized instance variables
	int i;
	boolean b;
	char c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task7b obj = new Task7b();
		System.out.println("int: " + obj.i); // 0
		System.out.println("boolean: " + obj.b); // false
		System.out.println("char: '" + obj.c + "'"); // '\u0000'


	}

}
