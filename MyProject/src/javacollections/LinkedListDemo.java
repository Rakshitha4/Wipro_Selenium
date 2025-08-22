package javacollections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> I1=new LinkedList<Integer>();
		for(int i=1;i<=5;i++)
			I1.add(i);
		
		System.out.println(I1);
		
		I1.remove(3);
		
		System.out.println(I1);
		
		for(int i=0;i<I1.size();i++) {
			System.out.print(I1.get(i)+ " ");
		}

	}

}
