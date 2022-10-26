package application;
//Criando funções que recebem funções como argumento
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product04;
import model.services.ProductService;

public class Program07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a inicial para filtragem: ");
		char n = sc.next().charAt(0);
		
		List<Product04> list = new ArrayList<>();
		
		list.add(new Product04("TV", 900.00));
		list.add(new Product04("Mouse", 50.00));
		list.add(new Product04("Tablet", 350.50));
		list.add(new Product04("HD Case", 80.90));
		list.add(new Product04("Monitor", 600.50));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteresSum(list, p -> p.getName().charAt(0) == n);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
		sc.close();
	}
}

/*Problema exemplo
Fazer um programa que, a partir de uma lista de produtos, calcule a
soma dos preços somente dos produtos cujo nome começa com "T".*/