package exec003;

import java.util.Locale;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2);

		if (media < 60) {
			System.out.printf("NOTA FINAL = %.2f%n", media);
			System.out.println("REPROVADO");
		} else {
			System.out.printf("NOTA FINAL = %.2f\n", media);
		}

		sc.close();

	}

}
