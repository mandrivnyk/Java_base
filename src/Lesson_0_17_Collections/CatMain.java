package Lesson_0_17_Collections;

import java.util.TreeSet;

public class CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Cat> ts = new TreeSet<Cat>(new CatComparator());
		ts.add(new Cat(50, "Cat1"));
		ts.add(new Cat(60, "Cat2"));
		ts.add(new Cat(70, "Cat3"));
		ts.comparator();
	}

}
