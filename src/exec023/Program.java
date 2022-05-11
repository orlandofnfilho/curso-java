package exec023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import exec023.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the file path: ");

		String path = sc.nextLine();
		System.out.print("Enter Salary: ");
		Double salary = sc.nextDouble();
		sc.nextLine();
		System.out.printf("Email of people salary is more than %.2f\n", salary);

		List<Employee> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String fields[] = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double empSalary = Double.parseDouble(fields[2]);

				list.add(new Employee(name, email, empSalary));

				line = br.readLine();
			}

			Comparator<String> comp = (o1, o2) -> o1.toUpperCase().compareTo(o2.toUpperCase());

			List<String> emails = list.stream().filter(x -> x.getSalary() > salary).map(x -> x.getEmail()).sorted(comp)
					.collect(Collectors.toList());

			emails.forEach(System.out::println);

			double sum = list.stream().filter(x -> x.getName().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0,
					(x, y) -> x + y);

			System.out.println();
			System.out.println("SUM of people whose name starts with 'M': " + String.format("%.2f", sum));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
