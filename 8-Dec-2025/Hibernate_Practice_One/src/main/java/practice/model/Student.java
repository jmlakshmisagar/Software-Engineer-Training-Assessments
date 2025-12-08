package practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")

@NamedQueries({ @NamedQuery(name = "Student.findAll", query = "From Student"),
		@NamedQuery(name = "Student.findByCourse", query = "From Student where studentName=:n"),
		@NamedQuery(name = "Student.findStudentCount", query = "select count(*) from Student") ,
		@NamedQuery(name = "Student.studentCource", query = "select studentCource, count(studentCource) from Student group by studentCource")})
public class Student {

	@Id
	private int id;
	private String studentName;
	private String studentCource;

	public Student(int id, String studentName, String studentCource) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentCource = studentCource;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCource() {
		return studentCource;
	}

	public void setStudentCource(String studentCource) {
		this.studentCource = studentCource;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentCource=" + studentCource + "]";
	}

}
