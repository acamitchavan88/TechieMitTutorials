import java.util.Scanner;
/*
 * Author #TechieMit
 * Program to count the occurrence of digits in  number
 */
public class ProgramCountNum {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		String strValue=Integer.toString(number);
		int digitCount=0;
		System.out.println("Enter the digit to be searched");
		char ch=scan.next().charAt(0);
		for(int i=0;i<strValue.length();i++)
		{
			if(strValue.charAt(i)==ch)
			{
				digitCount=digitCount+1;
			}
		}
		System.out.println("The count of digit "+ch+ " in number "+number+ " is "+digitCount);
	}

}
