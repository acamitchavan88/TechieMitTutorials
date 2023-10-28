import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
/*
 * @Author #TechieMit
 */
public class StreamsProcessing {
	public static void main(String[] args) {
	//Use of rangeClosed function
		System.out.println("\n This is sequential processing example");
		IntStream sequenceProcessing=IntStream.rangeClosed(1, 5);
		sequenceProcessing.forEach(System.out::print);
		System.out.println("\n This is parallel processing example");
		IntStream parallelProcessing=IntStream.rangeClosed(1,5);
		parallelProcessing.parallel().forEach(System.out::print);
		System.out.println("\n Parallel processing of threads");
		List<Integer>parallelnumList=Arrays.asList(1,2,3,4,5);
		parallelnumList.parallelStream().forEach(thread->System.out.println(thread+" "+Thread.currentThread().getName()));
		System.out.println("\n Sequential processing of threads");
		List<Integer>seqnumList=Arrays.asList(1,2,3,4,5);
		seqnumList.forEach(pThread->System.out.println(pThread+" "+Thread.currentThread().getName()));
	}

	
	
}
