import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
/*
 * @Author #TechieMit
 *  Date Time API Part 2
 */
public class LocalDateTimeCombo {

	public static void main(String[] args) {
		//Date  with ChronoField
		LocalDate localChronodate=LocalDate.of(2022, 9, 20);
		int year=localChronodate.get(ChronoField.YEAR);
		int month=localChronodate.get(ChronoField.MONTH_OF_YEAR);
		int day=localChronodate.get(ChronoField.DAY_OF_MONTH);
		System.out.println("\n"+"****ChronoDate output***********");
		System.out.println("\n The year in localDate  is::"+year);
		System.out.println("\nThe month in localDate is::"+month);
		System.out.println("\nThe day in LocalDate is::"+day);
		//Current Time and max local time
		LocalTime getLocalTime=LocalTime.now();
		LocalTime maxLocalTime=LocalTime.MAX;
		//Correct Format for getting them in proper formatS
		FormatStyle timeFormat=FormatStyle.SHORT;
		DateTimeFormatter dtFormat= DateTimeFormatter.ofLocalizedTime(timeFormat);
		System.out.println("\n"+"****Local and max time ***********");
		System.out.println("The local time is::"+getLocalTime.format(dtFormat));
		System.out.println("The max local time is::"+maxLocalTime.format(dtFormat));
		//LocalDateTime combining Date and Time 
		LocalDateTime localDateTime=LocalDateTime.of(localChronodate, maxLocalTime);
		System.out.println("The value of local date  is::"+localDateTime.toLocalDate()
		+"\n"+"The value of local time is::"+localDateTime.toLocalTime());
		LocalDateTime dt1=LocalDateTime.of(1947, Month.AUGUST,5,17,13);
		LocalDate date1=dt1.toLocalDate();
		LocalTime time=dt1.toLocalTime();
		System.out.println("\n Date in LocalDate is::"+date1+"\n Time in LocalDate is::"+time);
	}

}
