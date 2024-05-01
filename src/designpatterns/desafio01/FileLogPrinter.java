package designpatterns.desafio01;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogPrinter extends Logger {

	private String filename = "testelog.txt";
	

	@Override
	public void log(String message) {
		try (FileWriter fw = new FileWriter(filename, true)) {
			fw.write(("[LOG]: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + " - " + message) + "\n");
			fw.flush();
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}
	}

}
