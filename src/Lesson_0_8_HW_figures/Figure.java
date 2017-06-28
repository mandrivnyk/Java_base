package Lesson_0_8_HW_figures;

import java.util.Scanner;

public class Figure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i = 0;
	     while(i<1 || i>3){
	 		System.out.println("To create a figure please type from 1 to 3: \n 1 - circle, \n 2 - square, \n 3 - triangle");
	 		System.out.print("Type here:");
		     int y = sc.nextInt();
		     System.out.println("you typed: "+y);
		     i = y;
	     }
	     
	     Color color = new Color();
	     
	     switch (i) {
			case 1:
				Circle newCircle =  new Circle(color.getRandomColour());				
				double radius = 0;				
				boolean valid = false;
				System.out.print("Please enter a value of radius:");
				do {
					while (!sc.hasNextDouble()) {
				        System.out.print("You must enter a valid number! Try again: ");
				        sc.next();
				    }
					
				    radius = sc.nextDouble();
				    
				    if(radius > 0) {
				    	valid = true;
				    }
				    else {
				    	System.out.print("You must enter a valid number! Try again: ");
				    }
				} while (!valid);
				
			    System.out.println("you typed: "+radius);
			    newCircle.setArea(radius);
			    newCircle.setLength(radius);			    
			    newCircle.getInfo(radius);
				break;
			case 2:
				Square newSquare =  new Square(color.getRandomColour());				
				double side = 0;			
				boolean valid1 = false;
				System.out.print("Please enter a value of side:");
				do {
					while (!sc.hasNextDouble()) {
				        System.out.print("You must enter a valid number! Try again: ");
				        sc.next();
				    }
					
					side = sc.nextDouble();
				    
				    if(side > 0) {
				    	valid1 = true;
				    }
				    else {
				    	System.out.print("You must enter a valid number! Try again: ");
				    }
				    
				} while (!valid1);
				
			    System.out.println("you typed: "+side);
			    newSquare.setArea(side);
			    newSquare.setLength(side);			    
			    newSquare.getInfo(side);
				break;
			case 3:
				Triangle newTriangle =  new Triangle(color.getRandomColour());				
				double side1 = 0;				
				boolean valid2 = false;
				System.out.print("Please enter a value of side:");
				do {
					while (!sc.hasNextDouble()) {
				        System.out.print("You must enter a valid number! Try again: ");
				        sc.next();
				    }
					
					side1 = sc.nextDouble();
				    
				    if(side1 > 0) {
				    	valid2 = true;
				    }
				    else {
				    	System.out.print("You must enter a valid number! Try again: ");
				    }
				} while (!valid2);	
				
			    System.out.println("you typed: "+side1);
			    newTriangle.setArea(side1);
			    newTriangle.setLength(side1);			    
			    newTriangle.getInfo(side1);
				break;
			default:
				break;
			}	     

	     sc.close();	     
	}
}