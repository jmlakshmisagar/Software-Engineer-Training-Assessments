package practice.dao;

import java.util.List;

import practice.model.Passport;
import practice.model.Person;

public interface PassportDAOInterface {
	
	public List<Person> findAll();

	public void addPassport(Person person);

	public Person findById(Long id);
	
}
