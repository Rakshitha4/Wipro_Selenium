package tasks.javafundamentals;

public class Task10c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {5, 2, 8, 1, 3};
		 for (int i = 0; i < a.length-1; i++)
		 for (int j = 0; j < a.length-1-i; j++)
		 if (a[j] > a[j+1]) {
			 int temp = a[j];
			 a[j] = a[j+1];
			 a[j+1] = temp;
		 }
		 for (int n : a) System.out.print(n + " ");

	}

}
