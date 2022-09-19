package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccountUpcastingDowncasting {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Exemplos de UPCASTING e DOWNCASTING
		
		//UPCASTING
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//Executa se acc3 for instancia de BusinessAccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}//Nao executa porque acc3 não é instancia de BusinessAccount
		
		//Executa se acc3 o if anterior for negativo e se acc3 for instancia de SavingAccount
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}//Executa porque acc3 é instancia de SavingAccount
		
	}

}
