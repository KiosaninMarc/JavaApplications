package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Negative;

/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

public class Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		Negative[] vect = new Negative[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			int numero = sc.nextInt();
			vect[i] = new Negative(numero);
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumber() < 0) {
				System.out.printf("%d\n", vect[i].getNumber());
			}
		}
		

		sc.close();
	}

}
