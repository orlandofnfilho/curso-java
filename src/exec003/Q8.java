package exec003;

import java.util.Locale;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int cont = 0;
		double media = 0;

		if (idade < 0) {
			System.out.println("Impossivel calcular");
		} else {

			media = media + idade;
			while (idade > 0) {
				idade = sc.nextInt();

				if (idade > 0) {
					media = media + idade;
				}

				cont++;

			}

			media = media / cont;

			System.out.printf("%.2f", media);

		}

		sc.close();

	}

}
