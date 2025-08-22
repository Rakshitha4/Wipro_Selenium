package javaeightinterface;

interface MyData{
	default void display(String msg) {
		if(!isNull(msg)) {
			System.out.println("Message is: " +msg);
		}else {
			System.out.println("Message is Null....");
		}
	}

	static boolean isNull(String msg) {
		System.out.println("Inteface Null Check...");
		return msg == null ? true : false;
	}
}

public class Sample3 implements MyData{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 obj = new Sample3();
		obj.display(null);

	}

}
