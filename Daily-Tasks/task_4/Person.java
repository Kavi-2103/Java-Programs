package task_4;

public class Person {
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("Person-1 Details: ");
		printDetails();
	}
    void printDetails() {
    	System.out.println("Name of the person: "+name);
    	System.out.println("Age of the person: "+age);	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("John",25);
		Person p2=new Person("Joe",23);
	}

}
