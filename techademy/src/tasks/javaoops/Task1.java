package tasks.javaoops;
class Book{
	String title;
	String author;
	double price;
	
	void displayDetails() {
	System.out.println("Title: " + title);
	System.out.println("Author: " + author);
	System.out.println("Price: ₹" + price);
	 }
}

public class Task1 {
	public static void main(String[] args) {
		 Book b1 = new Book();
		 b1.title = "Java in Depth";
		 b1.author = "K. Sharma";
		 b1.price = 599.0;
		
		 Book b2 = new Book();
		 b2.title = "Effective Java";
		 b2.author = "Joshua Bloch";
		 b2.price = 499.0;
		 
		 b1.displayDetails();
		 b2.displayDetails();
	}
	
}


