package designpatterns.desafio01;

import java.time.Instant;

public class ConsoleLogPrinter implements LogPrinter{

	@Override
	public void print(String message) {
		System.out.println("[LOG] " + Instant.now() + ": " + message);		
	}

}
