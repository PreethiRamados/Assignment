package cja;

public class Integer {
	public static void main(String[] args) {
		int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetInteger = 5;
        IntegerListener listener = new IntegerListener();
        IntegerFinder finder = new IntegerFinder(listener);
        finder.findIntegers(inputArray, targetInteger);
 
	}

}
