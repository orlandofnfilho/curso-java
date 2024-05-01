package designpatterns.desafio01;

public class ConsoleLogCreator extends Logger{

	  @Override
	    protected LogPrinter createLogger() {
	        return new ConsoleLogPrinter();
	    }

}
