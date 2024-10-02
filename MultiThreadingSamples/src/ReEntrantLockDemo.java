import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * #TechieMit program to show reentrant lock demo in Java
 */

class ShowResource { 
	private final Lock lockObject = new ReentrantLock();

	public void showResourceDemo(String name) {
		// Held the lock on object
		lockObject.lock();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Curently lock held by program ::" + name
						+ "\t current execution in loop is:: " + i);

				Thread.sleep(2000);

			}
		} catch (InterruptedException ex) {
			System.out.println("Currently thread is been interrupted");
		} finally {
			// Release the lock
			lockObject.unlock();
			System.out.println("Finally the lock has been released by "+name);
		}

	}
}

class ImplementsShowResource implements Runnable {
	private ShowResource showResource;
	private String threadName;
	public ImplementsShowResource(ShowResource showResource,
			String threadName) {
		this.showResource = showResource;
		this.threadName = threadName;
	}

	@Override
	public void run() {
		showResource.showResourceDemo(threadName);
	}

}
public class ReEntrantLockDemo {

	public static void main(String[] str) throws InterruptedException {

		ShowResource showResouce = new ShowResource();

		Runnable worker1 = new ImplementsShowResource(showResouce, "Thread 1");
		Runnable worker2 = new ImplementsShowResource(showResouce, "Thread 2");
		Runnable worker3 = new ImplementsShowResource(showResouce, "Thread 3");
		Runnable worker4 = new ImplementsShowResource(showResouce, "Thread 4");

		Thread t1 = new Thread(worker1, "Thread1");
		Thread t2 = new Thread(worker2, "Thread2");
		Thread t3 = new Thread(worker3, "Thread3");
		Thread t4 = new Thread(worker4, "Thread4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		// Join method to join the threads synchronously
		t1.join();
		t2.join();
		t3.join();
		t4.join();

		System.out.println("All the threads have finished execution");

	}

}