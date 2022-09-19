package application;

import java.util.Locale;
import java.util.Scanner;

import entities.HighestPosition;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). */

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		HighestPosition vect[] = new HighestPosition[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			double numero = sc.nextDouble();
			vect[i] = new HighestPosition(numero);
		}
		
		double pega = 0.0;
		int posMaior = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNum() > pega) {
				pega = vect[i].getNum();
				posMaior = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f", pega);
		System.out.println("\nPOSICAO DO MAIOR VALOR = " + posMaior);
		
		sc.close();
	}

}
