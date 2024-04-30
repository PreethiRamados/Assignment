package question12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		List<Items> list = new ArrayList<>();
		while (true) {
			String line = scanner.nextLine();
			if (line.isEmpty()) {
				break;
			}

			String[] details = line.split(" ");
			String name = details[0];
			double price = Double.parseDouble(details[1]);
			int quantity = Integer.parseInt(details[2]);

			list.add(new Items(name, price, quantity));
		}

		
		double totalPrice = 0;
		for (Items item : list) {
			totalPrice += item.getTotalCost();
		}

		
		double discount = 0;
		if (totalPrice > 100) {
			discount = 0.10 * totalPrice;
		}

		
		System.out.println("Items:");
		for (Items item : list) {
			System.out.println("  " + item + " - $" + String.format("%.2f", item.getTotalCost()));
		}
		System.out.println("Total Price: $" + String.format("%.2f", totalPrice));
		System.out.println("Discount (10%): $" + String.format("%.2f", discount));
		System.out.println("Final Price: $" + String.format("%.2f", totalPrice - discount));
	}
}