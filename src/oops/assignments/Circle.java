package oops.assignments;

public class Circle {

	double radius;
	String color;

	public Circle() {
		this.radius = 5.0;
		this.color = "Green";

	}

	public Circle(double radius, String color) {
		setRadius(radius);
		setColor(color);

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius1) {
		if (radius1 > 2) {
			this.radius = radius1;
		} else {
			System.out.println("Radius "+ radius1+ " is less than 2 which is not allowed");
		    radius = radius1;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color1) {
		if (color1.equalsIgnoreCase("Black")) {
			System.out.println("Black color is not allowed");
			this.color = color1;
		} else {
			this.color = color1;
		}
	}

	public double calculateArea() {

		double area = (radius * radius * Math.PI);
		return area;
	}

}
