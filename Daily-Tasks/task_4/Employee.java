package task_4;

public class Employee {
	String name,jobTitle;
	double salary;
	
	public Employee(String name,String jobTitle,double salary) {
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	double calculateSalary(double percentage) {
		double increase = salary * (percentage / 100);
        salary += increase;
        return salary;
	}
	public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Dhivya","Assistant Manager",25000);
		System.out.println("Employee Details");
		emp.displayDetails();
		double newSalary = emp.calculateSalary(8.5);
		 System.out.println("New Salary: " + newSalary);
	}

}
