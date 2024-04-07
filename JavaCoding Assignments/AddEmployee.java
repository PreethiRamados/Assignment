package javaCodingExercise;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	private List<Employee> empList = new ArrayList();

	public void addEmployee(Employee emp) {
		empList.add(emp);
	}

	public Employee getEmployee(int id) {
		for (Employee emp : empList) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		AddEmployee addEmployee = new AddEmployee();

		addEmployee.addEmployee(new Employee(1, "Rob", "chennai"));
		addEmployee.addEmployee(new Employee(2, "Sandy", "Banglore"));

		int searchId = 2;
		Employee foundEmployee = addEmployee.getEmployee(searchId);
		if (foundEmployee != null) {
			System.out.println("Employee found: " + foundEmployee);
		} else {
			System.out.println("Employee with ID " + searchId + " not found.");
		}

	}

}
