package teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import teste.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the file path: ");
		String path = sc.nextLine();

		System.out.print("Enter the salary: ");
		Double salary = sc.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			List<Employee> list = new ArrayList<>();

			while (line != null) {

				String fields[] = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));

			List<String> emails = list.stream().filter(x -> x.getSalary() > salary).map(x -> x.getEmail()).sorted()
					.collect(Collectors.toList());

			emails.forEach(System.out::println);

			double sum = list.stream().filter(x -> x.getName().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0,
					(x, y) -> x + y);

			System.out.println("Sum of salary of whose people name starts with 'M': " + String.format("%.2f", sum));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
