import java.util.Scanner;

/*
 * @Author #TechieMit 
 * 
 *  Program that  display synchronization in multithreading in Java
 *  
 *  MovieTicketCounterDemo (Here logic for synchronized content)
 *  TicketHelperDemo (Class contains logic for taking user input for multiple Threads)
 *  SynchronizedBlock(Class contains logic for main method and thread instantiation)
 */
class MovieTicketCounterDemo {
	int totalAvailableTickets = 500;
	int noOfTicketsAvailed;

	Scanner scan = new Scanner(System.in);

	// Tickets would get decreased as the tickets are availed per person
	public void ticketCounter(int noOfTicketsAvailed) {
		synchronized (this) {
			try {
                 //Available tickets
				if (noOfTicketsAvailed > 0
						&& noOfTicketsAvailed <= totalAvailableTickets) {

					totalAvailableTickets -= noOfTicketsAvailed;
					System.out.println("Number of tickets availed by ::"
							+ Thread.currentThread().getName() + " is "
							+ noOfTicketsAvailed);
					System.out.println(
							"Remaining amount of tickets available are ::"
									+ totalAvailableTickets);
				}
				// Show HouseFull
				if (totalAvailableTickets == 0) {
					System.out.println("Show is HouseFull for today ");
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
class TicketHelperDemo implements Runnable {
	private MovieTicketCounterDemo movieTicketCounter;
      //Dependency injection constructor based
	public TicketHelperDemo(MovieTicketCounterDemo movieTicketCounter) {
		this.movieTicketCounter = movieTicketCounter;
	}

	@Override
	public void run() {
		try {

			System.out.println("Thread currently executing is::"
					+ Thread.currentThread().getName());
			Scanner scan = new Scanner(System.in);

			System.out.println("How many tickets do you want::"
					+ Thread.currentThread().getName());

			int noOfTicketsReqd = scan.nextInt();
			Thread.sleep(2000);//Delay for sleeping of threads
			movieTicketCounter.ticketCounter(noOfTicketsReqd);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class SynchronizedBlock {

	public static void main(String[] str) {
		MovieTicketCounter movieTicketCounter = new MovieTicketCounter();
		Thread thread1 = new Thread(new TicketHelper(movieTicketCounter));
		Thread thread2 = new Thread(new TicketHelper(movieTicketCounter));
		Thread thread3 = new Thread(new TicketHelper(movieTicketCounter));
		Thread thread4 = new Thread(new TicketHelper(movieTicketCounter));
		//Thread start would instantiate threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}