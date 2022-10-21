package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import util.PriceUpdate;

//Consumer (exemplo com forEach)
//Implementação da interface
public class Program05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.forEach(new PriceUpdate());

		list.forEach(System.out::println);
	}

}


/*Fazer um programa que, a partir de uma lista de produtos, aumente o
preço dos produtos em 10%.*/