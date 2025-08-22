package javafilehandling;

import java.io.FileWriter;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer=new FileWriter("myFile.txt");
			writer.write("Learning File Handling in Java!!");
			writer.close();
			System.out.println("Successfully written..");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("An error has occured...");
			e.printStackTrace();
		}

	}

}
