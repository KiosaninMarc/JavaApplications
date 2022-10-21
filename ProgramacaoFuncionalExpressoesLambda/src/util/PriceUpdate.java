package util;

import java.util.function.Consumer;
import entities.Product02;

public class PriceUpdate implements Consumer<Product02> {

	@Override
	public void accept(Product02 p) {
		p.setPrice(p.getPrice() * 1.1);		
	}	
}
