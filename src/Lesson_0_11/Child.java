package Lesson_0_11;

public class Child extends Parent{
	String name="Child";
	void getChild(){
		System.out.println("getChild");
	}
	@Override
	void getInfo(){
		System.out.println("Child Info");
	}
}
