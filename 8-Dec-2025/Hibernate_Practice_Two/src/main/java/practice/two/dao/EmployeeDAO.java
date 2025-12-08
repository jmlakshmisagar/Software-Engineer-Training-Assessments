package practice.two.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import practice.two.model.Employee;
import practice.two.utils.HibernateUtil;

public class EmployeeDAO implements EmployeeDAOInterface {

	@Override
	public List<Employee> findAll() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createNamedQuery("Employee.findAll", Employee.class).list();
		}
	}

	@Override
	public Employee findById(int id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Query<Employee> query = session.createNamedQuery("Employee.findById", Employee.class);
			query.setParameter("e", id);
			return query.uniqueResult();
		}
	}

	@Override
	public void addEmployee(Employee employee) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.save(employee);
			System.out.println("Added successfully");
		}
	}

	@Override
	public Employee updateEmployee(Employee employee, int id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Employee dbEmp = session.get(Employee.class, id);
			if (dbEmp == null)
				return null;
			dbEmp.setEmpName(employee.getEmpName());
			dbEmp.setEmpSalary(employee.getEmpSalary());
			session.update(dbEmp);

			return dbEmp;
		}
	}

	@Override
	public void deleteEmployee(int id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Employee employee = findById(id);
			session.delete(employee);
		}

	}

	@Override
	public List<Employee> findByFilter(String name, String salary) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);
			Root<Employee> root = criteriaQuery.from(Employee.class);
			List<Predicate> predicates = new ArrayList<Predicate>();
			
			if (name != null && !salary.isEmpty()) {
				predicates.add((Predicate) builder.equal(root.get("name"), name));
			}
			
			criteriaQuery.where(predicates.toArray(new Predicate[0]));
			
			List<Employee> employees = session.createQuery(criteriaQuery).getResultList();
			return employees;
		} 
	}
}


//create a maven project
//model -orders
//properties 
//id
//date
//cost
//list of items

//complete all crud operation
//create a criteria to get all the orders of the given dates with minimum order cost given
//user named queries to get the all the orders of the given dates 
//get all the orders with the min max range given 
//print all the list of items of a given order id