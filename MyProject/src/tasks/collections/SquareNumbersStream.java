package tasks.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbersStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // Original list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use Stream API to square each number
        List<Integer> squared = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());

        // Print the result
        System.out.println("Squared Numbers: " + squared);

	}

}
