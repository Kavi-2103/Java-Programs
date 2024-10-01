package function;
class One1{
	public void printOne() {
		System.out.println("Print one");
	}
}
class Two2 extends One1{
	public void printTwo() {
		System.out.println("Print Two");
	}
}
class Three3 extends Two2{
	public void printThree() {
		System.out.println("Print Three");
	}
}
public class MutilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three3 th=new Three3();
		th.printOne();
		th.printTwo();
		th.printThree();
	}

}
