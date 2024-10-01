package task_5;
abstract class Shape{
	abstract double calculateArea();
	abstract double calculatePerimeter();
}

class Circle extends Shape{
	private double radius;
	private double pi=3.14;
	public Circle(double radius) {
		this.radius=radius;
	}
	double calculateArea() {
		return pi*radius*radius;
	}
	double calculatePerimeter() {
		return 2*pi*radius;
	}
}
class Triangle extends Shape{
	private double side1,side2,side3;
	public Triangle(double side1,double side2,double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	double calculateArea() {
		double s=(side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	double calculatePerimeter() {
		return side1+side2+side3;
	}
}
public class AreaRectangle {

	public static void main(String[] args) {
		Shape circle=new Circle(5);
		System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Perimeter of circle: " + circle.calculatePerimeter());
		Shape triangle=new Triangle(2,3,3);
		System.out.println("Area of triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of triangle: " + triangle.calculatePerimeter());
	}

}
