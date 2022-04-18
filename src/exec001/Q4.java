package exec001;

import java.util.Locale;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int id;
		double horas, valorHora, salario;

		id = sc.nextInt();
		horas = sc.nextDouble();
		valorHora = sc.nextDouble();
		salario = horas * valorHora;

		System.out.printf("NUMBER = %d\n", id);
		System.out.printf("SALARY = U$ %.2f", salario);

		sc.close();

	}

}
