package tasks.collections;

import java.util.TreeSet;

public class SortedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // Create a TreeSet to store integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add integers (unsorted and with duplicates)
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20); // duplicate

        // Print the TreeSet
        System.out.println("Sorted set: " + numbers);

	}

}
