package javagenerics;

import java.util.ArrayList;

//ArrayList without Generics

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		generics are not added
		ArrayList a1=new ArrayList();
		a1.add("Alex");
		a1.add("Bob");
		a1.add(30);
		
		String s1=(String) a1.get(0);
		String s2=(String) a1.get(1);
		String s3=(String) a1.get(2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
