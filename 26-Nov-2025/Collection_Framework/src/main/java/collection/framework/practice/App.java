package collection.framework.practice;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(1, "Aarav", "Computer Science", 21, 85.5));
		students.add(new Student(2, "Ananya", "Mechanical", 23, 72.0));
		students.add(new Student(3, "Rohan", "Electrical", 20, 91.2));
		students.add(new Student(4, "Priya", "Civil", 22, 67.8));
		students.add(new Student(5, "Vikram", "Electronics", 19, 88.9));
		students.add(new Student(6, "Meera", "Computer Science", 24, 55.4));
		students.add(new Student(7, "Siddharth", "Mechanical", 21, 79.3));
		students.add(new Student(8, "Kavya", "Electrical", 25, 62.7));
		students.add(new Student(9, "Arjun", "Civil", 20, 95.0));
		students.add(new Student(10, "Ishita", "Electronics", 23, 73.6));
		students.add(new Student(11, "Rajesh", "Computer Science", 22, 81.1));
		students.add(new Student(12, "Sneha", "Mechanical", 19, 68.4));
		students.add(new Student(13, "Manoj", "Electrical", 24, 77.9));
		students.add(new Student(14, "Neha", "Civil", 21, 92.3));
		students.add(new Student(15, "Aditya", "Electronics", 26, 64.5));
		students.add(new Student(16, "Lakshmi", "Computer Science", 20, 58.2));
		students.add(new Student(17, "Harsha", "Mechanical", 22, 87.6));
		students.add(new Student(18, "Pooja", "Electrical", 23, 69.8));
		students.add(new Student(19, "Suresh", "Civil", 19, 74.1));
		students.add(new Student(20, "Divya", "Electronics", 25, 90.0));
		students.add(new Student(21, "Ganesh", "Computer Science", 27, 63.3));
		students.add(new Student(22, "Varun", "Mechanical", 20, 82.7));
		students.add(new Student(23, "Ritika", "Electrical", 21, 71.4));
		students.add(new Student(24, "Ashok", "Civil", 24, 59.9));
		students.add(new Student(25, "Shreya", "Electronics", 22, 86.2));
		students.add(new Student(26, "Kiran", "Computer Science", 23, 94.5));
		students.add(new Student(27, "Deepak", "Mechanical", 19, 66.8));
		students.add(new Student(28, "Tanvi", "Electrical", 26, 78.3));
		students.add(new Student(29, "Mohan", "Civil", 20, 83.9));
		students.add(new Student(30, "Bhavana", "Electronics", 21, 60.7));

		for (Student s : students) {
			System.out.println(s);
		}

//		students.sort((i, j) -> i.getId() > j.getId() ? 1 : -1);
//		students.sort((o1, o2) -> o1.compare(o1, o2));
//		Collections.sort(students);
		
		students.sort(new DepartmentComparator()
				.thenComparing(new NameComparator())
				.thenComparing(new MarksComparator()));
		
		
		System.out.println("------------------------------------------------");

		for (Student s : students) {
			System.out.println(s);
		}
	}
}
