package practice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	
	@Value("${Course.id}")
	private int id;
	@Value("${Course.name}")
	private String name;

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

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}

	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Course() {
		super();
	}

}
