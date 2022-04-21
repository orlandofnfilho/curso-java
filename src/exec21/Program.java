package exec21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> map = new LinkedHashMap<>();
			
			String line = br.readLine();
			while(line!=null) {
				String fields[] = line.split(",");
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				Integer totalVotes = map.containsKey(name) ? map.get(name) : 0;
				totalVotes += votes;
				map.put(name, totalVotes);
				
				line = br.readLine();
				
			}
			
			
			System.out.println();
			for(String key : map.keySet()) {
				System.out.println(key + ", " + map.get(key));
			}
			
			
		}catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		sc.close();
	}

}
