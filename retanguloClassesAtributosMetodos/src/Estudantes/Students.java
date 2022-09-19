package Estudantes;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudantes;

public class Students {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudantes nota = new Estudantes();
		System.out.println("Digite o nome e as 3 notas: ");
		nota.name = sc.nextLine();
		nota.n1 = sc.nextDouble();
		nota.n2 = sc.nextDouble();
		nota.n3 = sc.nextDouble();
		
		System.out.println(nota);

		sc.close();
	}

}
