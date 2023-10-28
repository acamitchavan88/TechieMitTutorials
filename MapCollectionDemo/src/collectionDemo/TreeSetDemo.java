package collectionDemo;

import java.util.TreeSet;
/*
 * @Author #TechieMit
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> listOfAlphabets=new TreeSet<>();
		//TreeSet elements are
		listOfAlphabets.add("D");
		listOfAlphabets.add("A");
		listOfAlphabets.add("X");
		listOfAlphabets.add("L");		
		listOfAlphabets.add("C");
		
		System.out.println("------Output of TreeSet starts::");
		System.out.println("Descending  Set is::"+listOfAlphabets.descendingSet()+"\n");
		System.out.println("Tail Set::"+listOfAlphabets.tailSet("X", true));
		System.out.println("Sub Set of Tree Set is::"+listOfAlphabets.subSet("A", true, "L", true));
		System.out.println("\n Entire Tree Set is::");
		listOfAlphabets.forEach((a)->System.out.println(a));
		System.out.println("------Output of TreeSet ends::");
	}

}
