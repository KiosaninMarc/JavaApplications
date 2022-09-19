package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class ProgramTax {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <TaxPayer> list = new ArrayList<TaxPayer>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		System.out.println("===============================");
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+ i +" data");
			System.out.print("Individual or Company (i/c): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anuInc = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExp = sc.nextDouble();
				list.add(new Individual(name, anuInc, healthExp));
			}else {
				System.out.print("Number of employees: ");
				int numEmp = sc.nextInt();
				list.add(new Company(name, anuInc, numEmp));
			}
		}
		
		System.out.println();
		System.out.println("==============================");
		System.out.println("TAXES PAID");
		for (TaxPayer tx : list) {
			System.out.println(tx.getName() + ": $ " + String.format("%.2f", tx.tax()));
		}

		System.out.println();
		System.out.println("===============================");
		double totTax = 0.0;
		for (TaxPayer tx : list) {
			totTax += tx.tax();
		}
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", totTax));
		
		
		sc.close();
	}

}
