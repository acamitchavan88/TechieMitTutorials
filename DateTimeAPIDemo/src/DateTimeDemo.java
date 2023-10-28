import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
/*
 * @Author #TechieMit
 *  Date API Demo Java 8
 */
public class DateTimeDemo {

	//Get Today date
	public static void main(String p[])
	{
		LocalDate currentLocalDate=LocalDate.now();

		LocalDate specificDate=LocalDate.of(1992, 3, 29);

		int monthValue=specificDate.getMonthValue();
		int year=specificDate.getYear();
		int monthDay=specificDate.getDayOfMonth();
		int dayOfYear=specificDate.getDayOfYear();
		DayOfWeek dayofWeak=specificDate.getDayOfWeek();
		int monthlength=specificDate.lengthOfMonth();
		DateTimeFormatter datetimeFormat=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		System.out.println("Current Local Date is::"+currentLocalDate.format(datetimeFormat).toString());
		System.out.println("Month value of specificDate is::"+monthValue);
		System.out.println("Year value of specificDate is::"+year);
		System.out.println("Month of Day Local Date is::"+monthDay);
		System.out.println("Day of Year is::"+dayOfYear);
		System.out.println("Specific  Date dayofWeak::"+dayofWeak);
		System.out.println("Length of month in Local Date is::"+monthlength);
	}


}
