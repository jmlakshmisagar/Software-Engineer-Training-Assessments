package Mphasis_Student_Project;

//import Mphasis_Student_Project.Student.College;

public class StudentMainClass {
	public static void main(String[] args) {
		Student student = new Student(101, "M1");
		Student student2 = new Student(102, "M2");

		Student.College college = new Student.College("RVCE", "Bangalore", 560059);
		System.out.println(student);
		System.out.println(student2);
		System.out.println(college);
		
		Student.College college2 = college;
		System.out.println(college2);
		
		
		String s1=" ";
		String s2="safsadfsad";
		
		System.out.println(s1.substring(0,1));
		
		
		System.out.println(s1.isBlank());
		
	}
}
