package application;
//Expressao lambda declarada

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

import entities.Product;

public class Program04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		System.out.print("Digite o valor minimo: ");
		double min = sc.nextDouble();
		
		Predicate<Product> pred = p -> p.getPrice() >= min;

		list.removeIf(pred);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
		sc.close();
	}
}

//Fazer um programa que, a partir de uma lista de produtos, remova da
//lista somente aqueles cujo preço mínimo seja 100.