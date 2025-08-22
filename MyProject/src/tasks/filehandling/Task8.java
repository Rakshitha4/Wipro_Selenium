package tasks.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			// Append new contact to file
			BufferedWriter writer = new BufferedWriter(new FileWriter("contacts.txt", true));
			
			System.out.print("Enter name: ");
			String name = sc.nextLine();

			System.out.print("Enter phone: ");
			String phone = sc.nextLine();

			writer.write(name + " - " + phone + "\n");
			writer.close();

			// Display all contacts
			System.out.println("All Contacts:");
			BufferedReader reader = new BufferedReader(new FileReader("contacts.txt"));
			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();

		} catch (IOException e) {
			e.printStackTrace();  // Shows error if file can't be read/written
		} finally {
			sc.close();  // Always close Scanner to avoid resource leaks
		}
	}
}
