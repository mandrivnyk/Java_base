package Lesson_0_16;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

import com.sun.istack.internal.logging.Logger;

public class Cat{
	int age;
	String name;
	int[] a = new int[1000];
	
//	Cat(int age){
//		this.age = age;
//	}
	
	//-- 
	
	@Override
	protected void finalize(){
		System.out.println("Garbage");
	}

//	@Override
//	public int compareTo(Cat o) {
//		
//		// TODO Auto-generated method stub
//		return 1;
//	}
//	
//	public void some(int i) throws ArithmeticException {
//		
//		System.out.println(i/0);
//		
//	}

}
