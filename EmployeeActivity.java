package nohello;

public class EmployeeActivity extends Person {
	int employeeNumber;
	double monthlySalary;
	// constructor
	public EmployeeActivity() {
		super("YEES",23);
		employeeNumber = 3;
		monthlySalary = 300.0;
	}
	public EmployeeActivity(int e) {
		super("YEES",23);
		employeeNumber = e;
		monthlySalary = 300;
	}
	public EmployeeActivity(int e, double m) {
		super("YEES",23);
		employeeNumber = e;
		monthlySalary = m;
	}
	// set method
	public void setEmployeeNumber(int e) {
		employeeNumber = e;
	}
	public void setMonthlySalary(int s) {
		monthlySalary = s;
	}
	// get method
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	// show Activity
	public void showActivity() {
		System.out.println(monthlySalary);
	}
	// toString
	public String toString() {
		return super.toString() + "Employee Number = "+getEmployeeNumber()
				+ " MonthlySalary = "+ getMonthlySalary();
	}
}
