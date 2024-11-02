package java_seminar;

import java.util.Scanner;

public class voting {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the age of the person:");
		int age=obj.nextInt();
		if(age>=18) {
			System.out.println(age+" is a eligible for voting");
		}
		else {
			System.out.println(age+" is not eligible for voting");
		}
		}
	}

}
