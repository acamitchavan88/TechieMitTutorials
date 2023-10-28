import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.Era;
import java.time.chrono.JapaneseDate;
import java.util.Locale;
import java.util.TimeZone;

/*
 * @Author #TechieMit
 *  ZoneId Operations
 */
public class ZoneOffSetDemo {

	public static void main(String[] args) {
		ZoneId zoneId=TimeZone.getDefault().toZoneId();
		System.out.println("*** Start of the output in console***");
		System.out.println("1: Zone Id default::"+zoneId);
	
		ZoneId getEurZoneId=ZoneId.of("Europe/London");
		//Date taken 13th May 2021 
		LocalDate locDateForUK=LocalDate.of(2021, 5, 13);
		ZonedDateTime zoneDtTime=locDateForUK.atStartOfDay(getEurZoneId);
		System.out.println("2: The Zone Date for United Kingdom is::"+zoneDtTime);
		System.out.println("******************");
		//DateTime  taken 22nd Oct 2019 with time in HH:MM:SS
		LocalDateTime localDateTime=LocalDateTime.of(2019, 10, 22, 10, 22,13);
		ZonedDateTime zdDtTime=localDateTime.atZone(getEurZoneId);
		System.out.println("The zone date time for United Kingdom is::"+zdDtTime);
		System.out.println("******************");
		//Instant class to get current zoned Date time
		Instant getInstant=Instant.now();
		ZonedDateTime zoneDateTime=getInstant.atZone(getEurZoneId);
		System.out.println("3:The zone date time is::"+zoneDateTime);
		//PST Pacific Standard Time
		ZoneOffset zoneOffSet=ZoneOffset.of("-08:00");
		LocalDateTime locDateTimeforPST=LocalDateTime.of(2020, 04, 13, 14, 20, 33);
		OffsetDateTime getOffSetDtTime=OffsetDateTime.of(locDateTimeforPST, zoneOffSet);
		System.out.println("Get the offset Date time is::"+getOffSetDtTime);
		System.out.println("******************");
		LocalDate getLocalJpnDate=LocalDate.of(2018, 05, 15);
		JapaneseDate jpnDate=JapaneseDate.from(getLocalJpnDate);
		System.out.println("The japanese date is::"+jpnDate);
		System.out.println("******************");
		//Chronology
		Chronology germanChronology=Chronology.ofLocale(Locale.GERMAN);
		ChronoLocalDate getChronoLocDt =LocalDate.of(2022,05, 14);
		Era getEra=getChronoLocDt.getEra();
		ChronoLocalDate chronoLocDatenow=germanChronology.dateYearDay(getEra, 2022, 14);
		
		System.out.println("The era date for German Locale is::"+chronoLocDatenow);
		System.out.println("*** End of the output in console **");
	}

}
