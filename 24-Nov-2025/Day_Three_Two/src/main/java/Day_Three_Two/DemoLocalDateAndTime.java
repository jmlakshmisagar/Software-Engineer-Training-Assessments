package Day_Three_Two;

import java.time.LocalDate;
import java.time.Period;

public class DemoLocalDateAndTime {

	public static void main(String[] args) {
//		LocalDate date = LocalDate.now();
//		System.out.println(date);
//
//		LocalDate date2 = LocalDate.parse("2025-11-11");
//		System.out.println(date2);

		LocalDate date3 = LocalDate.now();
		LocalDate date4 = LocalDate.of(2002, 6, 8);
		Period period = Period.between(date4, date3);

		System.out.println(period);

	}

}
