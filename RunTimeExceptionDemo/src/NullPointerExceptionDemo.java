
public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		try
		{
		String s=null;
		
		System.out.println(s.charAt(0));
		}
		catch(Exception ex)
		{
			System.out.println("Null Pointer exception caught");
		}
	}

}
