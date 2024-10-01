package function;

interface One{
	public void printOne();
}
interface Two{
	public void printTwo();
}
interface Three extends One,Two{
	public void printThree();
}

class Child implements Three{
	@Override
	public void printOne() {
		System.out.println("Print One");	
	}
	public void printTwo() {
		System.out.println("Print Two");	
	}
	public void printThree() {
		System.out.println("Print Three");	
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.printOne();
		c.printTwo();
		c.printThree();

	}

}
