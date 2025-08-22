package tasks.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Student class
class Student3 {
	String id;
	String name;

 // Constructor
 public Student3(String id, String name) {
     this.id = id;
     this.name = name;
 }

 // toString for output
 @Override
 public String toString() {
     return id + " - " + name;
 }
}

public class ListToMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // Create a list of students
        List<Student3> students = Arrays.asList(
            new Student3("S101", "Alice"),
            new Student3("S102", "Bob"),
            new Student3("S103", "Charlie")
        );

        // Convert list to map using student ID as key
        Map<String, Student3> studentMap = new HashMap<>();
        for (Student3 s : students) {
            studentMap.put(s.id, s);
        }

        // Print the resulting map
        System.out.println("Map of Student ID to Student:");
        for (Map.Entry<String, Student3> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

	}

}
