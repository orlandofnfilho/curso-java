package designpatterns.desafio01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogPrinter extends Logger{

	@Override
	public void log(String message) {
		System.out.println("[LOG]: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + " - " + message);
		
	}

}
