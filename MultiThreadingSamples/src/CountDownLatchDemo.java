
/*
  Author #TechieMit
  Program to display demo of CountDownLatch in Java
*/
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class Worker implements Runnable {
	CountDownLatch countDownLatch;

	public Worker(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		try {
			showCountLatchDemo();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void showCountLatchDemo() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			countDownLatch.countDown();
			System.out.println("The current countDownLatch count ::"
					+ countDownLatch.getCount());
			TimeUnit.SECONDS.sleep(2);
		}
	}
}

public class CountDownLatchDemo {
	public static void main(String[] s) throws InterruptedException {
		int numberOfThreads = 3;
		CountDownLatch latch = new CountDownLatch(numberOfThreads * 10);
		for (int i = 0; i < numberOfThreads; i++) {
			Worker worker = new Worker(latch);
			Thread threadDemo = new Thread(worker);
			threadDemo.start();
		}
		latch.await();
		System.out.println("CountDownLatch demo finished all threads executed in main thread");
	}

}