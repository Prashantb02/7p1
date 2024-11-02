package java_seminar;
import java.io.*;
import java.util.*;

public class ReadMyFile {

	public static void main(String[] args) {
		try {
			File myobj = new File("prashant.txt");
			Scanner myreader = new Scanner(myobj);
			while(myreader.hasNextLine()) {
				String data = myreader.nextLine();
				System.out.println(data);
			}
			myreader.close();
		}catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();

		}

	}

}
