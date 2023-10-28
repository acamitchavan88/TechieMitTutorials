package collectionDemo;
import java.util.HashMap;
import java.util.Map;
/*
 * @Author #TechieMit
 *   
 */
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> hashMap=new HashMap<>();
		hashMap.put("Orange", 1);
		hashMap.put("Lemon", 2);
		hashMap.put("SweetLime", 3);
		hashMap.put("JackFruit", 4);
		System.out.println("------------- Output of HashMap starts----------");
		//Use for loop to iterate through elements of map
		//Using Java 8 forEach method optimized way to iterate 
			hashMap.forEach((keys,values)->System.out.println("Keys are::\t"+keys
					+"Values are::\t"+values));
			System.out.println("------------- Output of HashMap ends----------");
			//Clears all the contents of HashMap
		//	hashMap.clear();
			
			System.out.println("-----HashMap key set output starts----------");
			System.out.println(hashMap.keySet());
			System.out.println("-----HashMap key set output ends-------------");
			System.out.println("-----HashMap entry set output starts----------");
			System.out.println(hashMap.entrySet());
			System.out.println("-----HashMap entry set output ends------------");
			hashMap.forEach((key,value)->System.out.println("Keys are::\t"+key+
					"::Values are::\t"+value));
		System.out.println("------------- Output of HashMap end--------");
		

	
	}

}
