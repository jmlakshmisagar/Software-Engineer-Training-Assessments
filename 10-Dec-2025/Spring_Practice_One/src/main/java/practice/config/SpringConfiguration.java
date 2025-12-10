package practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import practice.beans.Course;
import practice.beans.Student;

@Configuration
@ComponentScan(basePackages = "practice")
@PropertySource("classpath:data.properties")
public class SpringConfiguration {

//	@Bean
//	public Student getStudent() {
//		return new Student(1, "Mphasis", getCourse());
//	}
//
//	@Bean
//	public Course getCourse() {
//		return new Course(101, "Java");
//	}
}
