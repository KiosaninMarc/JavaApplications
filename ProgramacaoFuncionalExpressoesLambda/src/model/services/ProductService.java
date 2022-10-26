package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product04;

public class ProductService {

	public double filteresSum(List<Product04> list, Predicate<Product04> criteria) {
		double sum = 0.0;
		for (Product04 p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
	
}
