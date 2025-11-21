package Mphasis_Student_Project;

import java.util.Objects;

public class Student {
	
	private int student_id;
	private String name;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}
      
	public void setName(String name) {
		this.name = name;
	}

	public Student(int student_id, String name) {
		super();
		this.student_id = student_id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && student_id == other.student_id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, student_id);
	}

}
