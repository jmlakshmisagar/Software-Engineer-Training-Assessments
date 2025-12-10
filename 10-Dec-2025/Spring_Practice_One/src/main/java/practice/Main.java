package practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import practice.beans.Student;
import practice.config.SpringConfiguration;

public class Main {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {
			Student student = (Student) applicationContext.getBean(Student.class);
			System.out.println(student);
		}
	}
}
