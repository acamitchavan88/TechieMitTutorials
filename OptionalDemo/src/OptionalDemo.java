import java.util.Optional;
/*
 * @Author #TechieMit
 */
public class OptionalDemo {

	public static void main(String[] args) {
		//By default empty method invocation
		Optional<Integer> optInt=Optional.empty();
		System.out.println("The optional integer value is::"+optInt);
		//How to make use of OfNullable handle null values that might be there
			Integer number = null;
			Optional<Integer> optionalNum=Optional.ofNullable(number);
			System.out.println("The optional interger value is::"+optionalNum);
			
			Optional<String> getColor=Optional.ofNullable(null);
			//Use of isPresent method 
			if(getColor.isPresent())
			{
				System.out.println("Is Present The value of color is::"+getColor);
				
			}
			else 
			{
				
				System.out.println("In else block  The value of color is::"+getColor);
			}
			
			//Use of Map method 
			 Optional<String> stringOptional = Optional.of("Kathy");
			    Optional<Integer> intOptional = stringOptional.map(String::length);
			    System.out.println(intOptional.get()); 
			
	}

}
