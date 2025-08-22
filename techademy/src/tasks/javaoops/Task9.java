package tasks.javaoops;

import model.Student;
import service.StudentService;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s = new Student();
		 s.name = "Arjun";
		 s.age = 21;
		 StudentService ss = new StudentService();
		 ss.printStudent(s);

	}

}
