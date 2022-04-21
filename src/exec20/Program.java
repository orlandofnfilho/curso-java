package exec20;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		int n;
		System.out.print("How many students for course A? ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			Integer cod = sc.nextInt();
			set.add(cod);
		}
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			Integer cod = sc.nextInt();
			set.add(cod);
		}
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			Integer cod = sc.nextInt();
			set.add(cod);
		}
		
		System.out.println("Total students: "+set.size());
	
		
		
		sc.close();

	}

}
