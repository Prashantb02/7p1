package java_seminar;

import java.util.Scanner;

public class conditonaldemo2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num1=obj.nextInt();
		if(num1%2==0) {
			System.out.println(num1+" is a even number");
		}
		else {
			System.out.println(num1+" is a odd number");
		}

	}

}
