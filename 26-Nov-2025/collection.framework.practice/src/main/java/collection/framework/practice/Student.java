
package collection.framework.practice;

import java.util.Comparator;

public class Student implements Comparator<Student>, Comparable<Student> {
	private int id;
	private String name;
	private String course;
	private int age;
	private double marks;

	public Student(int id, String name, String course, int age, double marks) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.age = age;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", age=" + age + ", marks=" + marks
				+ "]";
	}

	// Comparator: Compare by ID
	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}

	// Comparable: Compare by Name
	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}
}
