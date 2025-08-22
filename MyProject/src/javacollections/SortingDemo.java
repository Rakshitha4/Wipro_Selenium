package javacollections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Zeo");
		a1.add("Clare");
		a1.add("Toni");
		a1.add("Alen");
		
//		sort method provided by collection, by passing a list
		Collections.sort(a1);
		System.out.println(a1);
		
//	to sort in descending/reverse order
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println(a1);

	}

}
