/* Author #TechieMit:Program to demonstrate usage of Builder Design Pattern in Java with example
 * 
 */
import java.util.ArrayList;
import java.util.List;


public class BookPrototyeClientImp {

	public static void main(String[] args) {
		List<String> bookPublishersList=new ArrayList<>();
		bookPublishersList.add("James Rudolph");
		//New original object not created from scratch
		BookPrototypeImpl bookPrototype=new BookPrototypeImpl("Jungle Book",bookPublishersList);
		
		BookPrototypeImpl clonedBookPrototypeImpl=bookPrototype.clone();
		
		clonedBookPrototypeImpl.getBookPublishers().add("Tommy Moore");
		clonedBookPrototypeImpl.getBookPublishers().add("Daniel Rose");
		
		System.out.println("Original object contents::"+bookPrototype.toString());
		System.out.println("Prototype object contents::"+clonedBookPrototypeImpl.toString());
		
	}

}
