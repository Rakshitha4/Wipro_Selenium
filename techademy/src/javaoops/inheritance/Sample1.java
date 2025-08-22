package javaoops.inheritance;


//Parent class
class A{
	int num1=10;
}

//Child class
class B extends A{
	int num2=20;
	int res;
	void addition() {
		res=num1+num2;
		System.out.println("Result is: "+ res);
	}
}



public class Sample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.addition();

	}

}

