package application;
//Interface Function - 01Implementação da interface
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product03;
import util.UpperCaseName;

public class Program06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product03> list = new ArrayList<>();
		
		list.add(new Product03("TV", 900.00));
		list.add(new Product03("Mouse", 50.00));
		list.add(new Product03("Tablet", 350.50));
		list.add(new Product03("HD Case", 80.90));

		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		sc.close();
	}
}

/*Problema exemplo
Fazer um programa que, a partir de uma lista de produtos, gere uma
nova lista contendo os nomes dos produtos em caixa alta.*/