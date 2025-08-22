package tasks.javaoops;

class Vehicle {
	 String brand;
	 int speed;
	 
	 void showDetails() {
		 System.out.println("Brand: " + brand + ", Speed: " + speed + "km/h");
	 }
}
	class Car extends Vehicle {
		int wheels = 4;
	}
	class Bike extends Vehicle {
		int wheels = 2;
	}

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car = new Car();
		 car.brand = "Honda";
		 car.speed = 180;
		 car.showDetails();
		 
		 Bike bike = new Bike();
		 bike.brand = "Yamaha";
		 bike.speed = 120;
		 bike.showDetails();

	}

}
