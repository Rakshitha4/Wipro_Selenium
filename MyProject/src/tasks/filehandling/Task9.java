package tasks.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task9 {

    public static void main(String[] args) {
        int lines = 0, words = 0, chars = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                // Splitting line into words
                String[] wordList = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordList.length;
                }

                // Count characters excluding spaces
                chars += line.replaceAll("\\s", "").length();
            }

            br.close();

            // Output
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters (no spaces): " + chars);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
