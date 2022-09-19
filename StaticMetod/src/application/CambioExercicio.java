package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class CambioExercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dolar? ");
		double dolar = sc.nextDouble();
		System.out.print("Quantos dolares serao comprados? ");
		double quant = sc.nextDouble();
		
		double convertido = CurrencyConverter.convert(quant, dolar);
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", convertido);

		sc.close();
	}

}
