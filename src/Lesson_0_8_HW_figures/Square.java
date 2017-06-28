package Lesson_0_8_HW_figures;

import java.sql.SQLException;

import Lesson_0_15_HW.DBWorker;

public class Square {
	String  colour;
	String  name;
	double length;
	double area;
	public DBWorker dbworker;
	
	public Square(String c){
		name = "Square" ;
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
	
	// P = 4*H
	public void setLength(double side){
		length = 4 * side;
	}
	
	// S = H^2
	public void setArea(double side){
		area = Math.pow(side, 2);
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
