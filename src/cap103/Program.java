package cap103;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		 
		 System.out.println("Enter the date: ");
		 
		 String data = sc.nextLine();
		 
		 LocalDate data1 = LocalDate.parse(data, formatter);
		 
		 System.out.println(data1.format(formatter));
		 
		 LocalDate data2 = LocalDate.now();
		 
		 
		 
		 System.out.println(data2.getDayOfMonth());
	
		
		sc.close();

	}

}
