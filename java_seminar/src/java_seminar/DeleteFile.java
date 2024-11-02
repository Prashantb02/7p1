package java_seminar;
import java.io.*;

public class DeleteFile {

	public static void main(String[] args) {
		File myobj = new File("prashant.txt");
		if(myobj.delete()) {
			System.out.println("Deleted the file: "+myobj.getName());
		}
		else {
			System.out.println("Failed to delete the file");
			
		}
		
	}

}
