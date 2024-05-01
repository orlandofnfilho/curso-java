package designpatterns.desafio01;

public class Teste {

	public static void main(String[] args) {

		Logger logger = new ConsoleLogPrinter();
		
		logger.log("testando");

		
		Logger logger2 = new FileLogPrinter();
		logger2.log("TESTANDO O FILELOGPRINTER!!!");
	}

}
