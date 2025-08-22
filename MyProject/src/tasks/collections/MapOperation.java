package tasks.collections;

import java.util.HashMap;
import java.util.Map;

public class MapOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create HashMap of roll numbers and student names
        HashMap<Integer, String> students = new HashMap<>();

        // Add 5 entries
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Eva");

        // Remove one entry (e.g., roll number 103)
        students.remove(103);

        // Iterate using entrySet()
        System.out.println("Student Roll Numbers and Names:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

	}

}
