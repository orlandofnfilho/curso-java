package exec018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exec018.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = null;

		String[] vect = null;

		List<Product> items = new ArrayList<Product>();

		File path = new File("C:\\Users\\Orlando\\Desktop\\in.csv");

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				vect = line.split(";");

				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				int qtd = Integer.parseInt(vect[2]);
				Product p = new Product(name, price, qtd);
				items.add(p);

				double total = p.calcTotal();

				boolean outFolder = new File(path.getParent() + "\\out").mkdir();

				try (BufferedWriter bw = new BufferedWriter(
						new FileWriter(path.getParent() + "\\out" + "\\sumary.csv", true))) {

					bw.write(p.getName() + ";" + total);
					bw.newLine();

				} catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
				}

				line = br.readLine();

			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		for (Product x : items) {
			System.out.println(x);
		}
	}

}
