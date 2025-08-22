package tasks.collections;

import java.util.HashSet;

public class SetProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashSet of Strings
        HashSet<String> set = new HashSet<>();

        // Add values (including duplicates)
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");   // duplicate
        set.add("Python"); // duplicate

        // Print the HashSet
        System.out.println("HashSet contents: " + set);

	}

}
