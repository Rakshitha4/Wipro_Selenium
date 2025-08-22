package tasks.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsWithJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // Original list of strings
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "C++", "Ruby", "Julia");

        // Use Stream API to filter strings starting with "J"
        List<String> filtered = languages.stream()
                                         .filter(s -> s.startsWith("J"))
                                         .collect(Collectors.toList());

        // Print the filtered list
        System.out.println("Strings starting with 'J': " + filtered);

	}

}
