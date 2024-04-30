package question12;

import java.util.Scanner;

public class Items {
	private String name;
	private double price;
	private int quantity;

	public Items(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double getTotalCost() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return name + " (" + quantity + " x $" + String.format("%.2f", price) + ")";
	}
}
