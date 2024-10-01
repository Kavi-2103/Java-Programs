package function;

public class PrivateConstructor {
	//declare private data field
	private String name;
	private int age;
	private String dept;
	//used this for accessing current objects
	private PrivateConstructor(String name,int age,String dept){
		//this will refer current object of the class
		this.name=name;
		this.age=age;
		this.dept=dept;
	}

	public static PrivateConstructor createEmployee(String name,int age,String dept) {
		return new PrivateConstructor(name,age,dept);
	}
	public static void main(String[] args) {
		// create employee objects using the factory method
		PrivateConstructor emp1=PrivateConstructor.createEmployee("John",25,"Sales");
		PrivateConstructor emp2=PrivateConstructor.createEmployee("Joe",23,"Design");
		
		//Access and print employee info
		System.out.println("Employee-1 Name: "+emp1.name+", Age: "+emp1.age+", Department: "+emp1.dept);
		System.out.println("Employee-2 Name: "+emp2.name+", Age: "+emp2.age+", Department: "+emp2.dept);
	}

}
