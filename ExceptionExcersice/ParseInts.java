package exceptionExercise;

import java.util.Scanner;

public class ParseInts {

	public static void main(String[] args) {
		int val, sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a line input");
		Scanner scanline = new Scanner(sc.nextLine());


		while (scanline.hasNext()) {
			try {
				val = Integer.parseInt(scanline.next());
				sum += val;
		} catch (NumberFormatException nfe) {

		}
		}
		System.out.println("the sum of the integer of this line is:" +sum);

	}

}
