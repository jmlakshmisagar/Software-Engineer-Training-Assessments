package practice.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import practice.model.Department;
import practice.utils.HibernateUtil;

public class DepartmentDAO implements DepartmentDAOInterface {

	@Override
	public List<Department> findAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.createQuery("From Department", Department.class).list();
	}

	@Override
	public void addEmployee(Department department) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			session.persist(department);
			transaction.commit();
		}

	}

	@Override
	public Department findById(int id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.get(Department.class, id);
		}
	}

	@SuppressWarnings("deprecation")
	public void delete(int id) {
	    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        Transaction transaction = session.beginTransaction();

	        Department department = session.get(Department.class, id);

	        if (department != null) {
	            department.getEmployees().forEach(emp -> emp.setDepartment(null));
	            session.flush();
	            session.delete(department); 
	        }

	        transaction.commit();
	    }
	}

}
