package question13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class LogProcessor {

	public static void main(String[] args) {
		String filename = "Prodapt/logs.txt";

		try (Stream<String> lines = Files.lines(Path.of(filename))) {
			lines.filter(line -> !line.contains("error")).forEach(System.out::println);
		} catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		}
	}
}