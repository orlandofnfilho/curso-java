package exec014.entities;

public class ImportedProduct extends Product {

	private double customFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(double customFee) {
		this.customFee = customFee;
	}

	public double totalPrice() {

		return getPrice() + customFee;

	}

	@Override
	public String priceTag() {
		return String.format("%s $%.2f (Custom fee: $%.2f)", getName(), totalPrice(), customFee);
	}

}
