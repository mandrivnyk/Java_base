package Lesson_0_18;

import java.time.DayOfWeek;

public class MyEnum {

	enum DayOfWek{MONDAY, TUESDAY}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek day = DayOfWeek.MONDAY;
		
		switch(day){
		case TUESDAY:
			System.out.println("Tu");
		}
		
		for(DayOfWeek d: DayOfWeek.values()){
			System.out.println();
		}
		
		System.out.println(DayOfWeek.valueOf("MM"));
	}

}
