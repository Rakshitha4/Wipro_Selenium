package javaoops;

public class Sample5 {
	int num=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to access a non static within a static
		Sample5 obj=new Sample5();
		System.out.println(obj.num);

	}

}
