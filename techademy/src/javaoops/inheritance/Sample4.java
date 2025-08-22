package javaoops.inheritance;

//Hybrid-Inheritance
class A4{
	double pi=3.14;
}

class B4 extends A4{
	//area_of_circle=2*pi*radius
	void area_of_circle() {
		double res;
		res=2*pi*5;
		System.out.println("Area of circle:" + res);
	}
}

class C4 extends A4{
	//surface_area_of_Sphere=4*pi*r
	void surface_area_of_Sphere() {
		double res;
		res=4*pi*5;
		System.out.println("Surface area of Sphere:" +res);
	}
}

// here we need to change B4 and C4 to get area of circle and sphere
class D4 extends B4{ //area of circle, change B4 to C4 to get sphere value
	
}

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D4 obj = new D4();
		obj.area_of_circle();
//		obj.surface_area_of_Sphere();

	}

}
