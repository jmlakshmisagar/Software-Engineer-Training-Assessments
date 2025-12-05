package hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.practice.model.Course;
import hibernate.practice.model.Student;

public class MainClass {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Course course = new Course("JAVA", 1200);
		session.save(course);

		Student student = new Student("LAKSHMISAGAR J M", course, "9876543210", "A@K.COM");
		session.save(student);
		
		session.delete(course);

		transaction.commit();
		session.close();
		factory.close();

	}
}
