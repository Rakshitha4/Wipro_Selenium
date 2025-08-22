package array;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]= {40, 60, 80, 50, 70, 90};
		System.out.println(marks.length);
		System.out.println(marks[2]);
		
//		displaying all elements of array
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
//		for each loop
		for(int i : marks) {
			System.out.println(i);
		}
		
		

	}

}
