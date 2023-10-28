package collectionDemo;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
/*
 * @Author #TechieMit
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<>();
		//LinkedList of Chocolates start
		linkedList.add("Ferrero Rocher");
		linkedList.add("Mars");
		linkedList.add("Cadbury Silk");
		linkedList.add("TobleRone");
		//Inserts  element to beginning of LinkedList
		linkedList.addFirst("Kit Kat");
		//Inserts  element to end of LinkedList
		linkedList.addLast("Snickers");
		System.out.println("----Output of LinkedListDemo starts----");
		//Removes the last element in LinkedList
		linkedList.pollLast();
		//Sort the list in natural order
		Collections.sort(linkedList);


		ListIterator<String> listIter=linkedList.listIterator();
		while(listIter.hasNext())
		{
			System.out.println(listIter.next());
		}

		System.out.println("----Output of LinkedListDemo ends----");
		//LinkedList of Chocolates end



	}

}
