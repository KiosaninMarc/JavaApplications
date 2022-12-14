package entities;

import entities.enums.Color;

public abstract class Shape {
	private Color color;
	
	//Constructors
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	//Getters and Setters
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	//Abstract method
	public abstract double area();
}
