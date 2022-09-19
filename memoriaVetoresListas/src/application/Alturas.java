package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Heights;

/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Heights vect[] = new Heights[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Heights(nome, idade, altura);
		}
		
		double altMedia = 0.0;
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getHeight();
		}
		altMedia = soma / vect.length;
		System.out.println("\nAltura media: "+ String.format("%.2f", altMedia));
		
		int contIdade = 0;
		double porcent = 0.0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				contIdade += 1;
			}
		}
		porcent = (contIdade * 100) / vect.length;
		System.out.print("Pessoas com menos de 16 anos: " + String.format("%.1f", porcent) + "%");
		
		System.out.println();
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}

}
