package exec001;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a += b;
		System.out.printf("SOMA = %d", a);

		sc.close();

	}

}
