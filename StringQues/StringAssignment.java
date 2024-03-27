package dayFive;

public class StringAssignment {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb.capacity());
		
		System.out.println("************************");
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.indexOf("b"));
		
		System.out.println("************************");
		String sb1="Was it a car or a cat I saw?";
		System.out.println(sb1.substring(9,12));
		
		
		System.out.println("************************");
		String original = "software";
		StringBuffer result = new StringBuffer("hi");
		int index = original.indexOf('a');//5
		
		result.setCharAt(0, original.charAt(0));//si
		System.out.println(result);
		result.setCharAt(1, original.charAt(original.length()-1));//se
		System.out.println(result);
		result.insert(1, original.charAt(4));//swe
		System.out.println(result);
		result.append(original.substring(1,4));//sweoft
		System.out.println(result);
		result.insert(3, (original.substring(index, index+2) + " "));//swear oft
		System.out.println(result);
		
		System.out.println("************************");
		String hi="Hi,";
		String mom="Mom";
		System.out.println(hi.concat(mom));
		
		System.out.println("************************");
		String name="Ms R.Preethi";
		System.out.println(name.substring(0,name.indexOf(" ")));
		
		//anagram
		System.out.println("************************");
		String a="parliament";
		String b="partial men,";
		char[] c= a.toCharArray();
//		if() {
//			
//		
//			
//		}
//		
//		else {
//			System.out.println("not valid");
//		}

}
}
