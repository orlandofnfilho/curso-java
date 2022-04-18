package cap151;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import cap151.entities.Circle;
import cap151.entities.Rectangle;
import cap151.entities.Shape;
import cap151.entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Shape #%d data: \n",i);
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.nextLine();
			if (shape == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				sc.nextLine();
				System.out.print("Height: ");
				double heigh = sc.nextDouble();
				sc.nextLine();
				list.add(new Rectangle(Color.valueOf(color), width, heigh));

			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				sc.nextLine();
				list.add(new Circle(Color.valueOf(color), radius));
			}
		}

		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape s : list) {
			System.out.println(s.area());
		}

		sc.next();

	}

}
