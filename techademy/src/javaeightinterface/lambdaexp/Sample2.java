package javaeightinterface.lambdaexp;
interface ZeroParameter{
	void display();
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroParameter obj = () -> System.out.println("Tis is Zero Parametrized");
		obj.display();

	}

}
