package Day_Three_Two;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalTime {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		LocalTime localTime2 = LocalTime.of(14, 30);
		System.out.println(localTime2);

		String string = "21:35:20";
		LocalTime localTime3 = LocalTime.parse(string);
		System.out.println(localTime3);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
		String formattedTime = dateTimeFormatter.format(localTime3);
		System.out.println(formattedTime);

		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);

	}

}
