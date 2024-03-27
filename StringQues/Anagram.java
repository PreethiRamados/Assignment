package dayFive;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		String s1="parliament";
		String s2="partial men,";
		boolean result = areAnagram(s1,s2);
        if (result) {
            System.out.println("The strings are anagram.");
        } else {
            System.out.println("The strings are not anagram.");
        }
    }
 
    public static boolean areAnagram(String s1, String s2) {
        // Remove white space and punctuation from both strings
        String s1Clean = s1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s2Clean = s2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
 
        // Check if the sorted characters of both cleaned strings match
        char[] ch1 = s1Clean.toCharArray();
        char[] ch2 = s2Clean.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
 
        return Arrays.equals(ch1, ch2);
    }

}
