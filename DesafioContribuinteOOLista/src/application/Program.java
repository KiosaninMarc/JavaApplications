package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPlayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPlayer> list = new ArrayList<>();
		
		System.out.print("Quantos contribuintes voce vai digitar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Digite os dados do "+ (i + 1) +"º contribuinte:");
			System.out.print("Renda anual com salario: ");
			Double annualSalary = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviços: ");
			Double annualServices = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			Double annualCapital = sc.nextDouble();
			System.out.print("Gastos medicos: ");
			Double annualHealth = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			Double annualEduc = sc.nextDouble();
			
			TaxPlayer gain = new TaxPlayer(annualSalary, annualServices, annualCapital, annualHealth, annualEduc);
			list.add(gain);
		}
		
		System.out.print("---------------------------------------");
		int i = 0;
		for (TaxPlayer print : list) {
			i++;
			System.out.println();
			System.out.println("Dados do "+ i + "º contribuinte:");
			System.out.println(print);
		}
		

		sc.close();
	}

}
