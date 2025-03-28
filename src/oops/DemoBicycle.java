package oops;

import java.util.Scanner;

public class DemoBicycle {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				//ChromeDriver driver = new ChromeDriver();
			Bicycle myCycle;//variable of type of any class is called object reference
			myCycle = new Bicycle(); 
			String name;
			Scanner sc = new Scanner(System.in);
//			System.out.println(myCycle.cadence);
//			System.out.println(myCycle.speed);
//			System.out.println(myCycle.gear);
//			
//			myCycle.gear = 40;
//			myCycle.speed = 1000;
			//myCycle.setSpeed(1000);		
			System.out.println(myCycle.getSpeed());	

			Bicycle myAnotherCycle;//variable of type of any class is called object reference
			myAnotherCycle = new Bicycle(25, 40, 2, 3); 
//			System.out.println(myAnotherCycle.cadence);
//			System.out.println(myAnotherCycle.speed);
//			System.out.println(myAnotherCycle.gear);
//			
//			myAnotherCycle.gear = 44;
//			
//			System.out.println(myAnotherCycle.gear);
			//Java creates a copy of instance variable for each object.
			//Each object has its own copy of the instance variables. 
		}

	}


