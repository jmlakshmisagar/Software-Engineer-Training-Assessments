package practice.two.dao;

import java.util.List;

import practice.two.model.Employee;

public interface EmployeeDAOInterface {
	public List<Employee> findAll();

	public Employee findById(int id);

	public void addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee, int id);

	public void deleteEmployee(int id);
	
	public List<Employee> findByFilter(String name, String salary);
}
