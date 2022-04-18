package exec018.entities;

public class Product {

	private String name;
	private double unitPrice;
	private Integer qdt;

	public Product() {

	}

	public Product(String name, double unitPrice, Integer qdt) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.qdt = qdt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQdt() {
		return qdt;
	}

	public void setQdt(Integer qdt) {
		this.qdt = qdt;
	}

	public double calcTotal() {
		return unitPrice * qdt;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", unitPrice=" + unitPrice + ", qdt=" + qdt + "]";
	}

}
