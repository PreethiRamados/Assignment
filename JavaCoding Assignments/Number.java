package javaCodingExercise;

public class Number {
	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	static boolean isPalindrome(String word) {
		String revWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			revWord += word.charAt(i);
		}
		if (word.equals(revWord)) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isArmstrong(int num1) {
		int digit = 0, temp, sum = 0;
		temp = num1;
		while (temp > 0) {
			temp = temp / 10;
			digit++; // to find the digit
		}
		System.out.println("Number of digits:" + digit);
		temp = num1;
		while (temp > 0) {
			int lastDigit = temp % 10;
			sum += (int) Math.pow(lastDigit, digit);
			temp = temp / 10;
		}
		if (sum == num1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// question1->Prime
		int numberToCheck = 12;
		if (isPrime(numberToCheck)) {
			System.out.println(numberToCheck + " is Prime");
		} else {
			System.out.println(numberToCheck + " is Not a Prime");
		}
		System.out.println("********************");

		// question3->Palindrome
		String strToCheck = "madam";
		if (isPalindrome(strToCheck)) {
			System.out.println(strToCheck + " is palindrome");
		} else {
			System.out.println(strToCheck + " is not palindrome");
		}
		System.out.println("********************");
		// questio2-> Armstrong
		int number = 123;
		if (isArmstrong(number)) {
			System.out.println(number + " is an armstrong");
		} else {
			System.out.println(number + " is not an armstrong");
		}
	}
}
