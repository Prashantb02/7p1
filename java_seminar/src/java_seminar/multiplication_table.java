package java_seminar;
import java.util.Scanner;
public class multiplication_table {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number for  multiplication table:");
		int num=obj.nextInt();
		int i=1;
		while(i<11) {
			System.out.println(num+" x "+i+" = "+num*i);
			i++;
		}
	}

}
