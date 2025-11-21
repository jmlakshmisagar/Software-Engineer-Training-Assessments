package com.mphasis.DayOneMavenProject;

public class Employee {

	private String empName;
	private int empId;
	private String designation;
	private String mobileNumber;

	public Employee(String empName, int empId, String designation, String mobileNumber) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.designation = designation;
		this.mobileNumber = mobileNumber;
	}

	public Employee() {

	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", designation=" + designation + ", mobileNumber="
				+ mobileNumber + "]";
	}

}
