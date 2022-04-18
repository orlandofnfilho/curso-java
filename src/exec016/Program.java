package exec016;

import java.util.Locale;
import java.util.Scanner;

import cap168.exceptions.DomainException;
import exec016.entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();
			sc.nextLine();

			Account acc = new Account(number, holder, balance, limit);

			System.out.println();
			System.out.printf("Enter the amount for withdraw: ");
			double amount = sc.nextDouble();

			acc.withdraw(amount);

			System.out.printf("New Balance: %.2f", acc.getBalance());

		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Invalid entry");
		}

		sc.close();

	}

}
