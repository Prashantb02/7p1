package collection_demo;
import java.util.*;

public class hash_map {

	public static void main(String[] args) {
		//create an HashMap
				HashMap<String,Integer> map = new HashMap<>();
				//add elements in the Set
				map.put("One",1);
				map.put("Two",2);
				map.put("Three",3);
				
				//get a value from the map
				int value = map.get("Two");
				System.out.println("Value:"+value);
				//remove a key value pair from the map
				map.remove("One");
				
				System.out.println("Map after removal: "+map);
				boolean contains = map.containsKey("Three");
				System.out.println("Contains : "+ contains);
	}

}
