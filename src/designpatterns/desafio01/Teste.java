package designpatterns.desafio01;

public class Teste {

	public static void main(String[] args) {
		
		Logger logger = new ConsoleLogCreator();
		logger.log("Testando mensagem de log");
		
		Logger fileLogger = new FileLogCreator();
		fileLogger.log("Novo teste");

	}

}
