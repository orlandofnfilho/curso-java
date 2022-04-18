package exec004;

import java.util.Locale;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int fat = 1;

		if (n != 0) {
			for (int i = 1; i <= n; i++) {

				fat = fat * i;

			}
		}

		System.out.println(fat);

		sc.close();
	}

}
