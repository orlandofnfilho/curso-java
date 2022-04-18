package exec004;

import java.util.Locale;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int res = 0;

		if (n >= 2 && n <= 1000) {
			for (int i = 1; i <= 10; i++) {
				res = i * n;

				System.out.printf("%d x %d = %d%n", i, n, res);
			}

		} else {
			System.out.println("Valor inválido");
		}

		sc.close();
	}

}
