package tasks.collections;

import java.util.ArrayList;
import java.util.Collections;

//Student class implementing Comparable
class Student implements Comparable<Student> {
 String name;
 int marks;

 // Constructor
 public Student(String name, int marks) {
     this.name = name;
     this.marks = marks;
 }

 // toString for easy printing
 public String toString() {
     return name + " - " + marks;
 }

 // Compare students by marks (ascending)
 @Override
 public int compareTo(Student other) {
     return this.marks - other.marks;
 }
}

public class ComparableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create a list of students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));
        students.add(new Student("David", 88));

        // Sort the list
        Collections.sort(students);

        // Print the sorted list
        System.out.println("Students sorted by marks (ascending):");
        for (Student s : students) {
            System.out.println(s);
        }

	}

}
