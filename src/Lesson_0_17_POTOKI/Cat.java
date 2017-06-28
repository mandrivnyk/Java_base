package Lesson_0_17_POTOKI;

import java.io.Serializable;

public class Cat implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name = "Seslik";
	int age=10;
	CatOwner catowner;
	
	
	Cat(String name, int age, CatOwner catowner){
		this.name = name;
		this.age = age;
		this.catowner = catowner;
		
	}
	
	
	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getName() {
		return name;
	}




	public void setName(String name){
		this.name = name;
	}
	
	
}
