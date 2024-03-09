/*
 * @Author #TechieMit
 *  ThreadGroupDemo in java 
 */
public class ThreadGrpDemo implements Runnable {

	public static void main(String[] args) {
		ThreadGrpDemo threadRunnableTarget=new ThreadGrpDemo();
		ThreadGroup threadGroupDemo=new ThreadGroup("ThreadGroup1");
		ThreadGroup getParentThreadGroup=new ThreadGroup("ThreadGroup2");
		
		
		
		Thread thread1=new Thread(threadGroupDemo,threadRunnableTarget,"Thread1");
		thread1.start();
		Thread thread2=new Thread(threadGroupDemo,threadRunnableTarget,"Thread2");
		thread2.start();
		Thread thread3=new Thread(threadGroupDemo,threadRunnableTarget,"Thread3");
		thread3.start();
		Thread thread4=new Thread(threadGroupDemo,threadRunnableTarget,"Thread4");
		thread4.start();
		int activeCount=threadGroupDemo.activeCount();
		System.out.println("The active count of threadgroup threads are::"+activeCount);
		threadGroupDemo.list();
		String getThreadGroupName=threadGroupDemo.getName();
		System.out.println("The name of threadGroup is::"+getThreadGroupName);
		
		System.out.println("The threadGroup parent is:: "+ getParentThreadGroup.getParent());
		
		int getMaxPriorityofGroup=threadGroupDemo.getMaxPriority();
		System.out.println("The thread group maximum priority is "+getMaxPriorityofGroup);
		
		boolean isDestroyed=threadGroupDemo.isDestroyed();
		System.out.println("The thread group is destroyed ::  "+isDestroyed);
		boolean isDaemonThreadGroup=threadGroupDemo.isDaemon();
		System.out.println("The thread group contains any  daemon threads ::   "+isDaemonThreadGroup);

		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String threadName=Thread.currentThread().getName();
		System.out.println("Thread currently Running is ::"+threadName);
	}

}
