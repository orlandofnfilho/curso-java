package exec003;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();
		while (senha != 2002) {
			sc.nextLine();
			System.out.println("Senha Inválida");
			senha = sc.nextInt();
		}

		System.out.println("Acesso Permitido");
		sc.close();

	}

}
