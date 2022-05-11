package cap247;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import cap247.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			List<Product> products = new ArrayList<>();


			while (line != null) {

				String fields[] = line.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);

				products.add(new Product(name, price));
				
				line = br.readLine();

			}

			double avg = products.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / products.size();

			Comparator<String> comp = (o1, o2) -> o1.toUpperCase().compareTo(o2.toUpperCase());

			List<String> names = products.stream().filter(p -> p.getPrice() < avg).map(p -> p.getName())
					.sorted(comp.reversed()).collect(Collectors.toList());
			
			System.out.println("Average price: "+String.format("%.2f", avg));
			
			names.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
