package javaoops.interfce;

interface MicroPhone{
	void volume();
}

public class Sample4 {
//	creating an Object to a interface through Anonymous Inner Class(AIC)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MicroPhone obj = new MicroPhone() {
			
//			here volume method is replaced here ie, its implementation is happening here
			@Override
			public void volume() {
				// TODO Auto-generated method stub
				System.out.println("volume is high !!");
				
			}
		};
		obj.volume();

	}

}
