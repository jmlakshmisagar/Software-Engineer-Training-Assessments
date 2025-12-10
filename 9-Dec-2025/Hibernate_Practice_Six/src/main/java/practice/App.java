package practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import practice.dao.DepartmentDAO;
import practice.model.Department;
import practice.model.Employee;

public class App {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		DepartmentDAO departmentDAO = new DepartmentDAO();
//		EmployeeDAO employeeDAO = new EmployeeDAO();

		Department department = new Department("Training");
		Employee employee1 = new Employee("Keller");
		Employee employee2 = new Employee("Aryabhatta");
		Employee employee3 = new Employee("Topaz");

		department.addEmployee(employee1);
		department.addEmployee(employee2);
		department.addEmployee(employee3);

		departmentDAO.addEmployee(department);

		LOGGER.info("Employee Added..");
		departmentDAO.findAll().forEach(System.out::println);

		Department department2 = departmentDAO.findById(1);
		Department department3 = departmentDAO.findById(1);
		System.out.println(department2 == department3 ? "true" : "false");

	}
}
