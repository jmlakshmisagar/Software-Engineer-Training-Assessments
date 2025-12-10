package practice.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Student {
	
	@Value("${Student.sid}")
	private int sid;
	@Value("${Student.sname}")
	private String sname;
	
	@Autowired
	private Course course;

	public Student(int sid, String sname, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}

	public Student() {
		super();
		System.out.println("Bean created....");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
	}

	@PostConstruct
	public void onInit() {
		System.out.println("After bean instantiation....");
	}
	
	@PreDestroy
	public void onDestroy() {
		System.out.println("Before bean destroy.....");
	}
}
