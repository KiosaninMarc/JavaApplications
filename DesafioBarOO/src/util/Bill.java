package util;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		return 4.00;
	}
	
	public double feeding() {
		return beer * 5.00 + softDrink * 3.00 + barbecue * 7.00;
	}
	
	public double ticket() {
		if (gender == 'f') {
			return 8.00;
		}else {
			return 10.00;
		}
	}
	
	public double total() {
		return feeding() + ticket();
	}
	
	public String toString() {
		return "\nRELATORIO:\n"
			+ "Consumo = R$ "
			+ String.format("%.2f", feeding())
			+ (feeding() > 30.00 ? "\nIsento de Couvert" : "\nCouvert = R$ " + String.format("%.2f", cover()))
			+ "\nIngresso = R$ "
			+ String.format("%.2f", ticket())
			+ "\n"
			+ (feeding() > 30.00 ? "\nValor a pagar = R$ " + String.format("%.2f", total()) : 
				"\nValor a pagar = R$ " + String.format("%.2f", total() + cover()));
	}
}
