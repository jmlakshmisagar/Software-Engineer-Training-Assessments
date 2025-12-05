package hibernate.practice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.practice.model.Course;
import hibernate.practice.model.Student;

public class App {
	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

//		List<Student> students = session.createQuery("from Student", Student.class).list();
//
//		for (Student s : students) {
//			System.out.println(s);
//		}
//
//		Student student = session.get(Student.class, 1);
//		if (student != null) {
//			student.setStudentCourse("RVCE");
//			student.setStudentEmail("a@gmail.com");
//			student.setStudentName("jmlakshmisagar");
//		}
//		session.update(student);
//		System.out.println("Saved");
//
//		Student student2 = session.get(Student.class, 2);
//		if (student2 != null) {
//			session.delete(student2);
//			System.out.println("deleted");
//		}
//		List<Student> students1 = session.createQuery("from Student", Student.class).list();
//
//		for (Student s : students1) {
//			System.out.println(s);
//		}

//		Course course1 = new Course("java", 1200);
//		Course course2 = new Course("mean", 800);
//		Course course3 = new Course("python", 2200);
//		
//		session.save(course1);
//		session.save(course2);
//		session.save(course3);
//		
//		System.out.println("Saved");
//
//		List<Course> students1 = session.createQuery("from Course", Course.class).list();
//
//		for (Course s : students1) {
//			System.out.println(s);
//		}
//
//		Course course = session.get(Course.class, 1);
//		if (course != null) {
//			course.setCourseName("JAVA DELEVOPMENT");
//		}
//		session.update(course);
//		System.out.println("updated");
//
//		Course course2 = session.get(Course.class, 3);
//		if (course2 != null) {
//			session.delete(course2);
//		}
//		System.out.println("deleted");
//
//		List<Course> students2 = session.createQuery("from Course", Course.class).list();
//
//		for (Course s : students2) {
//			System.out.println(s);
//		}
		transaction.commit();

		session.close();
		factory.close();
	}
}
