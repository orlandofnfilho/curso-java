package exec001;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c, d, res;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		res = (a * b - c * d);

		System.out.printf("DIFERENCA = %d", res);
		sc.close();

	}

}
