package function;
import java.util.*;
public class InsertElementArray {
	public static int[] insertElement(int n,int arr[],int ele,int pos) {
		int i;
		int newarr[]=new int[n+1];
		//insert elements from old to new array
		for(i=0;i<n+1;i++) {
			if(i<pos-1) // check till the positio of the array
			{
				newarr[i]=arr[i]; //insert all elements at specific position
			}
			else if(i==pos-1) 
				newarr[i]=ele; //add element to the array
			else
				newarr[i]=arr[i-1];
		}
		return newarr;
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
		System.out.println("Enter the element to be added: ");
		int ele=sc.nextInt();
		System.out.println("Enter the position of the new element: ");
		int pos=sc.nextInt();
		a=insertElement(n,a,ele,pos);
		System.out.println("New Array after insertion of new element"+"\n"+Arrays.toString(a));
		sc.close();
	}

}
