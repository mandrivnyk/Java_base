package Lesson_0_8_HW_figures;

public class Color {
	String[] colour = {"blue", "green", "white", "yellow", "orange", "black", "brown", "transparent", "red", "pink"};
	
	public	String getRandomColour(){
		return colour[(int)(Math.random()*colour.length)];
	}
	

	
}
