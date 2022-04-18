package cap027;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String s1;
		String s2;
		String s3;

		System.out.println("Digite as entradas: ");
		x = sc.nextInt();
		sc.nextLine(); // Precisa add porque o next consome a linha vazia na proxima entrada nextLine.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
		
		
	}

}
