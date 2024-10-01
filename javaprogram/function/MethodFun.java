package function;
import java.util.*;
public class MethodFun {
	//using static method we should create object
	private int getSquare(int n) {
		return n*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			//direct method call
//		 int result=getSquare(i);
//			System.out.println("Square of "+i+" is "+result );
			MethodFun mf=new MethodFun();
			System.out.println(mf.getSquare(i));
		}
		//method call using object
		sc.close();
	}

}
