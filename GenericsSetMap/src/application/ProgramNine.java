package application;
//Como Set testa igualdade

import java.util.HashSet;
import java.util.Set;

import entities.ProductTwo;

public class ProgramNine {

	public static void main(String[] args) {
		
		Set<ProductTwo> set = new HashSet<>();
		
		set.add(new ProductTwo("TV", 900.0));
		set.add(new ProductTwo("Notebook", 1200.0));
		set.add(new ProductTwo("Tablet", 400.0));
		
		ProductTwo prod = new ProductTwo("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));
	}

}
