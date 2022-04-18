package cap157;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Date now = new Date();
		
		try {
			String vect[] = sc.nextLine().split(" ");
			int position = sc.nextInt();

			if (position == 2) {
				throw new RuntimeException("DEU RUIIMMMMMMMM!!!");
			}

			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição não encontrada!");
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
			sc.next();
			
		}

		System.out.println("Fim do programa");
		sc.close();

	}

}
