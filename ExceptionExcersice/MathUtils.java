package exceptionExercise;

public class MathUtils {
	public static int Factorial(int n) {
		int fact = 1;
		for (int i = 1; i<=n; i++) {
			fact *= i;
		}
		return fact;
	}

}
