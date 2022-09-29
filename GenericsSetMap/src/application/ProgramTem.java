package application;
//Como TreeSet compara os elementos

import java.util.Set;
import java.util.TreeSet;

import entities.ProductThree;

public class ProgramTem {

	public static void main(String[] args) {
		
		Set<ProductThree> set = new TreeSet<>();
		
		set.add(new ProductThree("TV", 900.0));
		set.add(new ProductThree("Notebook", 1200.0));
		set.add(new ProductThree("Tablet", 400.0));
		
		for (ProductThree p : set) {
			System.out.println(p);
		}
	}

}
