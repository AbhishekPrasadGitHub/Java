package oops.assignments;

public class CircleDemo {

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		
		System.out.println("Details of circle through default constructor object: ");
		System.out.println("Radius - "+circle1.getRadius());
		System.out.println("Color  - "+circle1.getColor());
		System.out.println("Area - "+String.format("%.2f", circle1.calculateArea()));
		System.out.println();
		
		Circle circle2 = new Circle(4.5, "white");
		
		System.out.println("Details of circle through circle2 object: ");
		System.out.println("Radius - "+circle2.getRadius());
		System.out.println("Color  - "+circle2.getColor());
		System.out.println("Area - "+String.format("%.2f", circle2.calculateArea()));
		System.out.println();
		
		Circle circle3 = new Circle(1, "Red");
		
		System.out.println("Details of circle through circle3 object: ");
		System.out.println("Radius - "+circle3.getRadius());
		System.out.println("Color  - "+circle3.getColor());
		System.out.println("Area - "+String.format("%.2f", circle1.calculateArea()));
		System.out.println();
		
		Circle circle4 = new Circle(5.6, "Black");
		
		System.out.println("Details of circle through circle4 object: ");
		System.out.println("Radius - "+circle4.getRadius());
		System.out.println("Color  - "+circle4.getColor());
		System.out.println("Area - "+String.format("%.2f", circle1.calculateArea()));
		System.out.println();
		

	}

}

//ketan@nichethyself.com
