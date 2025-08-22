package tasks.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapbyKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    Create and populate an unsorted HashMap
        HashMap<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(3, "Banana");
        unsortedMap.put(1, "Apple");
        unsortedMap.put(5, "Mango");
        unsortedMap.put(2, "Grapes");
        unsortedMap.put(4, "Orange");

        // Convert HashMap to TreeMap to sort by keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(unsortedMap);

        // Print the sorted map
        System.out.println("Sorted Map (by keys):");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

	}

}
