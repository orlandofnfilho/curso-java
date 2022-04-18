package cap065.entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInSotck() {

		double total = price * quantity;

		return total;
	}

	public void addProducts(int quantity) {
		this.quantity = this.quantity + quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity = this.quantity - quantity;
	}

	public String toString() {

		return name + ", $" 
			   + String.format("%.2f", price)
			   + ", " 
			   + quantity
			   + " units, total: $" 
			   + String.format("%.2f", totalValueInSotck());
	}

}
