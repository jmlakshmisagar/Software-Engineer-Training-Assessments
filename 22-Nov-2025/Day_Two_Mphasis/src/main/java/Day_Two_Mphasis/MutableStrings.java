
package Day_Two_Mphasis;

import java.time.Duration;
import java.time.LocalTime;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class MutableStrings {

	public static void main(String[] args) {

		LocalTime startTime = LocalTime.now(); // Start time
		System.out.println("Start Time: " + startTime);

		StringBuffer buffer = new StringBuffer();
		buffer.append("mphasis");
		buffer.append(" rvce");
		buffer.append(" lx");
		buffer.append(" mphasis");
		buffer.append(" mphasis");
		buffer.append("mphasis mphasis mphasis");

		System.out.println(buffer);
		System.out.println("Capacity: " + buffer.capacity());

		buffer.ensureCapacity(100);

		LocalTime endTime = LocalTime.now(); // End time
		System.out.println("End Time: " + endTime);

		Duration duration = Duration.between(startTime, endTime);
		System.out.println("Time taken: " + duration.toMillis() + " milliseconds");

		StringBuilder builder = new StringBuilder("rvce");

		String string = "mphasis,rvce,lx";

		StringTokenizer stringTokenizer = new StringTokenizer(string, ",");

		while (stringTokenizer.hasMoreElements()) {
			System.out.println(stringTokenizer.nextToken());
		}

		StringJoiner joiner = new StringJoiner(",");
		joiner.add("mphasis");
		joiner.add("rvce");
		joiner.add("lx");
		joiner.add("98987654");

		String string2 = joiner.toString();
		System.out.println(string2);

		System.out.println(joiner);

	}
}
