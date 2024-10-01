package function;

public class NormalMethod {
	static int a=20;
	int b=10;
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	static void staticDisplay() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalMethod nm=new NormalMethod();
		nm.display();
		staticDisplay();
	}

}
