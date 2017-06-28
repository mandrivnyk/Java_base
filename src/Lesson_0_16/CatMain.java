package Lesson_0_16;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.FileHandler;
import java.util.logging.Level;

import com.sun.istack.internal.logging.Logger;

public class CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Queue<Cat> cats = new PriorityQueue <Cat>();
//		cats.add(new Cat(1));
//		cats.add(new Cat(2));
//		cats.add(new Cat(3));
//		cats.add(new Cat(4));
//		cats.add(new Cat(5));
//		System.out.println(cats.peek());
//		System.out.println(cats.poll());
////		cats.clear();
//		cats.
//		System.out.println(cats.toArray().toString());
		
//		Cat cat =  new Cat();
//		for(int i =0; i<100000; i++){
//			//System.out.println("Garbage");
//			cat =  new Cat();
//		}
		
		Logger logger = Logger.getLogger(CatMain.class.getSimpleName(), null);
		try {
			FileHandler fh = new FileHandler("C:/Adware/log.xml");
//			logger.set
			((Object) logger).addHandler(fh);
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		try {
			System.out.println(5/0);
		} catch (ArithmeticException e){
			logger.log(Level.SEVERE, e.getMessage());
		}
	}

}
