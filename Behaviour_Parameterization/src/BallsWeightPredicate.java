/*
 * BallsWeightPredicate created for testing ball weight
 */
public class BallsWeightPredicate implements BallsPredicate {

	@Override
	public boolean test(Balls balls) {
		// TODO Auto-generated method stub
				//We set the condition which we wants to test under test Predicate
		return balls.getBallWeight()>200;
	}

}
