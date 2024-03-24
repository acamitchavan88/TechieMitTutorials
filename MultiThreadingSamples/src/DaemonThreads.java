/*
 * 
 * Author #TechieMit
 * Sample  program to display usage of  Daemon Threads Demo
 */
public class DaemonThreads implements Runnable {

	

	public static void main(String[] args) {
 
		DaemonThreads daemonThreads =new DaemonThreads();
		Thread demoThreads=new Thread(daemonThreads,"demoThread");
		demoThreads.start();
		Thread mainThread=new Thread(()->{
			int sum=0;
			
			for(int i=1;i<=5;i++)
			{
				sum+=i;
			}
			
			System.out.println("The sum of 1st 5 numbers is::"+sum);
			System.out.println("Main thread is Daemon Thread::"+Thread.currentThread().isDaemon());
		});
		mainThread.setDaemon(true);
		mainThread.start();
		
		

	}

	@Override
	public void run(){
		// TODO Auto-generated method stub
		
		Thread threadDemo=new Thread(()->{
			
			for(int i=1;i<=10;i++)
			{
				try {
					Thread.sleep(2000);
					System.out.println("MultiThreading is interesting topic");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		threadDemo.setDaemon(false);
		threadDemo.start();
		System.out.println(" Is the thread running using run method is Daemon:: "+threadDemo.isDaemon());
	}
}
