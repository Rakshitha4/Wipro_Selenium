package tasks.exceptionhandling;

interface Info {
	 static void showDetails() {
	 System.out.println("Static method in Interface");
	 }
	}

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Info.showDetails();

	}

}
