package tasks.javaoops;

class BankAccount {
	 private double balance;
	 
	 public void deposit(double amount) {
		 if (amount > 0) {
			 balance += amount;
		 }
	 }
	 
	 public void withdraw(double amount) {
		 if (amount <= balance) {
			 balance -= amount;
		 }
	 }
	 
	 public double getBalance() {
		 return balance;
	 }
}

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccount acc = new BankAccount();
		 acc.deposit(1000);
		 acc.withdraw(300);
		 System.out.println("Remaining Balance: ₹" + acc.getBalance());

	}

}
