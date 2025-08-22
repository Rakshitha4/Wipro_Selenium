package variables;

import java.util.Scanner;

public class Sample5 {
	
	static int addition(int x, int y) {
		int res;
		res=x+y;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter n1: ");
		 int n1;
		 n1=sc.nextInt();
		 System.out.println("Enter n2: ");
		 int n2;
		 n2=sc.nextInt();
		 int res;
		 res=addition(n1, n2);
		 System.out.println("Sum of 2 numbers: " + res);

	}

}
