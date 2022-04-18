package cap038;

import java.util.Locale;
import java.util.Scanner;

public class OpCumulativo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double minutos = sc.nextDouble();
		double valor;
		if (minutos <= 100) {
			valor = 50;
			System.out.printf("Valor a pagar: R$ %.2f", valor);
		} else {
			valor = ((minutos - 100) * 2) + 50;

			System.out.printf("Valor a pagar R$ %.2f", valor);
		}

		sc.close();
	}

}
