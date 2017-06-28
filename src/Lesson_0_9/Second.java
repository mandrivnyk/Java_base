package Lesson_0_9;

public class Second {
	int[] cats;
	
	void setInputArray(int[] cats){
		for (int i = 0; i < cats.length; i++) {
		    System.out.println("cats[" + i + "]=" + cats[i]);
		}
	}
	
	int[] getArray(){
		return cats;
	}
	
}
