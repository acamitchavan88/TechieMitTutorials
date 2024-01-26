import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WaitNotifyExample {

    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();

    public static void main(String[] args) {

        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }

    private static class Producer implements Runnable {

        @Override
        public void run() {
            lock.lock();
            try {
                // Produce some data
                System.out.println("Producing data...");
                Thread.sleep(1000);

                // Notify the consumer that data is available
                condition.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    private static class Consumer implements Runnable {

        @Override
        public void run() {
            lock.lock();
            try {
                // Wait for data to be available
                System.out.println("Waiting for data...");
                condition.await();

                // Consume the data
                System.out.println("Consuming data...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }  
    }
}