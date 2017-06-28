package Lesson_0_10;

public class Dog {
	String name;
	int age;
	Owner owner;
	
	Dog(String name, int age){
		this.name = name; 
		this.age = age;
	}
	
	void addOwner(Owner owner){
		this.owner = owner;
	}
	
	void getInfo(){
		System.out.println("Name: "+name+" Age: "+age+" Owner: "+(owner!=null?owner.getOwnerName():"homeless"));
	}
	
	
}
