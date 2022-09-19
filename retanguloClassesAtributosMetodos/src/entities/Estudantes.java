package entities;

public class Estudantes {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double notaFinal() {
		return n1 + n2 + n3;
	}
	
	public double rest() {
		return 60.00 - notaFinal();
	}
	
	public String toString() {
		return "NOTA FINAL = "
			+ String.format("%.2f", notaFinal())
			+ (notaFinal() >= 60.00 ? "\nPASS" : "\nFAILED\n" + "FALTARAM " + String.format("%.2f", rest()) + " PONTOS");
	}
}
