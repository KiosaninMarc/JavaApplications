package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		System.out.println("-------------------------");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double initBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double wLimit = sc.nextDouble();
		Account acc = new Account(number, holder, initBalance, wLimit);
		System.out.println();
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.print("Enter amount for withdraw: ");
		Double amt = sc.nextDouble();
		
		try {
			acc.withdraw(amt);
			System.out.printf("New balance: %.2f%n", acc.getBalance());
		}catch (BusinessException e){
			System.out.println(e.getMessage());
		}
		
		
		
		sc.close();
	}

}
