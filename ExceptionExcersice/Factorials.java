package exceptionExercise;
import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String keepGoing="y";
		try {
		if(keepGoing.equals("y") || keepGoing.equals("Y")) {
			System.out.println("enter an integer");
			int val=sc.nextInt();
			System.out.println("factorial of "+val+"is:" +MathUtils.Factorial(val));
			System.out.println("Another factorial (y/n)");
			keepGoing=sc.next();
		}
		}catch(IllegalArgumentException ie){
			System.out.println(ie);
		}

	}

}
