package tasks.filehandling;

import java.io.*;  // Importing all necessary I/O classes

class Student implements Serializable {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

public class Task5 {

    public static void main(String[] args) {
        try {
            // Creating and serializing Student object
            Student s = new Student("Rahul", 101, 85);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
            oos.writeObject(s);
            oos.close();

            // Deserializing Student object
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
            Student obj = (Student) ois.readObject();
            ois.close();

            // Printing deserialized data
            System.out.println("Deserialized Student:");
            System.out.println("Name: " + obj.name + ", Roll No: " + obj.rollNo + ", Marks: " + obj.marks);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();  // Handles both IO and ClassNotFound exceptions
        }
    }
}
