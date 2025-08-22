package tasks.wrapperclass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreboardApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, List<Integer>> students = new HashMap<>();
		 
		 students.put("Alice", Arrays.asList(85, 90, 95));
		 students.put("Bob", Arrays.asList(70, 75, 80));
		 students.put("Charlie", Arrays.asList(88, 92, 86));
		 
		 String topStudent = "";
		 double highestAvg = 0;
		 
		 for (String name : students.keySet()) {
			 List<Integer> marks = students.get(name);
			 int sum = 0;
			 for (int mark : marks) sum += mark;
			 double avg = sum / (double) marks.size();
			 
			 System.out.println(name + " Average: " + avg);
			 
			 if (avg > highestAvg) {
				 highestAvg = avg;
				 topStudent = name;
			 }
		 }
		 
		 System.out.println("Top Scorer: " + topStudent + " with Avg: " + highestAvg);

	}

}
