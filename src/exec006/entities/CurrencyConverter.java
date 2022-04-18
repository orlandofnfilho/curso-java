package exec006.entities;

public class CurrencyConverter {

	public static double dollar;
	public static double x;

	public static final double IOF = 0.06;

	public static double converter(double valor) {

		valor = valor * dollar;
		valor += valor * IOF;

		return valor;
	}

}
