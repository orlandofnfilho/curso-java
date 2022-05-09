package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Jose");
		names.add("Orlando");
		names.add("Ferreira");

		// names.sort((n1, n2) -> n1.compareTo(n2));

		List<String> names2 = names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());

		names2.forEach(System.out::println);

	}

}
