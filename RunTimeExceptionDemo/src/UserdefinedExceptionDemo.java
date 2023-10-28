import java.util.Scanner;

public class UserdefinedExceptionDemo {

	public static void main(String[] args)  throws CustomException {
		String exceptionMessge="Number in invalid range Not Allowed";
		System.out.println("Enter your input number");
		Scanner scanner=new Scanner(System.in);
		int numberInput=scanner.nextInt();
	
		if(numberInput>=1 && numberInput<=50)
		{
			System.out.println("Valid input range number "+numberInput);
		}
		else
		{
			throw new CustomException(exceptionMessge);
		}
			
	}
	
}
