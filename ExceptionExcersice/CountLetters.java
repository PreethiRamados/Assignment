package exceptionExercise;
import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		int[] counts= new int[26];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a single word:");
		String word= sc.nextLine();
		word= word.toUpperCase();
		for(int i=0;i<word.length();i++) {
			counts[word.charAt(i)-'A']++;
//			System.out.println(c);
		}
		System.out.println();
		for(int i=0;i<counts.length;i++) {
			if(counts[i]!=0) {
				System.out.println((char)(i+'A')+":"+counts[i]);
			}
		}

}
}
