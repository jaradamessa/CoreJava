package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.name = "Ramya";
		emp1.empId = 100;
		emp1.SelSalary(98000);

		Employee emp2 = new Employee();
		emp2.name = "Subashini";
		emp2.empId = 101;
		emp2.SelSalary(100000);

		Employee emp3 = new Employee("Rahul ", 105, 90000);

		System.out.println("====================================");

		emp1.Display();
		System.out.println("====================================");

		emp2.Display();
		System.out.println("====================================");
		emp3.Display();

		DiscoverBank obj1 = new DiscoverBank();
		obj1.Acctn = 125603;
		obj1.BankId = 3893;
	}

}
