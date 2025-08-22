package tasks.wrapperclass;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Double> marks = new ArrayList<>();
		 marks.add(85.5); // autoboxing
		 marks.add(90.0);
		 marks.add(78.25);
		 
		 double sum = 0;
		 for (double m : marks) { // unboxing
			 sum += m;
		 }
		 double avg = sum / marks.size();
		 
		 System.out.println("Marks: " + marks);
		 System.out.println("Average: " + avg);


	}

}
