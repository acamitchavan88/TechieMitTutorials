/*
 * Author #TechieMit
 *  Callable program demo to demonstrate use of callable in Java
 */
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableDemo implements Callable<Integer>{
	public static void main(String []s) throws Exception
	{
		
		FutureTask<Integer> futureTasks[]=new FutureTask[10];
		System.out.println("Random numbers generated from less than 1000");
		for(int i=0;i<10;i++)
		{
		Callable callableDemo=new CallableDemo();
		 //Will call the task
		futureTasks[i]=new FutureTask<>(callableDemo);
			 Thread thread=new Thread(futureTasks[i]);
			 thread.start();
			 //Show the demo of 10 random nos
		System.out.println(futureTasks[i].get());
		}
	   	
	}

	//Implementation of call method
	@Override
	public Integer call() throws Exception {
		Random randomNumber=new Random();
		Integer getRandomNumber=randomNumber.nextInt(1000);
		//339 400 100  ms 
		Thread.sleep(getRandomNumber);

		// TODO Auto-generated method stub
		return getRandomNumber;
	}

}
