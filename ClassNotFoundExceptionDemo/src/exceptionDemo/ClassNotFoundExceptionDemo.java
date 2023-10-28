package exceptionDemo;

public class ClassNotFoundExceptionDemo {

	public static void main(String[] args) throws ClassNotFoundException   {
		
		String loadClass="exceptionDemo.StudentDemo";
		//try block might throw an exception
//		try
//		{
		Class.forName(loadClass);
		ClassLoader.getSystemClassLoader().loadClass(loadClass);
	//	}
		//catch the exception
		/*catch(Exception ex)
		{
			ex.printStackTrace();
		}*/
	}

}
