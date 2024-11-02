package java_seminar;

//Encapsulated class
class Employee {
 // Private fields
 private String name;
 private int age;
 private double salary;

 // Constructor
 public Employee(String name, int age, double salary) {
     this.name = name;
     this.age = age;
     this.salary = salary;
 }

 // Getter methods
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public double getSalary() {
     return salary;
 }

 // Setter methods
 public void setName(String name) {
     this.name = name;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }
}

public class encapsule_demo {
 public static void main(String[] args) {
     Employee employee = new Employee("John Doe", 30, 50000);
     System.out.println("Name: " + employee.getName());
     System.out.println("Age: " + employee.getAge());
     System.out.println("Salary: " + employee.getSalary());

     // Modify employee details
     employee.setName("Jane Doe");
     employee.setAge(31);
     employee.setSalary(55000);

     System.out.println("Updated Name: " + employee.getName());
     System.out.println("Updated Age: " + employee.getAge());
     System.out.println("Updated Salary: " + employee.getSalary());
 }
}