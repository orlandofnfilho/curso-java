package exec015;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exec015.entities.Company;
import exec015.entities.Individual;
import exec015.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data: \n", i);
			System.out.print("Individual or company (i/c)? ");
			char op = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			sc.nextLine();
			if (op == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				sc.nextLine();
				list.add(new Individual(name, income, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				sc.nextLine();
				list.add(new Company(name, income, numberOfEmployees));
			}

		}

		System.out.println();
		System.out.println("TAXES PAID: ");

		double total = 0;
		for (TaxPayer payers : list) {
			total += payers.tax();
			System.out.printf("%s: $ %.2f\n", payers.getName(), payers.tax());
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", total);

		sc.close();

	}

}
