package exec013;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exec013.entities.Client;
import exec013.entities.Order;
import exec013.entities.OrderItem;
import exec013.entities.Product;
import exec013.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		Client c1 = new Client(name, email, sdf.parse(birthDate));

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String sts = sc.nextLine();
		System.out.print("How many items to this order? ");
		int orders = sc.nextInt();
		sc.nextLine();
		Order o1 = new Order(new Date(), OrderStatus.valueOf(sts), c1);
		for (int i = 1; i <= orders; i++) {
			System.out.printf("Enter %d item data: \n", i);
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			sc.nextLine();
			System.out.print("Quantity: ");
			int productQtd = sc.nextInt();
			sc.nextLine();
			Product p1 = new Product(productName, productPrice);
			OrderItem ordemItem = new OrderItem(productQtd, productPrice, p1);
			o1.addItem(ordemItem);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(o1.toString());

		sc.close();
	}

}
