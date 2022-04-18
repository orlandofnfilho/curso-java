package exec017;

import java.util.Scanner;

import exec017.entities.Contato;
import exec017.exceptions.ContatoNaoExisteException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			Contato contato1 = new Contato(001, "Orlando", "(81) 988967221");

			contato1.consultar(001);
		} catch (ContatoNaoExisteException e) {
			System.out.println("Error: " + e.getMessage());

		}

		sc.close();
	}

}
