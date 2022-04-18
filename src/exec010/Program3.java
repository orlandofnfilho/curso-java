package exec010;

import java.security.SecureRandom;

public class Program3 {

	public static void main(String[] args) {

		int[][] mat = new int[4][4];

		int higher = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = new SecureRandom().nextInt(10);
				System.out.printf("%d ", mat[i][j]);
				if (mat[i][j] > higher) {
					higher = mat[i][j];
				}

			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Biggest: " + higher);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == higher) {
					System.out.printf("Position: %d,%d%n", i, j);
				}

			}

		}

	}

}
