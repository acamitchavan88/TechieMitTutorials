/*
 * BallsColorPredicate created for testing balls color
 */
public class BallsColorPredicate implements BallsPredicate{

	@Override
	public boolean test(Balls balls) {
		// TODO Auto-generated method stub
		return balls.getBallColor().equalsIgnoreCase("White");
	}

}
