package tasks.exceptionhandling;

public class Voter {
	 static void validateAge(int age) throws Exception {
		 if (age < 18)
			 throw new Exception("You must be 18+ to vote");
		 else
			 System.out.println("You can vote!");
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 	validateAge(16);
			 } catch (Exception e) {
				 System.out.println(e.getMessage());
			 }
	}

}
