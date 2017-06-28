package Lesson_0_17_POTOKI;

import java.io.Serializable;

public class CatOwner  implements Serializable{

	private String name = "Petya";
	
	CatOwner(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
