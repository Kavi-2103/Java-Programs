package function;
public abstract class EmployeeGetSet{
	private String name;
	private String address;
	private int num;
	public EmployeeGetSet(String name,String address,int num) {
		System.out.println("Constructing an Employee");
		this.name=name;
		this.address=address;
		this.num=num;
	}
	public double computePay() {
		System.out.println("Employee Computepay");
		return 0.0;
	}
	public void mailCheck() {
		System.out.println("Mailing a check to "+this.name+" "+this.address);
	}
	public String toString() {
		return name+" "+address+" "+num;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getNumber() {
		return num;
	}
}
