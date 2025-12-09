package practice.dao;

import java.util.List;

import practice.model.Department;
import practice.model.Employee;

public interface DepartmentDAOInterface {
	public List<Department> findAll();

	public void addEmployee(Department department);

	public Department findById(int id);
}
