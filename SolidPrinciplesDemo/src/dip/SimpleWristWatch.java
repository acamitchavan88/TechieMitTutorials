package dip;

public class SimpleWristWatch implements Watch{

	@Override
	public void showTime() {
		System.out.println("This will show Current Time");
		
	}

	@Override
	public void showDate() {
		System.out.println("This will show Todays Date");
		
	}

}
