package exec002;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a%b==0 || b%a==0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao Sao Multiplos");
		}
		
		sc.close();

	}

}
