package java_seminar;

import java.util.Scanner;

public class else_if_ladder {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num1=obj.nextInt();
		if(num1>0) {
			System.out.println(num1+" is a positive number");
		}
		else if(num1==0) {
			System.out.println("Number is zero");
		}
		else {
			System.out.println(num1+" is a negative number");
		}
	}

}
