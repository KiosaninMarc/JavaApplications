package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccountPolimorfismo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		Account z = new BusinessAccount(1024, "Manoel", 1000.0, 500.0);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		z.withdraw(50.0);

		System.out.println("Com taxa de saque de 5.0 + 2.0: " + z.getBalance() + " - Saldo Final");
		System.out.println("Com taxa de saque de 5.0:       " + x.getBalance() + " - Saldo Final");
		System.out.println("Sem taxa de saque:              " + y.getBalance() + " - Saldo Final");
	}

}
