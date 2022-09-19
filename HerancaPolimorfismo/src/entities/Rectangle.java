package entities;

import entities.enums.Color;

public class Rectangle extends Shape {
	private Double width;
	private Double height;
	
	//Constructors
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	//Getters and Setters
	public Double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public Double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	//Methods
	@Override
	public double area() {
		return width * height;
	}
}
