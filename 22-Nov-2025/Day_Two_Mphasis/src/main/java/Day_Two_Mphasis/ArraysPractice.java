package Day_Two_Mphasis;

import java.util.ArrayList;

public class ArraysPractice {

	public static void main(String[] args) {
		ArrayList<Employees> array = new ArrayList<Employees>();

		Employees employees[] = new Employees[5];
		Employees employees2 = new Employees(1, "RVCE", "SWE");
		Employees employees3 = new Employees(2, "RVCE", "SDE");
		Employees employees4 = new Employees(3, "RVCE", "SWE");
		Employees employees5 = new Employees(4, "RVCE", "TSE");
		Employees employees6 = new Employees(5, "RVCE", "SWE");

		employees[0] = employees2;
		employees[1] = employees3;
		employees[2] = employees4;
		employees[3] = employees5;
		employees[4] = employees6;

		int totalSWE = 0;
		for (int i = 0; i < employees.length; i++) {
			Employees emp = new Employees();
			emp.setDesignation(employees[i].getDesignation());
			
			if (emp.getDesignation().equalsIgnoreCase("SWE")) {
				totalSWE += 1;
			}
		}

		System.out.println(totalSWE);

	}

}
