package exec009;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exec009.entities.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		System.out.print("How many employees will be registeredd? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			Integer id;
			String name;
			double salary;
			System.out.printf("Employee #%d:%n", i);
			System.out.print("Id: ");
			id = sc.nextInt();
			while (hasId(employees, id)) {
				System.out.println("Id already taken, try again!");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			sc.nextLine();
			Employee emp = new Employee(id, name, salary);
			employees.add(emp);
			System.out.println();

		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int y = sc.nextInt();
		sc.nextLine();
		Employee result = employees.stream().filter(x -> x.getId() == y).findFirst().orElse(null);
		if (result != null) {
			System.out.print("Enter the percentage: ");
			double perc = sc.nextDouble();
			sc.nextLine();
			result.increaceSalary(perc);
			System.out.println();

		} else {
			System.out.println("This id does not exist!");
		}

		for (Employee x : employees) {
			System.out.println(x);
			if(123 == x.getId()) {
				System.out.println("achou");
			}
		}

		sc.close();

	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
