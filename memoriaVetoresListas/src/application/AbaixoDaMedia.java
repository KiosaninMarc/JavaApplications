package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		
		double media = soma / vet.length;
		System.out.printf("\nMEDIA DO VETOR: %.3f", media);
		
		double abaixo = 0.0;
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < media) {
				abaixo = vet[i];
				System.out.printf("%.1f\n", abaixo);
			}
		}
		
		sc.close();
	}

}
