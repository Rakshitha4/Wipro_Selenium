package javafilehandling;

import java.io.File;
import java.io.IOException;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj=new File("info.txt");
		try {
			if(obj.createNewFile()) {
				System.out.println("File created:" + obj.getName());		
			}else {
				System.out.println();		
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
