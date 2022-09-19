package application;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. */

public class MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		int takeAge = 0;
		String takeName = " ";
		for (int i = 0; i < n; i++) {
			if (idade[i] > takeAge) {
				takeAge = idade[i];
				takeName = nome[i];
			}
		}
		System.out.println("Pessoa mais velha: " + takeName);

		sc.close();
	}

}
