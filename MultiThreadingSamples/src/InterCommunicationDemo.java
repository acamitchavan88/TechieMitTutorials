/*
 * @Author #TechieMit
 * Program for interCommunication of threads
 */
class WorkerThread extends Thread { 
	int prodofNNos = 1;
	/* Old Java way of coding
	int prodofNNos = 1;
	public void run() {
		System.out.println("In run metho d of worker thread ");
		synchronized (this) {
			for (int i = 1; i <= 4; i++)
				prodofNNos = prodofNNos * i;
			System.out.println("N numbers product is calculated");
			// Notify the waiting thread 4 *3 *2 *1 =24
			this.notify();
		}
	} */
	//Using Java 8 below code
	Thread threadDemo=new Thread(()->{
		
		System.out.println("In run method of worker thread ");
		synchronized (this) {
			for (int i = 1; i <= 9; i++)
				prodofNNos = prodofNNos * i;
			System.out.println("N numbers product is calculated");
			// Notify the waiting thread 4 *3 *2 *1 =24
			this.notify();
		}
		
	});
	
}   
public class InterCommunicationDemo {
	public static void main(String p[]) throws InterruptedException {
	
		WorkerThread workThreadInstance = new WorkerThread();
		workThreadInstance.threadDemo.start();
		// Give call for product of n numbers
		synchronized (workThreadInstance) {// Wait will release main thread	// monitor /lock
			workThreadInstance.wait();
			System.out.println("Within main method in synchronized context");
			// Get the result of worker Thread
			int resultOfNNos = workThreadInstance.prodofNNos;
			System.out.println("Product of n numbers is " + resultOfNNos);
		}

	}

}