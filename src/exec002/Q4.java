package exec002;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();

		int res = (horaFinal + 24) - horaInicial;
		System.out.printf("O JOGO DUROU %d HORA(S)", res);

		sc.close();
	}

}
