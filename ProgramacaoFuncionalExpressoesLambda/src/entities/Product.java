package entities;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	//vou fazer um metodo que pega um produto e retorna um boleano
	//Metodo estatico ele trabalho com um produto que vc passar como argumento para ele
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}
	
	//Metodo nao estatico é o metodo da instancia, ele vai trabalhar com o proprio objeto onde estou
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
