package Lesson_0_17_Collections;

import java.util.Comparator;

public  class CatComparator implements Comparator<Cat>{
	
	
	public int compare(Cat arg0, Cat arg1){
		return (arg0.getAge() > arg1.getAge())? 1 : -1;
	}
}
