package exec004;

import java.util.Locale;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 0;
		int n = sc.nextInt();
		int in = 0, out = 0;
		for (int i = 1; i <= n; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}

		}

		System.out.printf("%d in%n", in);
		System.out.printf("%d out", out);

		sc.close();
	}

}
