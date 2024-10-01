package task_1;
import java.util.*;
public class PrintDetailsWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name="";
		int age=0;
		String address="";
		int pincode=0;
		int n=1;
		while(n==1) {
			System.out.print("Enter your Name: ");
			name=sc.nextLine();
			
			
			System.out.print("Enter your Age: ");
			age=sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter your Address: ");
			address=sc.nextLine();
			
			
			System.out.print("Enter your Pincode: ");
			pincode=sc.nextInt();
			sc.nextLine();
			n++;
			
		}
		
		System.out.println("User Details");
		System.out.println("Your Name is: "+name);
		System.out.println("Your Age is: "+age);
		System.out.println("Your Address is: "+address);
		System.out.println("Your Pincode is: "+pincode);
	}

}
