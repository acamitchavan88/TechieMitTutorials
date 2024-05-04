import java.util.Scanner;

/*
 * @Author #TechieMit 
 *  Program to display synchronization in multithreading in Java
 */
class MovieTicketCounter
{
    int totalAvailableTickets=500;
    int noOfTicketsAvailed;
    //Tickets would get decreased as the tickets are availed per person
    public synchronized  void ticketCounter(int noOfTicketsAvailed)
    {
    if(noOfTicketsAvailed>0 && noOfTicketsAvailed<=totalAvailableTickets)
    {
    	
    	totalAvailableTickets-=noOfTicketsAvailed;
    	System.out.println("Number of tickets availed by ::"+Thread.currentThread().getName()+" is "+noOfTicketsAvailed);
    	System.out.println("Remaining amount of tickets available are ::"+totalAvailableTickets);
    }
    if(totalAvailableTickets==0)
    {
    	System.out.println("Show is HouseFull for today ");
    }
    }
}
class TicketHelper implements Runnable
{
	private MovieTicketCounter movieTicketCounter;
	
	public TicketHelper(MovieTicketCounter movieTicketCounter)
	{
		this.movieTicketCounter=movieTicketCounter;
	}

	
	@Override
	public void run() {
		
		System.out.println("Thread currently executing is::"+Thread.currentThread().getName());
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many tickets do you want::"+Thread.currentThread().getName());
		int noOfTicketsReqd=scan.nextInt();
		movieTicketCounter.ticketCounter(noOfTicketsReqd);
	}
}


public class SynchronizationExample
{
	
	public static void main(String []str)
	{
		MovieTicketCounter movieTicketCounter=new MovieTicketCounter();
		Thread thread1=new Thread(new TicketHelper(movieTicketCounter));
		Thread thread2=new Thread(new TicketHelper(movieTicketCounter));
		thread1.start();
		thread2.start();
		
	}


}