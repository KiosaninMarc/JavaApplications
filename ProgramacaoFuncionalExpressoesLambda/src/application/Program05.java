package application;
//Expressao lambda declarada
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

import entities.Product02;

//Consumer (exemplo com forEach)
//Implementação da interface
public class Program05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product02> list = new ArrayList<>();
		
		list.add(new Product02("TV", 900.00));
		list.add(new Product02("Mouse", 50.00));
		list.add(new Product02("Tablet", 350.50));
		list.add(new Product02("HD Case", 80.90));
		
		System.out.print("Porcentagem: ");
		double factor = sc.nextDouble();
		
		Consumer<Product02> cons = p -> p.setPrice(p.getPrice() * factor);
		
		list.forEach(cons);

		list.forEach(System.out::println);
	}

}


/*Fazer um programa que, a partir de uma lista de produtos, aumente o
preço dos produtos em 10%.*/