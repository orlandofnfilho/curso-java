package exec004;

import java.util.Locale;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n > 0) {

			;

			for (int i = 1; i <= n; i++) {

				int quad = (int) Math.pow(i, 2);
				int cubo = (int) Math.pow(i, 3);

				System.out.printf("%d ", i);
				System.out.printf("%d ", quad);
				System.out.printf("%d%n", cubo);

			}

		}

		sc.close();
	}

}
