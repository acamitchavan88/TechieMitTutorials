import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.TemporalAdjusters.*;
/*
 * @Author #TechieMit
 * DateManipulation methods 
 */
public class DateManipulation {

	public static void main(String[] args) {
		//Date manipulation with LocalDate
		LocalDate locDate1=LocalDate.of(2022,10,14);
		System.out.println("Original Local Date  value is::"+locDate1);
		//Days would 
		LocalDate locDate2=locDate1.plusDays(3);
		System.out.println("Local Date 2 after adding days value is::"+locDate2);
		LocalDate locDate3=locDate1.minusMonths(1);
		System.out.println("Local Date 3 after minus Month value is::"+locDate3);
		LocalDate locDate4=locDate1.plusWeeks(3);
		System.out.println("Local Date 4 after plus weeks value is::"+locDate4);
		LocalDate locDate5=locDate1.plus(5, ChronoUnit.MONTHS);
		System.out.println("After using ChronoUnit the local Date value is::"+locDate5
				);
		LocalDate locDate6=locDate1.with(lastDayOfMonth());
		System.out.println("Using temporal Adjusters::"+locDate6);
	}

}
