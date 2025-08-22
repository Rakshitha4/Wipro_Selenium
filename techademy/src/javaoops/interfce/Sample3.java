package javaoops.interfce;

//Multiple Inheritance through Interfaces

interface I2{
	void add();
}

interface I3{
	void sub();
}

public class Sample3 implements I2,I3{
	
	public void add() {
		System.out.println("Addition fun");
	}
	
	public void sub() {
		System.out.println("Subtravtion fun");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 obj = new Sample3();
		obj.add();
		obj.sub();

	}

}
