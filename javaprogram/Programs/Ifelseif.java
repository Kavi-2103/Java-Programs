package Programs;

public class Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=50;
		if(marks>80 && marks<=100) {
			System.out.println("You got A grade");
		}
		else if(marks>60 && marks<=80) {
			System.out.println("You got B grade");
		}
		else if(marks>50 && marks<=60) {
			System.out.println("You got C grade");
		}
		else if(marks>40 && marks<=50) {
			System.out.println("You got D grade");
		}
		else if(marks>=1 && marks<=40) {
			System.out.println("You have failed");
		}
		else
			System.out.println("Please enter correct marks");
	}

}
