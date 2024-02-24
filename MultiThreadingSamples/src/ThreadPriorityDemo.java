/*Author #TechieMit
 *  Program to show thread priorities demo in java
 */
public class ThreadPriorityDemo {

	public static void main(String[] args)  {
		Thread t1=new Thread(()->{
			System.out.println("Current Thread Name is ::"+Thread.currentThread().getName()
					+" Current Thread priority is::"+Thread.currentThread().getPriority());
		});
		Thread t2=new Thread(()->{
			System.out.println("Current Thread Name is ::"+Thread.currentThread().getName()
					+" Current Thread priority is::"+Thread.currentThread().getPriority());
		});
		Thread t3=new Thread(()->{
			System.out.println("Current Thread Name is ::"+Thread.currentThread().getName()
					+" Current Thread priority is::"+Thread.currentThread().getPriority());
		});
		Thread t4=new Thread(()->{
			System.out.println("Current Thread Name is ::"+Thread.currentThread().getName()
					+" Current Thread priority is ::"+Thread.currentThread().getPriority());
		});
		Thread t5=new Thread(()->{
			System.out.println("Current Thread Name is ::"+Thread.currentThread().getName()
					+" Current Thread priority is::"+Thread.currentThread().getPriority());
		});
		
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.start();
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.start();
		t4.setPriority(Thread.NORM_PRIORITY);
		t5.start();
		t5.setPriority(Thread.MIN_PRIORITY);
		
		
	}

}
