package practice.dao;

import java.util.List;

import org.hibernate.Session;

import practice.model.Passport;
import practice.model.Person;
import practice.utils.HibernateUtil;

public class PassportDAO implements PassportDAOInterface {

	@Override
	public List<Person> findAll() {
		try (Session session = HibernateUtil.buildSessionFactory().openSession()) {
			return session.createQuery("From Person", Person.class).list();
		}
	}

	@Override
	public void addPassport(Person person) {
		try (Session session = HibernateUtil.buildSessionFactory().openSession()) {
			session.save(person);
		}
	}

	@Override
	public Person findById(Long id) {
		try (Session session = HibernateUtil.buildSessionFactory().openSession()) {
			Person person = session.get(Person.class, 1);
			return person;
		}
	}

}
