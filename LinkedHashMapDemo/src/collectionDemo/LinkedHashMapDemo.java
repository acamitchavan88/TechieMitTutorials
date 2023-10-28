package collectionDemo;

import java.util.LinkedHashMap;
import java.util.Map;
/*
 * @Author #TechieMit
 */
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String,String> mapofLuxCars=new LinkedHashMap<>();
		mapofLuxCars.put("Jaguar", "F-TYPE");
		mapofLuxCars.put("Land Rover","Evoque");
		mapofLuxCars.put("Mercedes Benz","Mercedes Benz C Class");
		mapofLuxCars.put("Lamborghini","Lamborghini Urus");
		mapofLuxCars.put("Bentley",null);
		//Updates existing value if not present in the linkedhashmap
		mapofLuxCars.putIfAbsent("Bentley", "Bentley Flying Spur");
		
		System.out.println("----1st Output of LinkedHashMap starts----");
		//For Each to iterate through the map
		mapofLuxCars.forEach(
				(keys,values)->System.out.println("Keys are::\t"+keys+
		"\tValues are::"+values));
		
		System.out.println("----1st Output of LinkedHashMap ends----");
		System.out.println("---- 2nd Output of LinkedHashMap starts------");
		//Returns the size of LinkedHashMap
		System.out.println("Size of LinkedHashMap is::"+mapofLuxCars.size());		
	    System.out.println("---- 2nd Output of LinkedHashMap ends------");
	}

}
