package java_seminar;
import java.util.Scanner;

public class Arithmetic_Demo {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number1:");
		int num1=obj.nextInt();
		System.out.println("Enter the Number2:");
		int num2=obj.nextInt();
		int Result1=num1+num2;
		int result2=num1*num2;
		int result3=num1-num2;
		int result4=num1/num2;
		System.out.println("The Addition of 2 numbers is:"+Result1+'\n'+"The Multiplication of 2 numbers is:"+result2);
		System.out.println("The Subtraction of 2 numbers is:"+result3);
		System.out.println("The Division of 2 numbers is:"+result4);

		
	}

}
