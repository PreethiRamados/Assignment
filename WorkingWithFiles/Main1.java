package files;
import java.util.Map;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("Question 3 : ");
		//3
		String filePath = "D:\\country,capital.csv";
	    Map<String, String> countryCapitalMap = CountryMap.loadCsvFileToMap(filePath);
	    char startsWith = 'M'; // no country name start with s actually
	    String outputFile = "D:\\filtered_countries.txt";
	    CountryMap.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
	    System.out.println("Filtered countries have been written to the file.");
	}
 
}
