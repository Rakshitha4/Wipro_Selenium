package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


class Student{
	int rollNo;
	String name;
	
//	parametarized constructor
	Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollNo+" "+name;
	}
}

class SortByRoll implements Comparator<Student>{
//	compare/sort by roll number in ascending order
	@Override
	public int compare(Student o1, Student o2) {
		return o1.rollNo-o2.rollNo;
	}
}

public class ComparatorInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> sObj=new ArrayList<>();
		sObj.add(new Student(111,"Maya"));
		sObj.add(new Student(131,"Alex"));
		sObj.add(new Student(110,"Clare"));
		sObj.add(new Student(101,"Jack"));
		
		Collections.sort(sObj, new SortByRoll());
		System.out.println("Sorted by Roll Number: ");
		
		Iterator<Student> itr=sObj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
