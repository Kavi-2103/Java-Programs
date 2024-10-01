package task_3;

public class Employee {
	int empid;
	String name;
	double salary;
	int age;
	String designation;
	
	public Employee(int empid,String name,double salary,int age,String designation) {
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.designation=designation;
	}
	
	void displayDetails() {
		System.out.println("Employee id is: "+empid);
		System.out.println("Employee name is: "+name);
		System.out.println("Employee salary is: "+salary);
		System.out.println("Employee age is: "+age);
		System.out.println("Employee designation is: "+designation);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(001,"John",25000,25,"Sales");
		System.out.println("Eployee Details");
		emp.displayDetails();
	}

}
