package javaoops.polymorphism;

class A1{
	void addition(int x,int y) {
		int res;
		res=x+y;
		System.out.println("sum is - A1:" + res);
	}
}
//B1 overrides(replaces) addition of A1
class B1 extends A1{
	void addition(int x,int y) {
		int res;
		res=x+y;
		System.out.println("sum is - B1:" +res);
	}
}
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A1 obj = new B1(); or
		B1 obj = new B1();
		obj.addition(40,30);
	}

}
