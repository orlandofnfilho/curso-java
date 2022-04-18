package exec002;

import java.util.Locale;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double interval = sc.nextDouble();

		if (interval < 0 || interval > 100) {
			System.out.println("Fora de intervalo");
		} else if (interval <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (interval <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (interval <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (interval <= 100) {
			System.out.println("Intervalo (75,100]");
		}

		sc.close();

	}

}
