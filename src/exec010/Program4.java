package exec010;

import java.security.SecureRandom;

public class Program4 {

	public static void main(String[] args) {
		int[][] mat = new int[10][10];

		
		int higherL5 = 0;
		int higherC7= 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = new SecureRandom().nextInt(10);
				System.out.printf("%d ", mat[i][j]);
				if (mat[5][j] > higherL5) {
					higherL5 = mat[5][j];
				}
				if (mat[i][7] > higherC7) {
					higherC7 = mat[i][7];
				}
				
				
			}
			System.out.println();
		}
		System.out.printf("%nBiggest value Line 5: %d", higherL5);
		System.out.printf("%nBiggest value Column 7: %d", higherC7);
		
		

	}

}
