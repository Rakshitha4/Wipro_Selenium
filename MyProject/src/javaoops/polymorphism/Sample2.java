package javaoops.polymorphism;

class Calculation1{
	void add(int x,int y) {
		int res;
		res=x+y;
		System.out.println("sum is:" + res);
	}
	
	void add(double x,double y) {
		double res;
		res=x+y;
		System.out.println("sum is:" +res);
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation1 obj=new Calculation1();
		obj.add(20.2, 10.3);
		obj.add(40, 30);
		

	}

}
