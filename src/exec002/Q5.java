package exec002;

import java.util.Locale;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		double qtd = sc.nextDouble();
		double valor =0;

		if (cod == 1)
			valor = 4.00;
		if (cod == 2)
			valor = 4.50;
		if (cod == 3)
			valor = 5.00;
		if (cod == 4)
			valor = 2.00;
		if (cod == 5)
			valor = 1.50;

		double total = qtd * valor;

		System.out.printf("Total: %.2f", total);

		sc.close();

	}

}
