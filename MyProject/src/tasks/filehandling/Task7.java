package tasks.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 BufferedWriter writer = new BufferedWriter(new FileWriter("app.log", true));
			 String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			 writer.write("[" + timestamp + "] Application started\n");
			 writer.close();
			 } catch (IOException e) {
				e.printStackTrace();
			 }


	}

}
