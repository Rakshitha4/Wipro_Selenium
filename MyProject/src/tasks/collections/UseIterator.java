package tasks.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UseIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // Create and populate an ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Charlie");
        names.add("Annie");

        // Use an iterator to remove elements starting with 'A'
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove(); // Safe removal using Iterator
            }
        }

        // Print the modified list
        System.out.println("List after removing names starting with 'A':");
        System.out.println(names);

	}

}
