package question14;

import java.util.List;

public class Utility {
	public static void main(String[] args) {
		List<String> cities = List.of("Chennai", "Siberia", "Sydney", "Tokyo");
		System.out.println("The city with letter S");
		cities.stream().filter(city -> city.startsWith("S")).map(String::toUpperCase).forEach(System.out::println);
	}

}
