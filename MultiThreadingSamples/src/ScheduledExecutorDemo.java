import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
 * @Author #TechieMit
 * Program to show demo of scheduler executor in Java
 */
public class ScheduledExecutorDemo {

	public static void main(String[] args) {
		//Created object of scheduledExecutorService
		ScheduledExecutorService scheduleExec=Executors.newScheduledThreadPool(2);
		
		Runnable task=(()->{ 
			System.out.println("Currently executing thread is at::>"+System.nanoTime());
			
		});
		//Invoking method with fixedDelay
		scheduleExec.scheduleWithFixedDelay(task, 2, 4, TimeUnit.SECONDS);
		
		Runtime.getRuntime().addShutdownHook(new Thread(()->{
			System.out.println("Scheduled executor service shutting down");
			scheduleExec.shutdown();
			try
			{
				if(!scheduleExec.awaitTermination(5, TimeUnit.SECONDS))
				{
					scheduleExec.shutdownNow();
				}
				
			}
			catch(InterruptedException ex)
			{
				scheduleExec.shutdownNow();
			}
			
		}));
		
		//Cause thread to execute with some delay
		try
		{
			
			Thread.sleep(30000);
		}
		catch(InterruptedException ex)
		{
			scheduleExec.shutdownNow();
		}
		scheduleExec.shutdown();
		
		
	}

}
