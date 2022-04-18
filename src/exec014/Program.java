package exec014;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exec014.entities.ImportedProduct;
import exec014.entities.Product;
import exec014.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Product %d data: \n", i);
			System.out.print("Common, used, or imported (c,u,i)? ");
			char op = sc.next().charAt(0);
			sc.nextLine();
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();

			if (op == 'c') {
				products.add(new Product(name, price));
			} else if (op == 'i') {
				System.out.printf("Custom fee: ");
				double customFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customFee));
			} else {
				System.out.printf("Manufacture date (DD/MM/YYYY): ");
				String manufactureDate = sc.nextLine();
				products.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));
			}

		}

		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product pd : products) {
			System.out.println(pd.priceTag());
		}

		sc.close();
	}

}
