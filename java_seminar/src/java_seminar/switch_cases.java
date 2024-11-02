package java_seminar;
import java.util.Scanner;
public class switch_cases {

	public static void main(String[] args) {
	 Scanner obj=new Scanner(System.in);
	 System.out.println("Enter the number1:");
	 int a=obj.nextInt();
	 System.out.println("Enter the number2:");
	 int b=obj.nextInt();
	 System.out.println("*******MENU*******");
	 System.out.println("1.Addition");
	 System.out.println("2.Subtraction");
	 System.out.println("3.Multiplication");
	 System.out.println("4.Division");
	 System.out.println("Enter your choice:");
	 int choice=obj.nextInt();
	 switch(choice) {
	 case 1:
		 int result=a+b;
		 System.out.println("addition of number is:"+result);
		 break;
	 case 2:
		 int result2=a-b;
		 System.out.println("subtraction of number is:"+result2);
		 break;
	 case 3:
		 int result3=a*b;
		 System.out.println("multiplication of number is:"+result3);
		 break;
	 case 4:
		 int result4=a/b;
		 System.out.println("division of number is:"+result4);
		 break;
	default:
		System.out.println("Enter a valiid choice:");
	 }
	 
	}

}
