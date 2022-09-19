/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SumVector;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		SumVector vect[] = new SumVector[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			double num = sc.nextDouble();
			vect[i] = new SumVector(num);
		}
		
		
		System.out.print("\nVALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i].getNumber());
		}

		double sum = 0.0;
		System.out.print("\nSOMA = ");
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getNumber();
		}
		System.out.printf("%.2f ", sum);
		
		double media = sum / vect.length;
		System.out.printf("\nMEDIA = %.2f", media);
		
		sc.close();
	}

}
