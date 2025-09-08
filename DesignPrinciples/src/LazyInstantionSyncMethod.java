/*
 * Author #TechieMit
 *  LazyInstantiation Demo for Singleton Design Pattern in Java
 */
public class LazyInstantionSyncMethod {

	public static void main(String[] args) {
		
		LazyInstanceDemo lazyInstance1=LazyInstanceDemo.getInstance();
		
		LazyInstanceDemo lazyInstance2=LazyInstanceDemo.getInstance();
		
		System.out.println("HashCode of object 1 of lazyInstance 1"+lazyInstance1.hashCode());
		System.out.println("HashCode of object 2 of lazyInstance 2"+lazyInstance2.hashCode());
		
	// 2 objects equal 
		if(lazyInstance1.equals(lazyInstance2))
		{
			System.out.println("Singleton Pattern followed by lazy instantation approach");
		}
		

	}

	
static class LazyInstanceDemo
{
	
	//private instance
	private static volatile LazyInstanceDemo instance;
	
	//private constructor
	private LazyInstanceDemo()
	{
		
	}
		//SYnchronized method
	public static synchronized LazyInstanceDemo getInstance()
	{
		if(instance==null)
		{
			instance=new LazyInstanceDemo();
		}
		return instance;
	}
	// Synchronized block
	/*public static  LazyInstanceDemo getInstance()
	{
		//Synchronized block
		if(instance==null)
		{
		synchronized(LazyInstanceDemo.class)
		{
		//3 Null check
		if(instance==null)
		{
			//Create the object
			instance=new LazyInstanceDemo();
		}
		}
	}
	
		return instance;
		
	}
	*/

}


	
}
