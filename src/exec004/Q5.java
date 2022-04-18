package exec004;

import java.util.Locale;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double mp = 0;
		for (int i = 0; i < n; i++) {

			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			mp = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
			System.out.printf("%.1f%n", mp);
		}

		sc.close();

	}

}
