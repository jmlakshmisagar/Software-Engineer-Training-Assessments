package practice.dao;

import java.util.List;

import practice.model.Employee;

public interface EmployeeDAOInterface {
	public List<Employee> findAll();
	public void addEmployee(Employee employee);
	public Employee findById(int id);
}
