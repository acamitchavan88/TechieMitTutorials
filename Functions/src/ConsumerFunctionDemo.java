import java.util.function.Consumer;

/*
 * @Author #TechieMit
 */
public class ConsumerFunctionDemo {
	public static void main(String []s)
	{
			Consumer<Integer> consumer=a->System.out.println(a*a);
			//Here it gives internally call to the consumer interface
			consumer.accept(3);	
	}
}
