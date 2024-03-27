package cja;

public class Search {
	public static void main(String[] args) {
        IntegerSearch integerSearch = new IntegerSearch();
        StringSearch stringSearch = new StringSearch();
 
        Object[] integerArray = {1, 2, 3, 4, 5};
        Object[] stringArray = {"apple", "banana", "orange"};
 
        int searchInt = 3;
        String searchString = "chiku";
 
        System.out.println("Searching for integer " + searchInt + ": " + integerSearch.search(integerArray, searchInt));
        System.out.println("Searching for string '" + searchString + "': " + stringSearch.search(stringArray, searchString));
    }

}
