import java.util.concurrent.Semaphore;

/*
 * #TechieMit program to show demo on Counting Semaphore and
 * Binary Semaphore
 */
public class SemaphoreDemo {

	static int currentThreadInstance;
	public static void main(String[] args) {
	
		Semaphore binarySemaphore=new Semaphore(1);
		Semaphore countingSemaphore=new Semaphore(5);
		
		System.out.println("Starting binarySemaphore Threads");
		
		for(int i=1;i<=5;i++)
		{
			 currentThreadInstance=i;
			new Thread(()->{
				simulateSemaphore(binarySemaphore,"Binary Semaphore",currentThreadInstance);
			}).start();
		}
	System.out.println("Starting countingSemaphore Threads");
		
		for(int i=1;i<=5;i++)
		{
			 currentThreadInstance=i;
			new Thread(()->{
				simulateSemaphore(countingSemaphore,"Counting Semaphore",currentThreadInstance);
			}).start();
		}

	}

	private static void simulateSemaphore(Semaphore semaphore,
			String type, int currentThreadInstance) {
		
		//trying to acquire permit
		if(semaphore.tryAcquire())
		{
			System.out.println(type+" acquired permit \t "+" No of available permits \t"+semaphore.availablePermits());
			
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			finally
			{
				semaphore.release();
				System.out.println(type+" Release permit \t "+" No of available permits \t"+semaphore.availablePermits());
			}
			
		}
		//Failed permit scenarios handled in else block
		else
		{
			System.out.println(type+ "Failed to acquire permit \t "+"No of available permit \t"+semaphore.availablePermits());
		}
		
	}

}
