package tasks.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // Create a list with duplicate values
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Java");
        languages.add("Ruby");

        // Count frequency of "Java"
        int count = Collections.frequency(languages, "Java");

        // Print the result
        System.out.println("\"Java\" appears " + count + " times in the list.");

	}

}
