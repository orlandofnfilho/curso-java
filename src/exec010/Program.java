package exec010;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mtz = new int[m][n];

		for (int i = 0; i < mtz.length; i++) {
			for (int j = 0; j < mtz[i].length; j++) {
				mtz[i][j] = sc.nextInt();

			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < mtz.length; i++) {
			for (int j = 0; j < mtz[i].length; j++) {
				if (x == mtz[i][j]) {
					System.out.printf("Position: %d,%d%n", i, j);
					if (j - 1 >= 0) {
						System.out.printf("Left: %d%n", mtz[i][j - 1]);
					}
					if (j + 1 < mtz[i].length) {
						System.out.printf("Right: %d%n", mtz[i][j + 1]);
					}
					if (i - 1 >= 0) {
						System.out.printf("Up: %d%n", mtz[i - 1][j]);
					}
					if (i + 1 < mtz.length) {
						System.out.printf("Down: %d%n", mtz[i + 1][j]);
					}
					System.out.println();

				}

			}

		}

		sc.close();

	}

}
