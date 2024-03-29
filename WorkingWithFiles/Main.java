package files;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		System.out.println("Question2");
	    String filePath = "D:\\country,capital.csv"; // Change to the path of your CSV file
	   Map<String, String> countryCapitalMap = CountryMap.loadCsvFileToMap(filePath);
	   for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
	        System.out.println("Country: " + entry.getKey() + "->"+ "Capital: " + entry.getValue());
	    }
	}
}
