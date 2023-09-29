
public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		try
		{
		int []numArray=new int[2];
		System.out.println(numArray[3]);
		}
		catch(Exception ex)
		{
			System.out.println("Array Index out of bounds exception ");
		}
		
	}

}
