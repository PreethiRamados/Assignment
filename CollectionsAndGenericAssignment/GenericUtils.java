package collectionsAndGenericAssignment;

import java.util.Arrays;

public class GenericUtils {
	public static <T> T[] swap(T[] list, int firstPos, int fourthPos) {
			if (firstPos < 0 || firstPos >= list.length || fourthPos < 0 || fourthPos >= list.length) {
				throw new IndexOutOfBoundsException("Invalid index. Ensure both positions are within bounds.");
			}

			T temp = list[firstPos];
			list[firstPos] = list[fourthPos];
			list[fourthPos] = temp;

			return list;
		}

		public static void main(String[] args) {
			Integer[] intArray = { 1, 2, 3, 4, 5 };
			System.out.println("Original array: " + Arrays.toString(intArray));

			swap(intArray, 1, 3);
			System.out.println("Swapped array: " + Arrays.toString(intArray));
		}

}
