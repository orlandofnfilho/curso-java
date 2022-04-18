package exec004;

import java.util.Locale;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		if (x >= 1 && x <= 1000) {

			for (int i = 1; i <= x; i++) {

				if(i % 2 !=0) {
					System.out.println(i);
				}
			
			}

		} else {
			System.out.println("valor invalido");
		}
		
		sc.close();
	}

}
