package cap026;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s , which price is $ %.2f \n\n", product1, price1);
		System.out.printf("Record: %d years old, code %d and gender: %c\n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f\n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f\n\n", measure);

		System.out.println("Digite o char: ");
		// Capta o char na posi��o "0"
		char x = sc.next().charAt(0);
		String nome;
		int idade;
		System.out.println(x);
		System.out.println("Digite seu nome, idade e o sexo: ");
		nome = sc.next();
		idade = sc.nextInt();
		x = sc.next().charAt(0);
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(x);

		sc.close();

	}

}
