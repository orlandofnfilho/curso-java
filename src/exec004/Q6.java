package exec004;

import java.util.Locale;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double a = sc.nextInt();
			double b = sc.nextInt();

			if (b == 0) {
				System.out.println("divisao impossivel");
			} else {

				a = a / b;

				System.out.printf("%.1f%n", a);

			}
		}

		sc.close();

	}

}
