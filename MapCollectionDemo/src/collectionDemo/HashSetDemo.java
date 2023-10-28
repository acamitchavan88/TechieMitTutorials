package collectionDemo;
import java.util.HashSet;
import java.util.Set;
/*
 * @Author #TechieMit
 */
public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> setOfNumbers=new HashSet<>();
		setOfNumbers.add(1);
		setOfNumbers.add(1);
		setOfNumbers.add(2);
		setOfNumbers.add(3);
		setOfNumbers.add(4);
		setOfNumbers.add(5);
		System.out.println("---------Output Start of HashSet-----");
		setOfNumbers.forEach((hashSetValues)->System.out.println(hashSetValues));
		System.out.println("---------Output End of HashSet-----");
		if(setOfNumbers.contains(1))
		{
			System.out.println("The element 1 is present is the hashSet");
		}

	}

}
