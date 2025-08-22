package tasks.javaoops;

abstract class Shape {
	 abstract double area();
}
	
class Circle extends Shape {
	 double radius;
	 Circle(double r) {
		 radius = r;
	 }
	 double area() {
	 return Math.PI * radius * radius;
	 }
}
	class Rectangle extends Shape {
	 double length, width;
	 Rectangle(double l, double w) {
		 length = l;
		 width = w;
	 }
	 double area() {
		 return length * width;
	 }
}


public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape s1 = new Circle(5);
		 Shape s2 = new Rectangle(4, 6);
		 System.out.println("Area of Circle: " + s1.area());
		 System.out.println("Area of Rectangle: " + s2.area());

	}

}
