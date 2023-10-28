package collectionDemo;

import java.util.LinkedHashSet;
import java.util.Spliterator;
/*
 * @Author #TechieMit
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//Creation 
		LinkedHashSet<Double> linkhsSetValues=new LinkedHashSet<>();
		linkhsSetValues.add(1.11d);
		linkhsSetValues.add(3.66d);
		linkhsSetValues.add(5.99d);
		linkhsSetValues.add(5.99d);
		linkhsSetValues.add(33.66d);
		
		//Use of clone method that returns shallow copy
		Object linkhDupValues=linkhsSetValues.clone();
		linkhDupValues.toString();
		System.out.println("--------Cloned HashSet Values starts-------"+linkhDupValues+
				"\n"+"-------------Cloned HashSet Values ends--------");
		System.out.println("--------Output of LinkedHashSet values starts----------");
		Spliterator<Double> splitValues=linkhsSetValues.spliterator();
		splitValues.forEachRemaining(System.out::println);
	System.out.println("--------Output of LinkedHashSet values end----------");
	}

}
