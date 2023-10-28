import java.util.Arrays;
import java.util.List;
import java.util.Optional;
/*
 * @Author #TechieMit
 * Use of reduce as terminal 
 */
public class ReduceOperations {

	public static void main(String[] args) {
	
			List<Integer> firstFiveNosList=Arrays.asList(1,2,3,4,5);
			
			int sumOfAllFiveNos=firstFiveNosList.stream().reduce(0, (a,b)->a+b);
			//2nd approach 
			int sum=firstFiveNosList.stream().reduce(0, Integer::sum);
			System.out.println("The sum of all five nos is::"+sumOfAllFiveNos);
			
			System.out.println("The sum is five nos using method refernce::"+sum);
			int product=firstFiveNosList.stream().reduce(1, (x,y)->x*y);
			System.out.println("The product of five nos is::"+product);
			
			
			Optional<Integer> getMinNumber=firstFiveNosList.stream().reduce(Integer::max);
			Optional<Integer> getMaxNumber=firstFiveNosList.stream().reduce(Integer::min);
			System.out.println("The maximum number is::"+getMinNumber.get()+
					" The minimum number is::"+getMaxNumber.get());
			
			

	}

}
