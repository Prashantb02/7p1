package java_seminar;
import java.io.File;
import java.io.IOException;//imports the file class and ioexception class to handle errors

public class CreateFile {
	

	public static void main(String[] args) {
		try {
			File myobj = new File("demo.txt");
			
			if(myobj.createNewFile()) {
				System.out.println("File Created "+myobj.getName());
			}
			else {
				System.out.println("File already exists");
			}
		}catch(IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
			
		}
		
	}

}
