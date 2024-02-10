import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * @Author #TechieMit 
 *  Program to demonstrate use of join in multiThreading
 */

public class ThreadJoinExamples {

	public static void main(String[] args) throws InterruptedException   {
		
		Thread thread1=new Thread(()->{
			Path path1=Paths.get("C://Users//amit//Desktop//Topics.txt");
			String lineFeed="This is the line that we enter or feed into the file";
			try {
				Files.write(path1,lineFeed.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread thread2=new Thread(()->{
			Path path=Path.of("C://Users//amit//Desktop//Topics.txt");
			String lineToRead="This is the line which we want to read from the file";
			try {
				Files.writeString(path, lineToRead);
				String contentToRead=Files.readString(path);
				System.out.println("File contents are ::"+contentToRead);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		});
		
		Thread thread3=new Thread(()->{
			Path path1=Paths.get("C://Users//amit//Desktop//sample1.txt");
			Path path2=Paths.get("C://Users//amit//Desktop//sample2.txt");
			//try with resource
			try(OutputStream outputStream=new FileOutputStream(path2.toFile()))
			{
				Files.copy(path1, outputStream);
			}  catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		//Creation of threads
		System.out.println("Thread 1 execution started");
		thread1.start();
		System.out.println("Thread 2 execution started");
		thread2.start();
		System.out.println("Thread 3 execution started");
		thread3.start();
		
		//Join method invocation
		System.out.println("Thread 1 has joined");
		thread1.join();
		System.out.println("Thread 2 has joined");
		thread2.join();
		System.out.println("Thread 3 has joined");
		thread3.join();
		System.out.println("Thread 1 execution finished");
		System.out.println("Thread 2 execution finished");
		System.out.println("Thread 3 execution finished");
		
	}
}
