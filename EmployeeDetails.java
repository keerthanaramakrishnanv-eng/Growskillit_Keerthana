package assignmentGrowSillIT;

class Employee {
	String empName;
	int empId;
	static int employeeCount = 0;
	static String companyName = "TechNova Pvt Ltd";
	final int joiningYear;
	final double baseSalary;

	public Employee() {
		this.empName = "Unknown";
		this.joiningYear = 0;
		this.empId = 0;
		this.baseSalary = 0;
		employeeCount++;
	}

	public Employee(String empName, int empId) {
		super();
		this.joiningYear = 2012;
		this.empName = empName;
		this.empId = empId;
		this.baseSalary = 5000;
		employeeCount++;
	}

	double calculateSalary() {
		return baseSalary;

	}

	void displayDetails() {
		System.out.println("Employee Name:" + " " + empName + "| EmployeeId:" + " " + empId + "| Joining Year:" + " "
				+ joiningYear + "| CompanyName:" + " " + companyName + "| Salary" + " " + calculateSalary());
	}

}

class Developer extends Employee {
	double bonus;

	public Developer(String empName, int empId) {
		super(empName, empId);
	}

	public Developer(String empName, int empId, double bonus) {
		super(empName, empId);
		this.bonus = bonus;
	}

	@Override
	double calculateSalary() {
		return baseSalary + bonus;

	}

	void displayDetails() {
		super.displayDetails();
	}

}

class Manager extends Employee {
	double allowance;

	public Manager(String empName, int empId) {
		super(empName, empId);

	}

	public Manager(String empName, int empId, double allowance) {
		super(empName, empId);
		this.allowance = allowance;
	}

	@Override
	double calculateSalary() {
		return baseSalary + allowance;

	}

	void displayDetails() {
		super.displayDetails();
	}
}

public class EmployeeDetails {

	public static void main(String[] args) {

		/*
		 * 1. Create at least: o 2 Developers (one using each constructor) o 2 Managers
		 * (one using each constructor)
		 */

		Developer devobj = new Developer("Keerthana", 102);
		Developer devobj1 = new Developer("Karthik", 101, 700.00);

		Manager managerobj = new Manager("Thanvika", 104);
		Manager managerobj1 = new Manager("Ayush", 115, 1000.00);

		// Print Details
		devobj.displayDetails();
		devobj1.displayDetails();
		managerobj.displayDetails();
		managerobj1.displayDetails();

		// Print total employee count
		System.out.println("Employee count:" + " " + Employee.employeeCount);

	}

}
