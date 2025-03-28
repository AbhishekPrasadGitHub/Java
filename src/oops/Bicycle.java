package oops;

public class Bicycle {

	private int cadence;
	private int speed;
	private int gear;
	private int id;
	private String owner;
	private static int numberOfBicycles;
	private static final String MFG_COMP = "Tata";

	// public and private are called access modifiers.
	// Below method is a special method. Which is called constructor in Java
	/*
	 * Constructors in Java has - same name as class Name - They do not have return
	 * type not even void - If you do not define any constructor then Java uses
	 * default constructor
	 * 
	 * Constructors are used to initialize the state of the object. Constructors are
	 * used to initialize the value of instance variables
	 */
	// Below is a no parameter constructor
	public Bicycle() {
		cadence = 30;
		speed = 60;
		gear = 4;
		numberOfBicycles++;
		// MFG_COMP = "ABC";
		// return type is missing
		// method name should start with small letters
	}

	// When a class have more than one constructor, it is called constructor
	// overloading
	// When a class has two methods with the same name but different parameters,
	// then it is called
	// method overloading
	// this keyword refers to the object
	// when you do Bicycle c1 = new Bicycle(45, 80, 3) - "this" is c1
	// when you do Bicycle c2 = new Bicycle(25, 40, 2) - "this" is c2
	public Bicycle(int cadence, int speed, int gear, int numberOfBicycles) {
		this.cadence = cadence;
		setSpeed(speed);
		this.gear = gear;
		this.numberOfBicycles = numberOfBicycles;
	}

	// public Bicycle(int speed, int gear)
	// public Bicycle(int gear)
	// public Bicycle(int speed, int gear, String owner)
	// public Bicycle(int gear, String owner)
	// public Bicycle(String owner)
	// public Bicycle(String owner, int gear)
	// Assert Class and that class has more than 20 methods overloaded
	// assertEquals()
	// setter method
	public void setSpeed(int speed1) {
		if (speed1 <= 120)
			speed = speed1;
		else {
			System.out.println("Invalid Speed");
			speed = 120;
		}
	}

	// getter method
	public int getSpeed() {
		return speed;
	}

}
