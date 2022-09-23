package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String deptName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		Integer pgDay = sc.nextInt();
		sc.nextLine();		
		System.out.print("Email: ");
		String eMail = sc.nextLine();
		System.out.print("Telefone: ");
		String tel = sc.nextLine();
		
		Address ad = new Address(eMail, tel);//Instanciando a classe Address
		Department dept = new Department(deptName, pgDay, ad);//Instanciando a classe Department

		System.out.println("-------------------------------");
		System.out.print("Quantos funcionarios tem o departamento? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados do funcionario "+ (i + 1) + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Employee emp = new Employee(nome, salario);//Instanciando a classe Employee
			dept.addEmployee(emp);//Adicionando dados no metodo addEmployee da classe Department
		}
		
		System.out.println("-------------------------------");
		showReport(dept);//Chamando o metodo static para exibir o relatorio
		sc.close();
	}
	
	private static void showReport(Department dept) {
		 // MOSTRAR NA TELA OS DADOS DO RELATÓRIO
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.println("Departamento "+ dept.getName() +" = R$ "+ String.format("%.2f", dept.payroll()));
		System.out.println("Pagamento realizado no dia "+ dept.getPayDay());
		System.out.println("-------------------------------");
		System.out.println("Funcionarios:");
		System.out.print(dept.toString());
		System.out.println("Para duvidas favor entrar em contato: "+ dept.getAddress().getEmail());
	} 

}
