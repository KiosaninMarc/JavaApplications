package application;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Bar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill conta = new Bill();
		
		System.out.print("Sexo: ");
		conta.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		conta.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		conta.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinos: ");
		conta.barbecue = sc.nextInt();
		
		System.out.println(conta);
		
		sc.close();
	}

}
