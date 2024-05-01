package designpatterns.desafio01;

public abstract class Logger {

	public void log(String message) {
        LogPrinter printer = createLogger();
        printer.print(message);
    }

    protected abstract LogPrinter createLogger();

}
