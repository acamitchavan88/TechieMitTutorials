import java.util.Scanner;
/*
 * Author #TechieMit
 *  Java 8 program to count number of specific character in String
 */
public class ProgramCountChar {
	public static void main(String[] args) {

		System.out.println("Enter the string of which characters to be counted");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		System.out.println("Enter the character to be counted");
		char character=scan.next().charAt(0);
		long count=str.chars().filter(a->a==character).count();
		System.out.println("Count of character "+ character +" in string is "+count);
	}

}
