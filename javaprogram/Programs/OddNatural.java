package Programs;
import java.util.*;
public class OddNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=(2*i-1);
		}
		System.out.print(sum);
	}

}
