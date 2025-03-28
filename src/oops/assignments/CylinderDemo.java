package oops.assignments;

public class CylinderDemo {

	public static void main(String[] args) {

		Cylinder cylinder1 = new Cylinder();
		Cylinder cylinder2 = new Cylinder(4.5, "Pink", 6.5);
		Cylinder cylinder3 = new Cylinder(1, "Black", 7);

		printCylinder(cylinder1);
		printCylinder(cylinder2);
		printCylinder(cylinder3);

	}

	public static void printCylinder(Cylinder cylinder) {

		System.out.println("Cylinder details : ");
		System.out.println("Radius - " + cylinder.getRadius());
		System.out.println("Color  - " + cylinder.getColor());
		System.out.println("Height - " + cylinder.getHeight());
		System.out.println("Area - " + String.format("%.2f", cylinder.calculateArea()));
		System.out.println("Volume - " + String.format("%.2f", cylinder.calculateVolume()));
		System.out.println();

	}

}
