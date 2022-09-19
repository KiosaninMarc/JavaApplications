package application;
/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */

import java.util.Locale;
import java.util.Scanner;

import entities.PairNumbers;

public class NumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		PairNumbers vect[] = new PairNumbers[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			int numero = sc.nextInt();
			vect[i] = new PairNumbers(numero);
		}
		
		System.out.println("\nNUMEROS PARES:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumber() % 2 == 0) {
				System.out.print(vect[i].getNumber() + " ");
			}
		}
		
		int cont = 0;
		System.out.println("\n");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumber() % 2 == 0) {
				cont += 1;
			}
		}
		System.out.print("Quantidade de pares = " + cont);
		
		sc.close();
	}

}
