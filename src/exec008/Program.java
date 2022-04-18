package exec008;

import java.util.Scanner;

import exec008.entities.Room;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Room[] vect = new Room[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.println();

		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.printf("Rent #%d%n", i);
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int number = sc.nextInt();
			vect[number] = new Room(number, name, email);
			System.out.println();
			sc.nextLine();

		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].toString());
			}

		}
		sc.close();

	}

}
