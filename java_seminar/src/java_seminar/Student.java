package java_seminar;
import java.util.Scanner;
class student1{
	private String name;
	private int roll;
	private int marks;
	
	public student1(String name,int roll,int marks) {
		this.name=name;
		this.roll=roll;
		this.marks=marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String cal_grd(int marks){
		this.marks=marks;
		if(marks>=90) {
			return "A";
		}
		else if(marks>=80 && marks<90) {
			return "B";
		}
		else if(marks>=70 && marks<80) {
			return "C";
		}
		else if(marks>=60 && marks<70) {
			return "D";
		}
		else if(marks>=50 && marks<60) {
			return "E";
		}
		else {
			return "F";
		}
	}
}

public class Student {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your Roll number:");
		int roll=sc.nextInt();
		System.out.println("Enter your marks:");
		int marks=sc.nextInt();
		student1 obj = new student1(name,roll,marks);
		 System.out.println("Name: " + obj.getName());
	     System.out.println("Roll: " + obj.getRoll());
	     System.out.println("Marks: " + obj.getMarks());
	     System.out.println("Your Grade is:"+ obj.cal_grd(marks));
		}while(true);
	     
	}

}
