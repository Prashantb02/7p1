package java_seminar;
import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		String name;
		int age;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name:");
		name =sc.next();
		System.out.println("Your Name is:"+name);
		System.out.println("Enter your age:");
		age= sc.nextInt();
		System.out.println("Your Age is:"+age);
		

	}

}
