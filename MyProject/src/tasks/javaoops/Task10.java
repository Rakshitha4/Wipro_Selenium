package tasks.javaoops;

interface Logger {
	 default void logInfo() {
		 System.out.println("Default Info Log");
	 }
	 
	 static void logError() {
		 System.out.println("Static Error Log");
	 }
}
	class AppLogger implements Logger {}


public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AppLogger logger = new AppLogger();
		 logger.logInfo();
		 Logger.logError(); // Static method

	}

}
