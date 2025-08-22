package tasks.wrapperclass;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 10;
		 double d = 25.67;
		 char c = 'Z';
		 
		 // Primitive to Wrapper
		 Integer intObj = Integer.valueOf(a);
		 Double doubleObj = Double.valueOf(d);
		 Character charObj = Character.valueOf(c);
		 
		 // Wrapper to Primitive
		 int a2 = intObj.intValue();
		 double d2 = doubleObj.doubleValue();
		 char c2 = charObj.charValue();
		 
		 System.out.println("Primitive to Wrapper: " + intObj + ", " + doubleObj + ", " + charObj);
		 System.out.println("Wrapper to Primitive: " + a2 + ", " + d2 + ", " + c2);


	}

}
