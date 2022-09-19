package util;

public class Calculator2 {
	public static final double pi = 3.14159;

	public static double circumference(double radius) {
		return 2.0 * pi * radius;
	}
	
	public static double volume (double radius) {
		return 4.0 * pi * radius * radius * radius / 3.0;
	}
}
