package tasks.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task13 {

    public static void main(String[] args) {
        // Try-with-resources automatically closes files
        try (
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.replace("Java", "Python"));
                bw.newLine(); // To preserve line breaks properly
            }

            System.out.println("Replacement completed. Check output.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
