package function;

public class Salary extends EmployeeGetSet{
	private double salary; //Annual Salary
	public Salary(String name,String address,int num,double salary) {
		super(name,address,num);
		setSalary(salary);
	}
	public void mailCheck() {
		System.out.println("Within mailcheck of salary class ");
		System.out.println("Mailig check to to "+getName()+" with salary "+salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary){
		if(newSalary >=0.0) {
			salary=newSalary;
		}
	}
	public double computePay() {
		System.out.println("Computing salary pay for "+getName());
		return salary/52;
	}
	public static void main(String[] args) {
		Salary s=new Salary("Kavi","Chennai",21,50000);
		s.mailCheck();
	}
}
