import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * @Author #TechieMit
 *  Program to show demo of CachedThreadPool in Java
 */
public class CachedThreadPoolDemo {

	public static void main(String[] args) throws InterruptedException {
		  //Instance created of ExecutorService
		ExecutorService execService=Executors.newCachedThreadPool();
		
		for(int i=1;i<=9;i++)
		{
			final int taskId=i;
			
			execService.submit(()->{
				System.out.println("TaskId currently executing is::"+taskId+" Name of executing thread is ::"+Thread.currentThread().getName());
			
				//Sleep threads for some time
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					System.out.println(" Thread has been interrupted ::"+taskId);
				}
				System.out.println("Task  of "+taskId+" has been completed");
			});
		}
		//Tasks has been shutdown
		execService.shutdown();
		
		if(!execService.awaitTermination(80, TimeUnit.SECONDS))
		{
			execService.shutdownNow();
		}
		System.out.println("All tasks have finished execution successfully");
		
	}
}
