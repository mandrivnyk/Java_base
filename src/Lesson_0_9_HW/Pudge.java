package Lesson_0_9_HW;

import java.util.Scanner;

public class Pudge {
	double intellect;
	double skill;
	double power;
	double health;
	double strike;
	

	Pudge(){
		
		intellect = getParametr("intellect");
		skill = getParametr("skill");
		power = getParametr("power");
		health = getParametr("health");
		strike = getParametr("strike");				
	}
	
	double getParametr(String p){
		Scanner sc = new Scanner(System.in);		
		System.out.printf("Please enter a value of %s:", p);
		double v = 0;				
		boolean valid = false;
		do {
			while (!sc.hasNextDouble()) {
		        System.out.print("You must enter a valid number! Try again: ");
		        sc.next();
		    }
			
			v = sc.nextDouble();
		    
		    if(v > 0) {
		    	valid = true;
		    }
		    else {
		    	System.out.print("You must enter a valid number! Try again: ");
		    }
		} while (!valid);
		
		sc.close();
		return v;
	}
	
	void setHealth(double h){
		health = h;
	}	
	
	double getStrike(){
		return (intellect/3 + skill/2 + power);
	}
	
	double getHealth(){
		return health;
	}
	
}
