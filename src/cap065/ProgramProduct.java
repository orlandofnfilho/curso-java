package cap065;

import java.util.Locale;
import java.util.Scanner;

import cap065.entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product1 = new Product();

		int qtd;

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product1.name = sc.nextLine();
		System.out.print("Price: ");
		product1.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product1.quantity = sc.nextInt();

		
		
		System.out.printf("Product data: " + product1.toString());
		System.out.println();
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		qtd = sc.nextInt();
		product1.addProducts(qtd);
		System.out.printf("Updated data: " + product1);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		qtd = sc.nextInt();
		product1.removeProducts(qtd);
		System.out.printf("Updated data: " + product1);
		
		
		
		
		sc.close();
	}

}
