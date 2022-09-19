package application;

import java.util.Locale;
import java.util.Scanner;

/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. */

public class DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double menorAlt;
		double maiorAlt;
		double mediaAltMulher;
		double somaMediaAltMulher = 0.0;
		int contAltMulher = 0;
		int numHomens = 0;
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da "+ (i + 1) +"ª pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da "+ (i + 1) +"ª pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		menorAlt = altura[0];
		maiorAlt = altura[0];
		for (int i = 0; i < n; i++) {
			if (altura[i] > maiorAlt) {
				maiorAlt = altura[i];
			}
			if (altura[i] < menorAlt) {
				menorAlt = altura[i];
			}
		}
		System.out.printf("Menor altura = %.2f", menorAlt);		
		System.out.printf("\nMaior altura = %.2f", maiorAlt);
		
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'f' || genero[i] == 'F') {
				contAltMulher += 1;
				somaMediaAltMulher += altura[i];
			}
			if (genero[i] == 'm' || genero[i] == 'M') {
				numHomens += 1;
			}
		}
		mediaAltMulher = somaMediaAltMulher / contAltMulher;
		System.out.printf("\nMedia das alturas das mulheres = %.2f", mediaAltMulher);
		System.out.println("\nNumero de homens = " + numHomens);
		
		sc.close();
	}

}
