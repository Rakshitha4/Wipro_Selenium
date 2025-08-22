package tasks.javafundamentals;

public class Task9c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, num = 2;
		while (count < 10) {
			boolean prime = true;
			for (int i = 2; i <= num/2; i++) {
				if (num % i == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(num);
				count++;
			}
			num++;
		}

	}

}
