package tasks.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Student class
class Student2 {
	String name;
	int marks;

 // Constructor
 public Student2(String name, int marks) {
     this.name = name;
     this.marks = marks;
 }

 // toString method for readable output
 @Override
 public String toString() {
     return name + " - " + marks;
 }
}


public class CustomComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // Create a list of students
        ArrayList<Student2> students = new ArrayList<>();
        students.add(new Student2("Charlie", 78));
        students.add(new Student2("Alice", 85));
        students.add(new Student2("David", 88));
        students.add(new Student2("Bob", 92));

        // Sort by name using Comparator
        Collections.sort(students, new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                return s1.name.compareTo(s2.name); // Alphabetical order
            }
        });

        // Print the sorted list
        System.out.println("Students sorted by name (alphabetically):");
        for (Student2 s : students) {
            System.out.println(s);
        }

	}

}
