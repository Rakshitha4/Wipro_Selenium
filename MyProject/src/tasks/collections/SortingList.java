package tasks.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a list of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);

        // Sort in ascending order
        Collections.sort(numbers);
        System.out.println("Ascending order: " + numbers);

        // Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order: " + numbers);

	}

}
