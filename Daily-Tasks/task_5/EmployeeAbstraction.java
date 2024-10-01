package task_5;
abstract class Employee{
	String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }
	abstract double calculateSalary();
	abstract void displayInfo();
}
class Manager extends Employee{
	private double salary;
	private double bonus;
	public Manager(String name,int empid,double salary,double bonus) {
		super(name,empid);
		this.salary=salary;
		this.bonus=bonus;
	}
	double calculateSalary() {
		return salary+bonus;
	}
	void displayInfo() {
		System.out.println("Manager Information:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + calculateSalary());
	}
}
class Programmer extends Employee{
	private double salary;
	private double OTtime,OTamt;
	public Programmer(String name,int empid,double salary,double OTtime,double OTamt) {
		super(name,empid);
		this.salary=salary;
		this.OTtime=OTtime;
		this.OTamt=OTamt;
	}
	double calculateSalary() {
		double sal=salary+(OTtime*OTamt);
		return sal;
	}
	void displayInfo() {
		System.out.println("Programmer Information:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + calculateSalary());
	}
}
public class EmployeeAbstraction {

	public static void main(String[] args) {
		Employee manager=new Manager("Aravind",001,50000,10000);
		Employee programmer=new Programmer("Sathya",002,20000,20,300);
		manager.displayInfo();
		programmer.displayInfo();

	}

}
