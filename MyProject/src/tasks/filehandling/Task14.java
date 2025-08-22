package tasks.filehandling;

import java.io.*;

public class Task14 {

    public static void main(String[] args) {
        // Using try-with-resources to handle closing automatically
        try (
            BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("merged.txt"))
        ) {
            String line;

            // Write contents of file1.txt
            while ((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            // Write contents of file2.txt
            while ((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Files merged successfully into merged.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
