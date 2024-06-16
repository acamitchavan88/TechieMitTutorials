/*
 * Author #TechieMit
 *  Program to demonstrate use of runnable in Java 8
 *  
 *  (()->{});
 */
public class RunnableDemo {

	public static void main(String[] args) {
		Runnable runnableLambda=(()->{
		
			System.out.println("This is inside Runnable 1 using lamda expressions");
		});
		
		
		
		new Thread(runnableLambda).start();
	}

}
