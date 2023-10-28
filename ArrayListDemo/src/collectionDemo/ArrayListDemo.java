package collectionDemo;
import java.util.ArrayList;
import java.util.List;
/*
 * @Author #TechieMit
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> mobilePhones=new ArrayList<>();
		mobilePhones.add("Apple Iphone 11");
		mobilePhones.add("Samsung M30 S");
		mobilePhones.add("One Plus 10 Pro");
		mobilePhones.add("Asus ROG Phone 6");
		
		System.out.println("------------- Entire Output of ArrayList starts-----------");
		mobilePhones.forEach(System.out::println);
		System.out.println("------------- Entire Output of ArrayList ends-------------");
		//Remove after entire list printed 
				mobilePhones.remove("Asus ROG Phone 6");
		System.out.println("--------------The modified list output starts-------");
		mobilePhones.forEach(System.out::println);
		System.out.println("---------The modified list output ends----------");

	}

}
