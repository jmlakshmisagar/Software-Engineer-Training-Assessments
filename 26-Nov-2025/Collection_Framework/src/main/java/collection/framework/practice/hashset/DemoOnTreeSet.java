package collection.framework.practice.hashset;

import java.util.TreeSet;

public class DemoOnTreeSet {
	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<Student>();

		students.add(new Student(2, "Ananya", "Mechanical", 23, 72.0));
		students.add(new Student(4, "Priya", "Civil", 22, 67.8));
		students.add(new Student(1, "Aarav", "Computer Science", 21, 85.5));
		students.add(new Student(6, "Meera", "Computer Science", 24, 55.4));
		students.add(new Student(5, "Vikram", "Electronics", 19, 88.9));
		students.add(new Student(3, "Rohan", "Electrical", 20, 91.2));
		students.add(new Student(7, "Siddharth", "Mechanical", 21, 79.3));
		students.add(new Student(10, "Ishita", "Electronics", 23, 73.6));
		students.add(new Student(8, "Kavya", "Electrical", 25, 62.7));
		students.add(new Student(9, "Arjun", "Civil", 20, 95.0));
		students.add(new Student(11, "Rajesh", "Computer Science", 22, 81.1));
		students.add(new Student(12, "Sneha", "Mechanical", 19, 68.4));
		students.add(new Student(13, "Manoj", "Electrical", 24, 77.9));
		students.add(new Student(16, "Lakshmi", "Computer Science", 20, 58.2));
		students.add(new Student(15, "Aditya", "Electronics", 26, 64.5));
		students.add(new Student(14, "Neha", "Civil", 21, 92.3));

		students.forEach(System.out::println);
	}
}
