package practice.two.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
@NamedQueries({ @NamedQuery(name = "Employee.findAll", query = "from Employee"),
		@NamedQuery(name = "Employee.findById", query = "from Employee where emplId=:e"),
		@NamedQuery(name = "Employee.findById", query = "from Employee where emplId=:e"),
		@NamedQuery(name = "Employee.findById", query = "from Employee where emplId=:e") })
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emplId;
	private String empName;
	private double empSalary;

	public Employee() {
		super();
	}

	public Employee(int emplId, String empName, double empSalary) {
		super();
		this.emplId = emplId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public int getEmplId() {
		return emplId;
	}

	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
}
