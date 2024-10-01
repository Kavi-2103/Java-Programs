package task_4;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public double calculateArea() {
        return width * height;
    }
	public double calculatePerimeter() {
        return 2 * (width + height);
    }
	void displayDetails() {
		System.out.println("Width is: "+width);
		System.out.println("Height is: "+height);
		System.out.println("Area is: "+calculateArea());
		System.out.println("Perimeter is: "+calculatePerimeter());
		
//		System.out.println("Area is: "+width*height);
//        System.out.println("Perimeter is: "+(2*(width+height)));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(5,3);
		System.out.println("Rectangle Details");
		r.displayDetails();
	}

}
