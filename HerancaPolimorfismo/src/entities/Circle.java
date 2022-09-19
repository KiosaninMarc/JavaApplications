package entities;

import entities.enums.Color;

public class Circle extends Shape{

	private Double radius;
	
	//Constructors
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	//Getters and Setters
	public Double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Methods
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
}
