package StringAssignment;

public class ReverseStringIteration {

	public static void main(String[] args) {
		String a="Happy";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b+=(a.charAt(i));
		}
      System.out.println(b);

	}

}
