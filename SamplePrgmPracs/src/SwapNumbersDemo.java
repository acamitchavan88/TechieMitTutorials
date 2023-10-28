
public class SwapNumbersDemo {

	public static void main(String[] args) {
		int a=33,b=71;
		System.out.println( "Original values of int a and b is "+a +" "+ b );
		a=a+b; //104
		b=a-b;  //104-71 = 33
		a=a-b; // 104-33= 71   a=71 b=33 
		System.out.println( "Swapped values of int a and b is "+a +" "+ b );

	}

}
