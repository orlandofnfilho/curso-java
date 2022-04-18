package exec006;

import java.util.Locale;
import java.util.Scanner;

import exec006.entities.CurrencyConverter;

public class Q1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What's the dollar price? ");
		CurrencyConverter.dollar = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		CurrencyConverter.x = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(CurrencyConverter.x));

		sc.close();

	}

}
