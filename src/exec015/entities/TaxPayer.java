package exec015.entities;

public abstract class TaxPayer {
	private String name;
	private Double anualIncome;

	public TaxPayer() {

	}

	public TaxPayer(String name, Double anualIncome) {
		this.setName(name);
		this.setAnualIncome(anualIncome);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract Double tax();

}
