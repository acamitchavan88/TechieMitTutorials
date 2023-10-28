import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;

public class InstantClassDemo {
	/*
	 * @Author #TechieMit
	 *  Date API Demo Java 8 Part 3
	 */
	public static void main(String[] args) {
		//Instant class demo
		System.out.println("\n Instant value in EpochSecond::"+Instant.ofEpochSecond(5));
		LocalDateTime localTime1=LocalDateTime.of(2022, 3, 10, 13, 22);
		LocalDateTime localTime2=LocalDateTime.of(2022,5,10,10,22);
		//Duration value
		Duration dur1=Duration.between(localTime1, localTime2);
		Duration dur2=Duration.ofHours(2);
		System.out.println("\n The day value in seconds is::"+dur1.getSeconds());
		System.out.println("\n Days duration in seconds is::"+dur2.getSeconds());
		
		Period periodOfDays=Period.ofDays(2);
		Period periodOfYears=Period.ofYears(3);
		System.out.println("\n The period of days is::"+periodOfDays.getDays()
		+"\n Period of Years:: "+periodOfYears.getYears());
	}

}
