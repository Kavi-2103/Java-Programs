package function;

class Oneone{
	public void printOne() {
		System.out.println("Print one");
	}
}
class Twotwo extends Oneone{
	public void printTwo() {
		System.out.println("Print Two");
	}
}
public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twotwo t=new Twotwo();
        t.printOne();
        t.printTwo();
	}

}
