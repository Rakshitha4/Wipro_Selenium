package tasks.javafundamentals;

import java.util.Scanner;

public class Task10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = new int[10];
		 Scanner sc = new Scanner(System.in);
		 int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		 for (int i = 0; i < a.length; i++) {
			 a[i] = sc.nextInt();
			 sum += a[i];
		 	if (a[i] < min) min = a[i];
		 	if (a[i] > max) max = a[i];
		 }
		 System.out.println("Average: " + (sum/10.0));
		 System.out.println("Min: " + min + ", Max: " + max);

	}

}
