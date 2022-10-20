package application;
//Predicate - Implementação de interface

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program04 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));

		list.removeIf(Product::staticProductPredicate/*Method reference*/);
		//Coloco o nome da classe onde o metodo está :: e o nome do metodo
		//Isso tambem é aceito no sistema lambda do java
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}

//Fazer um programa que, a partir de uma lista de produtos, remova da
//lista somente aqueles cujo preço mínimo seja 100.