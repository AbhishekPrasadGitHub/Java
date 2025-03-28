package oops.assignments;

public class Cylinder extends Circle {

	double height;

	public Cylinder() {
		this.radius = 6.5;
		this.color = "white";
		this.height = 7.5;

	}

	public Cylinder(double radius, String color, double height) {
		setColor(color);
		setRadius(radius);
		setHeight(height);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height1) {
		height = height1;
	}

	@Override
	public double calculateArea() {
		double area = 2 * Math.PI * radius * (radius + height) ;
		return area;

	}

	public double calculateVolume() {
		double volume = calculateArea() * height;
		return volume;

	}

}
