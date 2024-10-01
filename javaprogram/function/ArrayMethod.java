package function;
import java.util.*;
// Passing array values to the method
public class ArrayMethod {
	static void min(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("The minimum value is: "+min);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		min(a);
		sc.close();
	}

}
