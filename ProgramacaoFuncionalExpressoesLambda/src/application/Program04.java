package application;
//Predicate - Implementação de interface

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program04 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));

		list.removeIf(new ProductPredicate());//Colocar o Predicado implementado manualmente por meio da interface
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}

//Fazer um programa que, a partir de uma lista de produtos, remova da
//lista somente aqueles cujo preço mínimo seja 100.