package application;
//Reference Method com metodo estatico
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Product02;
import util.PriceUpdate;

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
		
		list.forEach(Product02::staticPriceUpdate);

		list.forEach(System.out::println);
	}

}


/*Fazer um programa que, a partir de uma lista de produtos, aumente o
preço dos produtos em 10%.*/