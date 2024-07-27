import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * @Author #TechieMit 
 * Program to demonstrate newsingleThreadExecutor in Java
 */
public class NewSingleThreadExecutorDemo {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newSingleThreadExecutor();
		//Task 1 submitted
		executor.submit(()->{
			
			 System.out.println("New Single task 1 is starting ");
			 
			 try
			 {
				 TimeUnit.SECONDS.sleep(2);
			 }
			 catch(InterruptedException ex)
			 {
				 System.out.println("Interrupted Exception caught for task1 ");
			 }
		});
		//Task 2 submitted
		executor.submit(()->{
			
			 System.out.println("New Single task 2 is starting ");
			 
			 try
			 {
				 TimeUnit.SECONDS.sleep(1);
			 }
			 catch(InterruptedException ex)
			 {
				 System.out.println("Interrupted Exception caught for task2 ");
			 }
		});
		//Task 3 submitted
		executor.submit(()->{
			
			 System.out.println("New Single task 3 is starting ");
			 
			 try
			 {
				 TimeUnit.SECONDS.sleep(1);
			 }
			 catch(InterruptedException ex)
			 {
				 System.out.println("Interrupted Exception caught for task3 ");
			 }
		});
		//Task 4 submitted
				executor.submit(()->{
					
					 System.out.println("New Single task 4 is starting ");
					 
					 try
					 {
						 TimeUnit.SECONDS.sleep(3);
					 }
					 catch(InterruptedException ex)
					 {
						 System.out.println("Interrupted Exception caught for task4 ");
					 }
				});
		//Shutting down the executor
				executor.shutdown();
				try
				{ 
					if(!executor.awaitTermination(9, TimeUnit.SECONDS))
					{
						executor.shutdownNow();
					}
					
				}
				catch(InterruptedException ex)
				{
					System.out.println("In shutdownNow catch block exception caught");
				}

		     
		System.out.println("All tasks are submitted successfully");
	}

}
