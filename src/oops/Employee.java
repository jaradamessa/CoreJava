package oops;

public class Employee {

	String name;
	int empId;
	private int Salary;

	public void Display() {

		System.out.println("Name of the employee " + name);
		System.out.println("Id of the employee " + empId);
	}

	public void SelSalary(int sal) {

		this.Salary = sal;

	}

	public Employee() {
		System.out.println("Inside default cons");
	}

	public Employee(String Name1, int EmpId1, int Salary1) {

		this.name = Name1;
		this.empId = EmpId1;
		this.Salary = Salary1;

	}

}
