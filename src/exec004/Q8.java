package exec004;

import java.util.Locale;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				System.out.printf("%d%n", i);
			}
		}

		sc.close();
	}

}
