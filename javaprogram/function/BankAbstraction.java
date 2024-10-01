package function;
abstract class Bank{
	abstract int getRateofInterest();
}
class SBI extends Bank{
	int getRateofInterest() //method overriding
	{
		return 7;
	}
}
class PNB extends Bank{
	int getRateofInterest() //method overriding
	{
		return 8;
	}
}
public class BankAbstraction {

	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		System.out.println("Rate of Interest(SBI) is: "+b.getRateofInterest()+"%");
		b=new PNB();
		System.out.println("Rate of Interest(PNB) is: "+b.getRateofInterest()+"%");
	}

}
