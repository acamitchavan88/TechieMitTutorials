/*
 * #TechieMit Demo to display eager instantionDemo
 */
public class EagerInstantationDemo {

	public static void main(String[] args) {
		SingletonDemo object1=SingletonDemo.getInstance();
		SingletonDemo object2=SingletonDemo.getInstance();
		
		System.out.println("Singleton object1 hashcode is "+object1.hashCode());
		System.out.println("Singleton object2 hashcode is "+object2.hashCode());
		//2 objects are equal
		if(object1.equals(object2))
		{
			System.out.println("Singleton Design Pattern followed by eager instantation  both objects are equal");
		}
	}

	
	static class SingletonDemo
	{
		//private instance
		private static volatile SingletonDemo instance=new SingletonDemo();
		
		//private constructor
		private SingletonDemo()
		{
			
		}
		//GetInstance method synchronized method
		public static synchronized SingletonDemo getInstance()
		{
			return instance;
		}
		
	/*	public static SingletonDemo getInstance()
		{
			//Synchronized block
			synchronized(SingletonDemo.class)
			{
			//	instance=new SingletonDemo();
				if(instance==null)
				{
					
				}
			}
			
			return instance;
		}
		*/
		
	}

}
