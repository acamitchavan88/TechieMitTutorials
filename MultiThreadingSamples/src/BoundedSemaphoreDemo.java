import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/*
 * #TechieMit program to show demo on boundedSemaphore and TimedSemaphore 
 */
public class BoundedSemaphoreDemo {

	public static void main(String str[]) {
		Semaphore boundedSemaphore = new Semaphore(5, true);
		Semaphore timedSemaphore = new Semaphore(5, true);

		System.out.println("Bounded Semaphore is fair "+boundedSemaphore.isFair());
		System.out.println("Timed Semaphore is fair "+timedSemaphore.isFair());
		
		System.out.println("Starting threads for bounded Semaphore");
		for (int i = 1; i <= 5; i++) {
			int currentThreadInstance = i;

			new Thread(() -> {
				simulateSemaphore(boundedSemaphore, "Bounded Semaphore",
						currentThreadInstance);
			}).start();
		}
		System.out.println("Starting threads for timed Semaphore");
		for (int i = 1; i <= 5; i++) {
			int currentThreadInstance = i;

			new Thread(() -> {
				simulateSemaphoreWithTimeOut(timedSemaphore, "Timed Semaphore",
						currentThreadInstance, 1000);
			}).start();
		}
	}

	private static void simulateSemaphoreWithTimeOut(Semaphore timedSemaphore,
			String type, int currentThreadInstance, long timeOutMillis) {

		try {
			if (timedSemaphore.tryAcquire(timeOutMillis,
					TimeUnit.MILLISECONDS)) {
				try {
					System.out.println("Timed Semaphore"
							+ "\t  Threads trying to acquire permit "
							+ timedSemaphore.availablePermits()
							+ "\t For current thread instance"
							+ currentThreadInstance);
					Thread.sleep(2000);
				}

				finally {
					timedSemaphore.release();
					System.out.println(
							"Timed Semaphore " + " \t Threads released Semaphore "
									+ " For current Thread instance \t"
									+ currentThreadInstance);
				}
			} else {
				System.out.println(
						"Timed Semaphore " + "\t Threads failed to acquire permit"
								+ timedSemaphore.availablePermits()
								+ "\t  For current thread instance "
								+ currentThreadInstance);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void simulateSemaphore(Semaphore boundedSemaphore,
			String type, int currentThreadInstance) {

		if (boundedSemaphore.tryAcquire()) {
			System.out.println(" Bounded Semaphore"
					+ "\t Thread  trying to acquire the permit \t"
					+ boundedSemaphore.availablePermits()
					+ "\t For current thread instance \t"
					+ currentThreadInstance);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				boundedSemaphore.release();
				System.out.println(" Bounded Semaphore"
						+ " \t Thread released the permit \t" + "\t For current"
						+ "thread instance \t" + currentThreadInstance);
			}

		} else {
			System.out.println(" Bounded Semaphore"
					+ " \t Thread failed to acquire the permit \t"
					+ boundedSemaphore.availablePermits()
					+ " For current Thread instance \t"
					+ currentThreadInstance);
		}

	}

}