package java_seminar;

interface Flyable{
	void fly();
}
interface Walkable{
	void walk();
}
//class 
class Bird implements Flyable,Walkable{
@Override
	public void fly() {
	System.out.println("The Bird flies");
}
   public void walk() {
	   System.out.println("The Bird walks");
   }
}
public class multi_interface {

	public static void main(String[] args) {
    Bird bird = new Bird();
    bird.fly();
    bird.walk();
	}

}
