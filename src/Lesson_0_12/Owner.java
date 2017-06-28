package Lesson_0_12;

public class Owner {
	String name="Alex";
	
	Owner(){}
	Owner(Owner owner){
		name=owner.name;
	}
}
