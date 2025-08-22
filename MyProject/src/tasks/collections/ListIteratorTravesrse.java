package tasks.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTravesrse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Create and populate an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Get a ListIterator
        ListIterator<String> iterator = fruits.listIterator();

        // Traverse forward
        System.out.println("Forward traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Traverse backward
        System.out.println("\nBackward traversal:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

	}

}
