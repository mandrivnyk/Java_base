package Lesson_0_8_HW_figures;

import java.sql.SQLException;

import Lesson_0_15_HW.DBWorker;

public class Circle {
	
	String colour;
	String name;
	double length;
	double area;
	public DBWorker dbworker;
	
public DBWorker getDbworker() {
		return dbworker;
	}



public	Circle(String c){
		name = "Circle" ;
		colour = c;
		try {
			dbworker = new DBWorker("mysql");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public	void setColor(String colourInput){
		colour = colourInput;
	}
	
	// P = 2*Pi*R
public	void setLength(double radius){
		length = 2 * Math.PI * radius;
	}
	
	// S = Pi*R^2
public	void setArea(double radius){
		area = Math.PI * Math.pow(radius, 2);
	}
	
public	double getLength(){
		return length;
	}
	
public	double getArea(){
		return area;
	}
	
public	String getColour(){
		return colour;
	}
	
public	String getName(){
		return name;
	}
	
public	String getInfo(double input){
		return String.format("Name: %s \nColour: %s \nRadius: %8.2f \nLength: %8.2f \nArea: %8.2f", getName(), getColour(), input, getLength(),getArea());
	}
}
