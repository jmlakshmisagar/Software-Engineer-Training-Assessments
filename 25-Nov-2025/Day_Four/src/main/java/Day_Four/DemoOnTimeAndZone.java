package Day_Four;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnTimeAndZone {

	public static void main(String[] args) {
		ZonedDateTime dateTime = ZonedDateTime.now();

//		System.out.println(dateTime);
//		System.out.println(dateTime.getDayOfYear());

		ZonedDateTime dateTime2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(dateTime2);

		int diffsec = dateTime.getOffset().getTotalSeconds() - dateTime2.getOffset().getTotalSeconds();
		int h = diffsec / 3600;
		int m = (diffsec % 3600) / 60;

		System.out.println("Diff: " + h + "h " + m);

		LocalDateTime dateTime3 = LocalDateTime.now();
		ZonedDateTime dateTime4 = dateTime3.atZone(ZoneId.of("Asia/Calcutta"));
		System.out.println(dateTime4.toLocalDateTime());

		System.out.println(dateTime4);
		ZonedDateTime indianTime = ZonedDateTime.now();
		ZonedDateTime usaTime = indianTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(indianTime);
		System.out.println(usaTime);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:sec a z");
		String dateFormatter = indianTime.format(dateTimeFormatter);
		System.out.println(dateFormatter);

	}

}
