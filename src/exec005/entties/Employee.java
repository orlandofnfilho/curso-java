package exec005.entties;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {

		grossSalary = grossSalary + ((grossSalary * 10) / 100);

	}

	public String toString() {
		return String.format("%s, $ %.2f%n", name, netSalary());
	}

}
