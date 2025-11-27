package streams.api;

import java.util.Arrays;
import java.util.Comparator;

public class App {
	public static void main(String[] args) {

		Student[] students = { new Student(1, "Lakshmi", 22, "Computer Science", 89.5),
				new Student(2, "Sagar", 21, "Electronics", 76.0), new Student(3, "Anita", 23, "Mechanical", 82.3),
				new Student(4, "Ravi", 22, "Civil", 67.8), new Student(5, "Priya", 20, "IT", 91.2),
				new Student(6, "Kiran", 24, "Computer Science", 85.0), new Student(7, "Deepa", 22, "Electrical", 73.5),
				new Student(8, "Manoj", 21, "Electronics", 88.9), new Student(9, "Sneha", 23, "IT", 95.4),
				new Student(10, "Arjun", 22, "Mechanical", 79.6) };

//		Arrays.stream(students).sorted((a, b) -> a.getAge() - b.getAge()).forEach(System.out::println);

//		Arrays.stream(students).filter(a -> a.getMarks() > 90).forEach(System.out::println);

//		Arrays.stream(students).filter(a -> a.getDepartment() == "Computer Science").forEach(System.out::println);

//		Arrays.stream(students).sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(System.out::println);

//		Arrays.stream(students).map(a -> a.getName()).forEach(System.out::println);
		
		

	}
}
