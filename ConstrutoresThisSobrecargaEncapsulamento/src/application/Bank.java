package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		clearBuffer(sc);
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char iniDep = sc.next().charAt(0);
		if (iniDep == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depInit = sc.nextDouble();
			account = new Account(number, holder, depInit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		double depInit = sc.nextDouble();
		account.balance(depInit);
		
		System.out.println("\nUpdate account data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a withdraw value: ");
		depInit = sc.nextDouble();
		account.withdraw(depInit);
		
		System.out.println("\nUpdate account data: ");
		System.out.println(account);
		
		sc.close();
	}
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
