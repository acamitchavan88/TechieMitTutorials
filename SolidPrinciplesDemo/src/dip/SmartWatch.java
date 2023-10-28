package dip;

public class SmartWatch implements Watch{

	@Override
	public void showTime() {
	System.out.println("This will show Current Time");
		
	}

	@Override
	public void showDate() {
		// TODO Auto-generated method stub
		System.out.println("This will show Todays Date");
	}
	
	public void trackHealth()
	{
		System.out.println("This will do following functions-:");
		System.out.println("Count calories");
		System.out.println("Count steps");
		System.out.println("Monitor heartbeat");
	}
	
	public void sendMails()
	{
		System.out.println("You can send mails as well as receive mails");
	}

	public void manageCalls()
	{
		System.out.println("You can manage calls through it");
	}
}
