package javawrapperclass;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		primitive data type
		int number;
		
//		Integer wrapper type
		Integer number1;
		
		number=200;
//		Auto boxing; converting primitive type to wrapper object type 
//		converting primitive int to Integer Object
		number1=number;
		
		System.out.println("The primitive int number is: " + number);
		System.out.println("The primitive int number is: " + number1);
	}

}
