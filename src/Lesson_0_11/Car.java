package Lesson_0_11;

public class Car {
	String mark="NoName";
	String model="NoName";
	//Car(){}
	Car(String mark,String model){
		this.mark=mark;
		this.model=model;
	}
	
	String getInfo(){
		return "Mark: "+mark+"; Model: "+model+"; ";
	}
}
