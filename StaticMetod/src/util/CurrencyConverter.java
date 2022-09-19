package util;

public class CurrencyConverter {

	public static double convert (double dolar, double quant) {
		return quant * (dolar * 0.06 + dolar);
	}
		
}
