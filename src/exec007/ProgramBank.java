package exec007;

import java.util.Locale;
import java.util.Scanner;

import exec007.entities.BankAccount;

public class ProgramBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount acc1;
		System.out.print("Enter the account number: ");
		String number = sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		System.out.printf("Is there an intitial deposit (y/n)? ");
		char op = sc.nextLine().charAt(0);
		if (op == 'n') {
			acc1 = new BankAccount(number, holder);
			System.out.println("Account data: ");
			System.out.println(acc1.toString());
			System.out.println();

		} else {
			System.out.printf("Enter initital deposit value: ");
			Double value = sc.nextDouble();
			acc1 = new BankAccount(number, holder, value);
			System.out.println("Account data: ");
			System.out.println(acc1.toString());

		}
		
		System.out.printf("Enter a deposit value: ");
		Double value = sc.nextDouble();
		acc1.deposit(value);
		System.out.println("Updated account data: ");
		System.out.println(acc1.toString());
		System.out.printf("Enter a withdraw value: ");
		value = sc.nextDouble();
		acc1.withdraw(value);
		System.out.println("Updated account data: ");
		System.out.println(acc1.toString());

		sc.close();
	}

}
