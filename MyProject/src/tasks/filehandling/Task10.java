package tasks.filehandling;

import java.io.*;
import java.util.ArrayList;

// Student class must implement Serializable
class Student1 implements Serializable {
    String name;
    int roll;

    Student1(String n, int r) {
        name = n;
        roll = r;
    }
}

public class Task10 {

    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1("A", 1));
        list.add(new Student1("B", 2));

        try {
            // Serialize
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"));
            oos.writeObject(list);
            oos.close();

            // Deserialize
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"));
            ArrayList<Student1> students = (ArrayList<Student1>) ois.readObject();
            ois.close();

            for (Student1 s : students) {
                System.out.println(s.name + " - " + s.roll);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
