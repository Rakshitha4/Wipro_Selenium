package tasks.javafundamentals;

public class Task8b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		 System.out.println(a++); // 5
		 System.out.println(++a); // 7
		 int x = 8;
//		 binary conversion with shifts bitwise
		 System.out.println(x >> 1); // 4
		 System.out.println(x << 1); // 16
		 boolean b1 = true, b2 = false;
//		 if both are true then & and && will be true else both are false in all the cases
		 System.out.println(b1 & b2); // false (bitwise)
		 System.out.println(b1 && b2); // false (logical)


	}

}
