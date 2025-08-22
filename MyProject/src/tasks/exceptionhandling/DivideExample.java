package tasks.exceptionhandling;

import java.util.Scanner;

public class DivideExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int num;
		 System.out.print("Enter a number: ");
		 num = sc.nextInt();
		 try {
			 int result = 100 / num;
			 System.out.println("Result: " + result);
		 } catch (ArithmeticException e) {
			 System.out.println("Cannot divide by zero!");
		 }

	}

}
