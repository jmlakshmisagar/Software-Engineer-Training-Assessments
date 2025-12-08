package practice.two;

import practice.two.dao.EmployeeDAO;
import practice.two.model.Employee;

public class App {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
//		dao.findAll().forEach(System.out::println);

//		dao.addEmployee(new Employee(1, "sdf", 9874654));
		System.out.println(dao.findById(52));
//		dao.findAll().forEach(System.out::println);
		dao.deleteEmployee(52);

	}
}
