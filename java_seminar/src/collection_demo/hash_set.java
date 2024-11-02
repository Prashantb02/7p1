package collection_demo;

import java.util.HashSet;

public class hash_set {

	public static void main(String[] args) {
		//create an HashSet
		HashSet<String> set = new HashSet<>();
		//add elements in the Set
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		
		//print the set
		
		System.out.println("Set: "+set);
		boolean contains = set.contains("Banana");
		System.out.println("Set contains 'Banana': "+ contains);
		set.remove("Apple");
		System.out.println("Set After removal: "+set);
		
	}

}
