package javaexceptions;

public class Sample6 {
//	try with multiple catch
	public static void main(String[] args) {
		try {
			String name=null;
			System.out.println(name.length());
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
