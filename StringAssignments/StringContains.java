package StringAssignment;
import java.util.Scanner;
public class StringContains {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter a input: ");
			 String str = s.nextLine();
			
		            if (containsOnlyDigits(str)) {
		                System.out.println("It contains digit only");
		            } else if (containsOnlyLetters(str)) {
		                System.out.println("It contains string only");
		            } else {
		                System.out.println("It contains string as well as Digits");
		            }
		        }
		    public static boolean containsOnlyDigits(String str) {
		    	//+ refers to preceding elements -->([0-9] character class)
		        return str.matches("[0-9]+");
		    }
		
		    public static boolean containsOnlyLetters(String str) {
		        return str.matches("[a-zA-Z]+");
		   }

}
