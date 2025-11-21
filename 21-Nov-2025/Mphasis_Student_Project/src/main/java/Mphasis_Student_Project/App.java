package Mphasis_Student_Project;

public class App {
	
	static {
		System.out.println("First Static Block ");
	}
	
	public static void main(String[] args) {
		
		Student student = new Student(101, "M1");
		Student student2 = new Student(101, "M1");
		
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());

		System.out.println(student == student2);
		System.out.println(student.equals(student2));

	}
}
