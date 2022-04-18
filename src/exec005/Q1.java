package exec005;

import java.util.Locale;
import java.util.Scanner;

import exec005.entties.Rectangle;

public class Q1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();
		System.out.println("Enter the rectangle width and heigh: ");
		rectangle.width = sc.nextDouble();
		rectangle.heigh = sc.nextDouble();

		System.out.println(rectangle);

		sc.close();

	}

}
