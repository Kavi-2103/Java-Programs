package function;
import java.util.*;
public class Sum_Array {

	public static void main(String[] args) {
		int n,sum=0;
		float average;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum of "+n+" elements is: "+sum);
		average=(float)sum/n;   //type casting
		System.out.println("Average of "+n+" elements is: "+average);
		
		sc.close();
	}

}
