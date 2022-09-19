package entities;

public class Productvet2 {
	
	private String name;
	private double price;
	
	//Constructor
	public Productvet2(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	//End Getters and Setters
}
