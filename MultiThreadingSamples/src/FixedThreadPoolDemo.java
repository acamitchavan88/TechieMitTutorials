import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * @Author #TechieMit 
 * Program to show demo on fixedThreadPoolDemo using Java8
 */
class Task implements Runnable {

	@Override
	public void run() {
		System.out.println(
				"Initally before sleeping Currently executing thread in thread pool is::"
						+ Thread.currentThread().getName());
		// To sleep for some time threads
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("Task completed thread in thread pool is::"
				+ Thread.currentThread().getName());
	}
}
public class FixedThreadPoolDemo {

	public static void main(String[] args) {
		// Create fixed no of threads in pool
		ExecutorService executorDemo = Executors.newFixedThreadPool(6);
		
		Task taskObject = new Task();
		for (int i = 1; i <= 6; i++) {
			executorDemo.execute(taskObject);
		}

		executorDemo.shutdown();
	}

}
