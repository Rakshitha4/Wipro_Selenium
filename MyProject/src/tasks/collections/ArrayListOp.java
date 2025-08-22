package tasks.collections;

import java.util.ArrayList;

public class ArrayListOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create ArrayList of Strings
        ArrayList<String> languages = new ArrayList<>();

        // Add 5 elements
        languages.add("Java");
        languages.add("C");
        languages.add("C++");
        languages.add("Ruby");
        languages.add("Python");

        // Remove 2nd element (index 1, which is "C")
        languages.remove(1);

        // Print the updated list
        System.out.println(languages);
		

	}

}
