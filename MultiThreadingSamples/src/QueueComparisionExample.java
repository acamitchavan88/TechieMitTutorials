import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/*
 * #TechieMit program on blockingQueue and priorityblockingQueue
 */
// To create tasks and compare tasks

class TaskDemo implements Comparable<TaskDemo>
{

	public TaskDemo(int priority, String taskName) {
		super();
		this.priority = priority;
		this.taskName = taskName;
	}

	private int priority;
	private String taskName;
	@Override
	public String toString() {
		return "TaskDemo [priority=" + priority + ", taskName=" + taskName
				+ "]";
	}

	
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	@Override
	public int compareTo(TaskDemo otherTask) {
		// TODO Auto-generated method stub
		return Integer.compare(otherTask.priority, this.priority);
	}
	
}
public class QueueComparisionExample {

	public static void main(String[] args) throws InterruptedException  {
	
		List<TaskDemo> taskDemoList=Arrays.asList(new TaskDemo(2, "Task1")
				,new TaskDemo(1, "Task2")
				,new TaskDemo(4, "Task3")
				,new TaskDemo(3, "Task4"),
				new TaskDemo(2, "Task5")
				,new TaskDemo(1, "Task6")
				,new TaskDemo(4, "Task7")
				,new TaskDemo(3, "Task8"),
				new TaskDemo(2, "Task9")
				,new TaskDemo(1, "Task10")
				,new TaskDemo(4, "Task11")
				,new TaskDemo(3, "Task12"),
				new TaskDemo(2, "Task13")
				,new TaskDemo(1, "Task14")
				,new TaskDemo(4, "Task15")
				,new TaskDemo(3, "Task16"),
				new TaskDemo(2, "Task17")
				,new TaskDemo(1, "Task18")
				,new TaskDemo(4, "Task19")
				,new TaskDemo(3, "Task20")
				);
		
		
		//Creation of queues and executors
		ExecutorService execTask=Executors.newFixedThreadPool(20);
		BlockingQueue<TaskDemo> blockingQueue=new LinkedBlockingQueue<>();
		PriorityBlockingQueue<TaskDemo> priorityBlockingQueue=new PriorityBlockingQueue<>();
		
		
		//Creation of runnable execution
		
		Runnable blockingProducerQueue=()->{
			for(TaskDemo taskDemoElem:taskDemoList)
			{
				blockingQueue.add(taskDemoElem);
				System.out.println("Elements inserted into the blocking Queue::"+taskDemoElem);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}	
			}
		};
		//Creation of prioirity blocking Queue
		Runnable priorityProducerQueue=()->{
			for(TaskDemo taskDemoElem:taskDemoList)
			{
				priorityBlockingQueue.add(taskDemoElem);
				System.out.println("Elements inserted into the priority Queue::"+taskDemoElem);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}	
			}
		};
		
		Runnable consumerBlockingQueue=()->{
			System.out.println("Removing elements from blocking Queue");
			while(!blockingQueue.isEmpty())
			{
				try {
				TaskDemo task=	blockingQueue.take();
				System.out.println("Currently processed task from consumerBlockingQueue is::"+task);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}
			}
		};
		
		Runnable consumerPriorityBlockingQueue=()->{
			System.out.println("Removing elements from priority blocking Queue");
			while(!priorityBlockingQueue.isEmpty())
			{
				try {
					TaskDemo indTask=priorityBlockingQueue.take();
					System.out.println("Currently processed task from priority Queue is::"+indTask);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}
			}
		};
		//Submission of executable Tasks
		execTask.submit(blockingProducerQueue);
		execTask.submit(priorityProducerQueue);
		Thread.sleep(2000);
		execTask.submit(consumerBlockingQueue);
		execTask.submit(consumerPriorityBlockingQueue);
		
		if(!execTask.awaitTermination(13000, TimeUnit.MILLISECONDS))
		{
			execTask.shutdown();
			System.out.println("Graceful shutdown of all the tasks");
		}
		
		
		
}
}
