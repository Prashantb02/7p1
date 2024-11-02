package java_seminar;
class Animal{
	private String name;
	
	public Animal(String name) {
		this.name=name;
	}
	public void sound() {
		System.out.println("The animal makes sound");
	}
	public String getname() {
		return name;
	}
}
//child class inherting from animal
class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	@Override
	public void sound() {
		System.out.println("The Dog barks");
	}
	public void fetch() {
		System.out.println("The dog fetches");
	}
}
public class Single_Inherit {

	public static void main(String[] args) {
	Dog dog = new Dog("Buddy");//cons of parent class automatically gets called
	System.out.println(dog.getname());
	dog.sound();
	dog.fetch();
	}

}
//interfsce only has delarations of the abstract methods
