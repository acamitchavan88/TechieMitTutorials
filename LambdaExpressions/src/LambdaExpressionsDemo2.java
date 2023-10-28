import java.util.ArrayList;
/* 
 * @Author #TechieMit
 *  Lambda Expressions Demo 2
 */

public class LambdaExpressionsDemo2 {
	@FunctionalInterface
	interface OperatorDemo
	{
		static void display()
		{
			System.out.println("This will display the function");
		}
		int result(int a,int b);

		default void addAll()
		{
			System.out.println("This is default method in Operator Demo");
		}
		
	}

	public static void main(String[] args) {
		int twosquare=2;
		System.out.println("---------------");
		System.out.println("Result of 1st lamda operation");
		Runnable r=()->System.out.println(twosquare*twosquare);
		r.run();
		System.out.println("---------------");
		ArrayList<Integer> zerotoFiveNosList=new ArrayList<>();

		zerotoFiveNosList.add(1);
		zerotoFiveNosList.add(2);
		zerotoFiveNosList.add(3);
		zerotoFiveNosList.add(4);
		zerotoFiveNosList.add(5);
		System.out.println("Result of 2nd lamda operation");
		zerotoFiveNosList.forEach(System.out::println);

		//OperatorDemo
		System.out.println("---------------");
		System.out.println("Result of 3rd lamda operation");
		int num1=8,num2=4;
		OperatorDemo opDemo=(int a,int b)->a*b;
		System.out.println("Result of multiplication is::"+opDemo.result(num1, num2));
		OperatorDemo opDemo1=(int a,int b)->a/b;
		System.out.println("Result of division is::"+opDemo1.result(num1, num2));
		OperatorDemo opDemo2=(int a,int b)->a+b;
		System.out.println("Result of addition is::"+opDemo2.result(num1, num2));
		OperatorDemo opDemo3=(int a,int b)->a-b;
		System.out.println("Result of subtraction is::"+opDemo3.result(num1, num2));
		//Static method in Functional Interface OperatorDemo
		OperatorDemo.display();
		//Give call to default method
		opDemo3.addAll();

	}

}
