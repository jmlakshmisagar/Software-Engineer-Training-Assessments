package practice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import practice.model.Student;
import practice.util.HibernateUtil;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		List<Student> students = session.createQuery("From Student", Student.class).list();
		students.forEach(System.out::println);

//		Student student1 = new Student(4, "sagar", "java");
//		Student student2 = new Student(5, "asd", "java");
//		Student student3 = new Student(6, "sadf", "java");
//		Student student4 = new Student(7, "sagar", "java");
//		
//		session.save(student1);
//		session.save(student2);
//		session.save(student3);
//		session.save(student4);

//		List<Student> students1 = session.createQuery("From Student", Student.class).list();
//		students1.forEach(System.out::println);

//		get all students by cource

		Query<Student> query = session.createQuery("From Student where studentCource=:c");
		query.setParameter("c", "java");
		System.out.println("---------------------");
		Query<Student> query1 = session.createQuery("From Student where studentName like 'a%'");
		query1.list().forEach(System.out::println);

		query.list().forEach(s -> System.out.println(s.getStudentName()));

		Query<Student> query3 = session.createQuery("select count(*) from Student");
		System.out.println(query3.uniqueResult());

		@SuppressWarnings({ "deprecation", "unchecked" })
		Query<Object []> query4 = session
				.createQuery("select studentCource, count(studentCource) from Student group by studentCource");
		query4.list().forEach(s -> System.out.println(s[0] + " " + s[1]));
		
		Query<Student> query2= session.createNamedQuery("Student.findAll",Student.class);
		System.out.println("---------------");
		query2.list().forEach(System.out::println);
		
		Query<Student> query41= session.createNamedQuery("Student.findByCourse",Student.class);
		query41.setParameter("n", "sagar");
		System.out.println("---------------");
		query41.list().forEach(System.out::println);
		
		
		Query<Object> query5= session.createNamedQuery("Student.findStudentCount",Object.class);
		System.out.println("---------------");
		System.out.println(query5.uniqueResult());
		
		Query<Object []> query6 = session.createNamedQuery("Student.studentCource", Object[].class);
		query6.list().forEach(s -> System.out.println(s[0] + " " + s[1]));
		

		transaction.commit();
		session.close();

	}
}
