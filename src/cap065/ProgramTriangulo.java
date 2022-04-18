package cap065;

import java.util.Locale;
import java.util.Scanner;

import cap065.entities.Triangulo;

public class ProgramTriangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();

		System.out.println("Enter the measure of triangle X: ");
		x.b = sc.nextDouble();
		x.h = sc.nextDouble();
		System.out.println("Enter the measure of triangle Y: ");
		y.b = sc.nextDouble();
		y.h = sc.nextDouble();

		double areaX = x.calcArea();
		double areaY = y.calcArea();

		if (areaX > areaY) {
			System.out.printf("Higher X : %.3f%n", areaX);
		} else {
			System.out.printf("Higher Y : %.3f%n", areaY);
		}

		sc.close();

	}

}
