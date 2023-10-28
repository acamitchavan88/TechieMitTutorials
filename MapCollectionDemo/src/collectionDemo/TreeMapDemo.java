package collectionDemo;

import java.util.Map;
import java.util.TreeMap;
/*
 * @Author #TechieMit
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String,String> treeMapDemo=new TreeMap<>();
		treeMapDemo.put("1", "One");
		treeMapDemo.put("4", "Four");
		treeMapDemo.put("6","Six");
		treeMapDemo.put("3","Three");
		
		//This is 2nd Tree Map Demo
		Map<String,String> cloneTreeMap=new TreeMap<>();
		//putall simply inserts the other map elements in the 
		cloneTreeMap.putAll(treeMapDemo);
		cloneTreeMap.put("100","One Hundred");
		System.out.println("----Output of TreeMap starts--------");
		System.out.println(cloneTreeMap.getOrDefault(cloneTreeMap.get("1"), "Default Value"));
		System.out.println("Is the key 6 present:::"+cloneTreeMap.containsKey("6"));
		//Printing elements of the cloned Tree Map
		cloneTreeMap.forEach((key,values)->System.out.println("TreeMap keys::"+key+
				"\t"+"TreeMap values::"+values));
		System.out.println("----Output of TreeMap ends--------");
	}

}
