/*Author #TechieMit
 *  Example of CompletableFutureDemo using Java8
 * 
 */
package multithreadingDemo;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

	public static void main(String[] args) {

CompletableFuture<String> stringToStart=CompletableFuture.supplyAsync(()->"Practical Demo of completableFuture");

 //ThenApply method 
	CompletableFuture<String> thenApplyVar=stringToStart.thenApply(str->str+"\t Is interesting topic");
	
	//Join the string
	String resultValue=thenApplyVar.join();
	
	System.out.println("Result value is::"+resultValue);
		

	}

}
