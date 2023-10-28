
public class NestedTryClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try
			{
				int num=1/0;
			}
			catch(Exception ex) {
				System.out.println("Exception caught by outer finally");
			}
			finally
			{
				try
				{
					int num=0/0;
				}
				catch(Exception ex)
				{
					System.out.println("This is inner Exception");
					
				}
				finally
				{
					System.out.println("This is inner finally block");
				}
			}
	}

}
