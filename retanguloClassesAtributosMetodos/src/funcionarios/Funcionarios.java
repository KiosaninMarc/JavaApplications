package funcionarios;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculosFuncionario;

public class Funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalculosFuncionario calculo = new CalculosFuncionario();
		System.out.print("Nome: ");
		calculo.name = sc.nextLine();
		System.out.print("Salario bruto: ");
		calculo.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		calculo.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: " + calculo);
		
		System.out.println("\nQual a porcentagem de aumento do salario? ");
		double percent = sc.nextDouble();
		calculo.increaseSalary(percent);
		
		System.out.println();
		System.out.println("Dados atualizados: " + calculo);
		
		sc.close();
	}

}
