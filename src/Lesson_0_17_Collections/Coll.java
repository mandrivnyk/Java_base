package Lesson_0_17_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Animal> al = new ArrayList<Animal>();
			
			al.add(new Cat());
			al.add(new Dog());
			
			for( int i=0; i<al.size(); i++){
				Object obj = al.get(i);
				System.out.println(obj);
			}
			
			for(Object a: al){
				if(a instanceof Animal)
				{
					
					System.out.println(((Animal) a).getVoice());
				}
			}
			
			Iterator<Animal> it = al.iterator();
			
			while(it.hasNext()){
				System.out.println(it.next());
			}
	}

}
