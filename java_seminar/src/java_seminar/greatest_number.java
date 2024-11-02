package java_seminar;
import java.util.Scanner;
public class greatest_number {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the three numbers:");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is the greatest number");
		}
		else if(b>c && b>a) {
			System.out.println(b+" is the greatest");
		}
		else {
			System.out.println(c+" is the greatest");
		}
	}

}
//make this into nested if statements#HW
