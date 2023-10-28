
public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		try
			{
				int num=0/0;
			}
			
			catch(Exception ex)
			{
				System.out.println("Exception is caught");
			}
		
			
			
			finally
			{
				System.out.println("This is last finally block");
			}
		}
//		catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}
		finally
		{
			System.out.println("This is outer finally");
		}
			
	}

}
