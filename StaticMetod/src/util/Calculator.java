package util;

public class Calculator {

	public final double pi = 3.14159;

	public double circumference(double radius) {
		return 2.0 * pi * radius;
	}
	
	public double volume (double radius) {
		return 4.0 * pi * radius * radius * radius / 3.0;
	}
	
}
