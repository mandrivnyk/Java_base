package Lesson_0_9;

import java.util.Arrays;

public class Color {
	String[] colour = {"blue", "green", "white", "yellow", "orange", "black", "brown", "transparent", "red", "pink"};
	
	String getRandomColour(){
		return colour[(int)(Math.random()*colour.length)];
	}
	
	void setColors(int...a ){
		System.out.println(Arrays.toString(a));
	}
	
}
