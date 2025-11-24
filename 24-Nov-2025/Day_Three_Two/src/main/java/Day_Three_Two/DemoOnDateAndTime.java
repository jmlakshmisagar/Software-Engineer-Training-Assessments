package Day_Three_Two;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoOnDateAndTime {
	public static void main(String[] args) {
		// Current date and time
		Date now = new Date();
		System.out.println("Current Date: " + now);

		// Get time in milliseconds since epoch
		long millis = now.getTime();
		System.out.println("Milliseconds since Jan 1, 1970: " + millis);

		// Create a date from milliseconds
		Date specificDate = new Date(0); // Jan 1, 1970
		System.out.println("Specific Date: " + specificDate);

		// Compare dates
		Date futureDate = new Date(System.currentTimeMillis() + 86400000L); // +1 day
		System.out.println("Is futureDate after now? " + futureDate.after(now));

		// Modify date (not recommended, but possible)
		now.setTime(System.currentTimeMillis() - 86400000L); // -1 day
		System.out.println("Modified Date: " + now);

		long ms = System.currentTimeMillis();
		System.out.println(ms);

		Date curr = new Date(ms);
		System.out.println(curr);

		long ddd = 2345334202345l;
		Date erer = new Date(ddd);
		System.out.println(erer);

		Date newDate = new Date(2024, 07, 22);
		System.out.println(newDate);

		System.out.println(futureDate);

		Date date = new Date(2025 - 1900, 01, 24);
		Date date2 = new Date(1996 - 1900, 07, 25);

		System.err.println(date.after(date2));

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(dateFormat.format(date2));
		
		System.out.println(dateFormat.toLocalizedPattern());
		
		System.out.println(date.toString());
		
		
		
//		java.sql.Date d = new java.sql.Date();

	}
}
