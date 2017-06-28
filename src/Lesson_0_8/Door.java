package Lesson_0_8;

public class Door {
	
	String color;
	String mat;
	boolean state;
	
	void openDoor(){
		state = true;
	}  
	
	
	void closeDoor(){
		state = false;
	}  
	
	void getInfo(){
		System.out.println("color: "+color);
		System.out.println("mat: "+mat);
		System.out.println("state: "+(state?"open":"close"));
	}
	
	
}
