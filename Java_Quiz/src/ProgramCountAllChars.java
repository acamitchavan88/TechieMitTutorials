/*
 * Author #TechieMit
 *  Java 8 program to count number of all characters in String
 */
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProgramCountAllChars {

	public static void main(String[] args) {
		System.out.println("Enter the string of which characters to be counted");
		Scanner scan=new Scanner(System.in);
		String inputString=scan.next();
		
		Map<String,Long> allCharCountMap=Arrays.stream(inputString.split(""))
				.collect(Collectors.groupingBy
						(a->a,LinkedHashMap::new,Collectors.counting()));

		System.out.println("Total no  of charcters with count "+allCharCountMap);
	}

}
