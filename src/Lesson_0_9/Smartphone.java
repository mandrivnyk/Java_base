package Lesson_0_9;

public class Smartphone {
	String name;
	String model;
	
	Smartphone(){
		name = "No Name";
		model = "China";
		getInfo();
				
	}
	
	Smartphone(String n, String m){
		name = n;
		model = m;
		getInfo();
	}
	
	void getInfo(){
		System.out.println("Name:"+name+" Model: "+model);
	} 
	
}
