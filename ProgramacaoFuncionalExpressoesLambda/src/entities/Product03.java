package entities;

public class Product03 {
	private String name;
	private Double price;
	
	public Product03() {
	}

	public Product03(String name, Double price) {
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

	public static void staticPriceUpdate(Product03 p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticPriceUpdate() {
		price = price * 1.1;
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
		
}
