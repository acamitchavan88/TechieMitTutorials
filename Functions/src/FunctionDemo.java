import java.util.Scanner;
import java.util.function.Function;
/*
 * @Author #TechieMit
 */
public class FunctionDemo {

	public static void main(String[] args) {
	
		try(Scanner scan=new Scanner(System.in))
		{
			String str=scan.nextLine();
		Function<String,Integer> applyFunc=a->a.length();
		//This calls the apply function
		Integer getLength=applyFunc.apply(str);
		//Note here it prints length of string including the character length
		System.out.println("The length of String is::"+getLength);
		
		}
	}

}
