package tasks.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // Create and populate an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Print original list
        System.out.println("Original List: " + list);

        // Reverse the list using Collections.reverse()
        Collections.reverse(list);

        // Print reversed list
        System.out.println("Reversed List: " + list);

	}

}
