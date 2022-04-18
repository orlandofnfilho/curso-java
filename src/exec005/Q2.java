package exec005;

import java.util.Locale;
import java.util.Scanner;

import exec005.entties.Employee;

public class Q2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		double percentage;
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		System.out.print("Updated data: " + employee);

		sc.close();

	}

}
