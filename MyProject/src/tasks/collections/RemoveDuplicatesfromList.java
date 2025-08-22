package tasks.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesfromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Original list with duplicates
        List<String> languages = Arrays.asList("Java", "C", "Java", "Python");

        // Use a LinkedHashSet to remove duplicates while preserving order
        Set<String> uniqueLanguages = new LinkedHashSet<>(languages);

        // Convert back to a list if needed
        List<String> resultList = new ArrayList<>(uniqueLanguages);

        // Print the result
        System.out.println(resultList);

	}

}
