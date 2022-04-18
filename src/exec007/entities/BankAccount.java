package exec007.entities;

public class BankAccount {

	private String accNumber;
	private String accHolder;
	private double accBalance = 0;

	public BankAccount() {

	}

	public BankAccount(String accNumber, String accHolder, double accBalance) {
		super();
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		this.accBalance = accBalance;
	}

	public BankAccount(String accNumber, String accHolder) {
		super();
		this.accNumber = accNumber;
		this.accHolder = accHolder;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void deposit(double value) {

		this.accBalance = getAccBalance() + value;

	}

	public void withdraw(double value) {
		this.accBalance = (getAccBalance() - value) - 5;
	}

	public String toString() {
		return "Account " + getAccNumber() + ", Holder: " + getAccHolder() + ", Balance: "
				+ String.format("$ %.2f%n", getAccBalance());
	}

}
