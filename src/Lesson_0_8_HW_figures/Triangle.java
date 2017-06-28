package Lesson_0_8_HW_figures;

import java.sql.SQLException;

import Lesson_0_15_HW.DBWorker;

public class Triangle {
	String  colour;
	String  name;
	double length;
	double area;
	public DBWorker dbworker;
	
	public Triangle(String c){
		name = "Triangle" ;
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
	public void setColor(String colourInput){
		colour = colourInput;
	}
	
	// P = 3*side
	public void setLength(double side){
		length = 3 * side;
	}
	
	// S = (H*side)/2
	// H = side * sin(60)
	public void setArea(double side){
		double h = side * Math.sin(Math.toRadians(60));		
		area = (h * side)/2;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getArea(){
		return area;
	}
	
	public String getColour(){
		return colour;
	}
	
	public String getName(){
		return name;
	}
	
	public String  getInfo(double input){
		return String.format("Name: %s \nColour: %s \nSide: %8.2f \nLength: %8.2f \nArea: %8.2f", getName(), getColour(), input, getLength(),getArea());
	}
	
	public DBWorker getDbworker() {
		return dbworker;
	}

}
