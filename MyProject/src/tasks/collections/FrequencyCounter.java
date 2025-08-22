package tasks.collections;

import java.util.HashMap;

public class FrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       String input = "hello";

	        // Create a HashMap to store character frequencies
	        HashMap<Character, Integer> frequencyMap = new HashMap<>();

	        // Iterate over each character in the string
	        for (char ch : input.toCharArray()) {
	            // If the character is already in the map, increment its count
	            if (frequencyMap.containsKey(ch)) {
	                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
	            } else {
	                frequencyMap.put(ch, 1);
	            }
	        }

	        // Print the frequency map
	        System.out.println(frequencyMap);

	}

}
