import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * #TechieMit 
 * Program to simulate working on cyclic barrier through practical example
 */
public class CyclicBarrierExample {

	public static void main(String[] args) throws InterruptedException {
		int parties = 5;
		// Creating parameterized instance with parties and runnable
		CyclicBarrier cyclicBarrierInstance = new CyclicBarrier(parties, () -> {

			System.out.println(
					"All the passengers have arrived at bus stop soon it start departure ");
		});
		// Take an instance of executorService
		ExecutorService execService = Executors.newFixedThreadPool(parties);

		for (int i = 1; i <= parties; i++) {
			int passengerId = i;

			execService.execute(() -> {
				System.out.println("Currently the passenger " + passengerId
						+ "\t is waiting for bus to depart");
				try {
					Thread.sleep(3000);
					System.out.println("Passenger " + passengerId
							+ " is ready for the bus");
					// Invoke awake after all the parties have arrived
					cyclicBarrierInstance.await();
				}

				catch (Exception ex) {
					ex.printStackTrace();
				}
			});

		}

		if (!execService.awaitTermination(10000, TimeUnit.MILLISECONDS)) {
			System.out.println("Now the cyclic barrier have finished execution ");
			execService.shutdown();
		}

	}
}
