import java.util.function.Supplier;
/*
 * @author #TechieMit
 */
public class SupplierFunctionDemo {

	public static void main(String[] args) {
		//This internally gives call to get function of Supplier Interface
		Supplier<Double> getRandomDoubleValue=()->Math.random();
		
		System.out.println("The supplier value is::"+getRandomDoubleValue.get());

	}

}
