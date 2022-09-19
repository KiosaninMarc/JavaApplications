package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccountSobrePosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Exemplo de SobrePosição
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println("Com taxa:       " + acc1.getBalance());//Com taxa de 5.0 para o saque
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println("Sem taxa:       " + acc2.getBalance());//Sem a taxa de 5.0 para o saque
		//Fim do exemplo de SobrePosição
		
		//Exemplo com super()
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println("Com taxa extra: " + acc3.getBalance());

	}

}
