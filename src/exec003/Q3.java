package exec003;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int combu = 0;
		int alcool = 0, gasolina = 0, diesel = 0;
		while (combu != 4) {
			combu = sc.nextInt();

			if (combu == 1) {
				alcool++;
			} else if (combu == 2) {
				gasolina++;
			} else if (combu == 3) {
				diesel++;
			}

		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);

		sc.close();
	}

}
