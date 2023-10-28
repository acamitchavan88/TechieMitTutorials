/*
 * Author:#TechieMit
 * Lambda Expressions Demo
 */
public class LamdaExprDemo1 {

	public static void main(String[] args) {
		// ()->
		new Thread(()->System.out.println("Thread Started by Lambda Expressions"
				)).start();

	}

}
