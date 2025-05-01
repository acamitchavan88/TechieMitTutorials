/*
 * Author #TechieMit Program to demonstrate Loose coupling   
 */ 
interface NotificationService
{
	void send(String to,String message);
}

class SMSNotificationService implements NotificationService
{  

	@Override
	public void send(String to, String message) {
		System.out.println("Sending sms to the number::"+to+" \t"+message);
	}
	}
class EmailNotificationService implements NotificationService
{

	@Override
	public void send(String to, String mail) {
		System.out.println("Sending email to the mail id::"+to+"\t"+mail);
		
	}
	}
class NotificationManager
{
	private NotificationService notificationService;
	
	public NotificationManager(NotificationService notificationService)
	{
		this.notificationService=notificationService;
	}
	public void notifyUser(String to,String message)
	{
		notificationService.send(to, message);
			
	}
}
public class LooseCouplingPgm {

	public static void main(String[] args) {
		NotificationService emailNotificationService=new EmailNotificationService();
		NotificationManager emailNotificationMgr=new NotificationManager(emailNotificationService);
		emailNotificationMgr.notifyUser("acamit@dummy.com", "Hi this is sample email");
		
		NotificationService smsNotificatificationService=new SMSNotificationService();
		NotificationManager smsNotificationMgr=new NotificationManager(smsNotificatificationService);
		smsNotificationMgr.notifyUser("9921744504", "This is test sms");

	}

}
