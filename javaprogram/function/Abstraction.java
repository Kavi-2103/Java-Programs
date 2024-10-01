package function;

abstract class Shape{
	abstract void draw();  //abstract method
	public void info() {}  // concrete method
}
class Rectangle extends Shape{
	void draw() //method overriding
	{
		System.out.println("Drawing Rectangle");
	}
}
class Circle extends Shape{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	public void info() {
		System.out.println("Info details");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Shape s=new Circle();  // here object is created using abstract class name and have have to use the name of the class we are calling
		Shape s1=new Rectangle();
		s1.draw();
		s.draw();
		s.info();
	}

}
