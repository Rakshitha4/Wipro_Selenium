package javaconditions;

public class Switchcase1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="one";
			switch(day) {
				case "one": 
					System.out.println("Monday");
					break;
				case "two": 
					System.out.println("Tuesday");
					break;
				case "three": 
					System.out.println("Wednesday");
					break;
				case "four": 
					System.out.println("Thursday");
					break;
				case "five": 
					System.out.println("Friday");
					break;
				case "six": 
					System.out.println("Saturday");
					break;
				case "seven": 
					System.out.println("Sunday");
					break;
				default:
					System.out.println("Enter day between one to seven");
					break;
			}
		}
}
