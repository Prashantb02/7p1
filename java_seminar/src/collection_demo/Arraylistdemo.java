package collection_demo;
import java.util.*;

public class Arraylistdemo {

	public static void main(String[] args) {
		//create an ArrayList
	ArrayList<String> list = new ArrayList<>();
	//add elements in the ArrayList
	list.add("Apple");
	list.add("Banana");
	list.add("Cherry");
	
	//print the ArrayList
	System.out.println("ArrayList: "+list);
	//get an element from the ArrayList
	String element = list.get(1);
	System.out.println("Element at index 1: "+ element);
	//replace an element in the ArrayList
	list.set(1, "Grapes");
	System.out.println("ArrayList after replacement: "+list);
	//remove an element from the ArrayList
	list.remove(0);
	System.out.println("ArrayList After removal: "+list);
	//check if ArrayList contains in an element
	boolean contains = list.contains("Cherry");
	System.out.println("ArrayList contains 'Cherry': "+ contains);
	//get size of the ArrayList
	int size = list.size();
	System.out.println("Size of the ArrayList: "+size);
	//check if the ArrayList is empty
	boolean isEmpty = list.isEmpty();
	System.out.println("ArrayList is empty: "+isEmpty);
	
	}

}
