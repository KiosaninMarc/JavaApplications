//Funçoes são objetos de primeira ordem (ou primeira classe)
package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program03 {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort(Program03::compareProducts);
		
		list.forEach(System.out::println);
	}

}

//Isso significa que funções podem, por exemplo, serem passadas como parâmetros de 
//métodos, bem como retornadas como resultado de métodos.

//Na programação funcional eu posso passar uma função como argumento de outra função
//Isso significa eu falar que uma função é um objeto de primeira classe, ou primeira ordem
//ele pode ser passado como argumento para outras funções e ele pode ainda ser retornado por uma função
//Na programação funcional isso é comum