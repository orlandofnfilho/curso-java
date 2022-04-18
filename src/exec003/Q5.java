package exec003;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int menor = num1;

		if (num1 < num2) {
			if (num1 < num3) {
				menor = num1;
			}
		} else if (num2 < num3) {
			menor = num2;
		} else {
			menor = num3;
		}

		System.out.printf("MENOR: %d%n", menor);

		sc.close();

	}

}
