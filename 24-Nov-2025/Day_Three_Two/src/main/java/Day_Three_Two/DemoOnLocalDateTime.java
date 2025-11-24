package Day_Three_Two;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalDateTime {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDateTime dateTime1 = LocalDateTime.of(1996,11,27, 20, 0);
		System.out.println(dateTime1);
		
//		LocalDateTime dateTime2 = LocalDateTime.
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:sec a");
		String dateTime2 = dateTimeFormatter.format(dateTime1);
		
		System.out.println(dateTime2);
;	}

}
   