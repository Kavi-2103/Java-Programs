package function;

class Program{
	  float salary=60000;
	}

public class SingleInheritance extends Program{
	int bonus=10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance si=new SingleInheritance();
        System.out.println("The Salary is: "+si.salary);
        System.out.println("The Bonus is: "+si.bonus);
	}

}
