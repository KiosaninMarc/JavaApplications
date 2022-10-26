package util;

import java.util.function.Function;

import entities.Product03;

public class UpperCaseName implements Function<Product03, String>{

	@Override
	public String apply(Product03 p) {
		return p.getName().toUpperCase();
	}

}
