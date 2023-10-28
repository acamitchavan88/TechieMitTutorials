import java.util.function.Predicate;
/*
 * @Author #TechieMit
 */
public class PredicateFunctionDemo {

	public static void main(String[] args) {
		//This internally gives call to test function of Predicate
		Predicate<Integer> getIntValue=x->x<20;
		
		System.out.println(getIntValue.test(14));

	}

}
