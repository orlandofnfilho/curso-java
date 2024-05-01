package designpatterns.desafio01;

public class FileLogCreator extends Logger{

	@Override
	protected LogPrinter createLogger() {
		return new FileLogPrinter();
	}
	

}
