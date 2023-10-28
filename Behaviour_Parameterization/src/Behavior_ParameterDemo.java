import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* 
 * @Author #TechieMit
 * Program Sample for Behavior Parameterization Demo
 */
public class Behavior_ParameterDemo {

	public static void main(String[] args) {
		//Arrays.aslist
	List<Balls> getBallsList=Arrays.asList(new Balls(163,"Cricket Ball","White"),
			new Balls(1000,"Rugby Ball","Brown"),
			new Balls(450,"Soccer Ball","White"),
			new Balls(280,"Volley Ball","Multi Color")
			);
	List<Balls> getBallsByWeight=filterBalls(getBallsList,new BallsWeightPredicate());
	System.out.println("Balls by Weight Predicate Result");
	//System.out.println(getBallsByWeight);
	getBallsByWeight.stream().forEach(System.out::println);
	
	List<Balls> getBallsByColor=filterBalls(getBallsList,new BallsColorPredicate());
	getBallsByColor.stream().forEach(System.out::println);
	System.out.println("Balls by Color Predicate Result");
	//System.out.println(getBallsByColor);
	}
	//This is the method that filters balls according to the Predicate assigned
	public static List<Balls> filterBalls(List<Balls> ballsList,BallsPredicate ballsPredicate)
	{
		
		List<Balls> resultantBallsList=new ArrayList<>();
		
		for(Balls getBalls:ballsList)
		{
			//It tests the Predicate
			if(ballsPredicate.test(getBalls))
			{
				resultantBallsList.add(getBalls);
			}
			
		}
		return resultantBallsList;
	}
}
