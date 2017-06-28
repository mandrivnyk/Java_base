package Lesson_0_16;

public class MyOwnException extends Exception{
	@Override
	public String getMessage(){
		return "My message Exception";
	}
}
