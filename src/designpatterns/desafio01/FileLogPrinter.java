package designpatterns.desafio01;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogPrinter implements LogPrinter {

	
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
     private String filename = LocalDateTime.now().format(formatter) + ".txt";

	@Override
	public void print(String message) {
		try (FileWriter fw = new FileWriter(filename, true)) {
			fw.write(("[LOG] " + Instant.now() + ": " + message) + "\n");
			fw.flush();
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}
	}

}
