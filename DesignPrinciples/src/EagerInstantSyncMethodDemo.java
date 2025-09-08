
public class EagerInstantSyncMethodDemo {

	public static void main(String[] args) {
		SingletonSyncMethod singletonInstanceOne=SingletonSyncMethod.getInstance();
		SingletonSyncMethod singletonInstanceTwo=SingletonSyncMethod.getInstance();
		
		System.out.println("HashCode of singletonInstanceOne ::"+singletonInstanceOne.hashCode());
		System.out.println("HashCode of singletonInstanceTwo ::"+singletonInstanceTwo.hashCode());
		if(singletonInstanceOne.equals(singletonInstanceTwo))
		{
			System.out.println("Singleton Design pattern correctly implemented two objects are equal hence no new object is created");
		}

	}
	
	static  class SingletonSyncMethod
	{
		private static   volatile SingletonSyncMethod singletonInstance=new SingletonSyncMethod();
	
		private SingletonSyncMethod()
		{
			
		}
		public static synchronized SingletonSyncMethod getInstance()
		{
				if(singletonInstance==null)
					
				{
					singletonInstance=new SingletonSyncMethod();
				}
				return singletonInstance;
			
		}
	}

}
