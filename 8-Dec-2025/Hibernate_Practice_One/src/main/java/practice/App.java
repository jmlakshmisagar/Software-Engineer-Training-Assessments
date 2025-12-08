package practice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import practice.model.Student;
import practice.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student student1 = new Student(1, "mphasis", "java");
		Student student2 = new Student(1, "mphasis", "java");
		session.save(student1);
		session.save(student2);

		System.out.println("object added");

		List<Student> list = session.createQuery("From Student", Student.class).list();
		for (Student student : list) {
			System.out.println(student2);
		}

		System.out.println("list showed");

		Student student = session.get(Student.class, 1);
		if (student != null) {
			session.delete(student);
			session.close();
			System.out.println("deleted");
		}
		

		transaction.commit();
	}
}
