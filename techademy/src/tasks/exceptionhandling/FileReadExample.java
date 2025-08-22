package tasks.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BufferedReader reader = null;
		 try {
			 reader = new BufferedReader(new FileReader("data.txt"));
			 System.out.println(reader.readLine());
		 } catch (IOException e) {
			 System.out.println("Error reading file");
		 } finally {
		 try {
			 if (reader != null) reader.close();
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
		 	System.out.println("File closed.");
		 }

	}

}
