package task_3;

public class Dog {
	String name,color;
	
	public Dog(String name,String color) {
		this.name=name;
		this.color=color;
		System.out.println("Dog Name and Color");
		displayDetails();
	}
	
	void displayDetails() {
		System.out.println("Dog Name is: "+name);
		System.out.println("Dog color is: "+color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dg=new Dog("Labrador","Golden");
		
	}

}
