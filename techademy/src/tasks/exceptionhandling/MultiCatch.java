package tasks.exceptionhandling;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 	int[] arr = new int[5];
			 	arr[5] = 100 / 0;
			 } catch (ArithmeticException e) {
				 System.out.println("Divide by zero error.");
			 } catch (ArrayIndexOutOfBoundsException e) {
				 System.out.println("Array index error.");
			 }

	}

}
