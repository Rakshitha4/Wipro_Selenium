package tasks.javafundamentals;

public class Task8b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		
		System.out.println("original int value: " +x);
		System.out.println("Post-increment: "+(x++));
		System.out.println("Pre-increment: "+(++x));
		
//		Bitwise shift operator
		System.out.println("Bitwise left shift: "+(x<<1));
		System.out.println("Bitwise right shift: "+(x>>1));

//		logical vs bitwise AND
		boolean a=true;
		boolean b=false;
		
		System.out.println("Logical AND (a&&b): "+(a && b)); // if both values true, output will be false
		System.out.println("Bitwise AND (a&b): "+(a & b)); //false
		
//		with interger
		int c=6; //binary conversion 0110
		int d=7; // 0011
		System.out.println("Bitwise AND (m&n): " +(c&d));
		System.out.println("Bitwise OR (m|n): " +(c|d));
	}

}
