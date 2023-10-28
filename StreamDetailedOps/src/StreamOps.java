import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * @Author #TechieMit
 * Stream API operations
 */
public class StreamOps {

	public static void main(String[] args) {
		IntStream intstreamRange=IntStream.rangeClosed(1, 50).filter(a->a%2!=0);
		System.out.println("-----IntStream Range Demo");
		
		System.out.println("The count of odd numbers between 1 to 50 is::"+intstreamRange.count());
	
	//Streams from values 
		
		Stream<String> streamOfStrings=Stream.of("This ","is a ","session on"," Stream api"," advanced topics");
		streamOfStrings.forEach(System.out::print);
		
		Stream<String>emptyStream=Stream.empty();
		System.out.println("-----Empty Stream demo");
		System.out.println("The empty Stream values are::"+emptyStream.count());
		
		
		//Float Array numbers
		double doubleArray[]= {1.3d,3.44d,5.7d,8.32d};
		double sumOfAllFloatNumbers=Arrays.stream(doubleArray).sum();
		System.out.println("-----");
		System.out.println("The double arrays sum is::"+sumOfAllFloatNumbers);
		
		//Iterate the numbers
		System.out.println("-----Iterate the numbers-----------");
		Stream.iterate(1, n->n*3).limit(5).forEach(System.out::println);
		System.out.println("-----Generate the numbers-----------");
		Stream.generate(Math::random).limit(4).forEach(System.out::println);
	}

}
