package Programs;
import java.util.*;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("The value of int is "+n);
        System.out.println("Enter the string ");
        String s=sc.nextLine();
        System.out.println("The value of string is "+s);
        
	}

}
