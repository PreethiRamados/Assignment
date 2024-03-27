package cja;

public class IntegerListener {
	public void onIntegerFound(int num, int index) {
        System.out.println("Integer " + num + " found at index " + index);
    }
}
	class IntegerFinder {
		private IntegerListener Listener;

		public IntegerFinder(IntegerListener listener) {
			Listener = listener;
}
public void findIntegers(int[] inputArray, int target) {
for (int i = 0; i < inputArray.length; i++) {
    if (inputArray[i] == target) {
        Listener.onIntegerFound(target, i);
    }
}
}

}
