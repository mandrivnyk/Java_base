package Lesson_0_17_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	
	HashSet hs;
	LinkedHashSet lhs;
	TreeSet ts;
	
	public SetDemo(){
		
		hs = new HashSet<Integer>();
		lhs = new LinkedHashSet<Integer>();
		ts = new TreeSet<Integer>();
		
		for(int i=0; i<10; i++){
			Integer num = (int)(Math.random()*100);
			System.out.println(num);
			hs.add(num);
			lhs.add(num);
			ts.add(num);
			
		}
		
	}
	
	public void getSets(){
		System.out.println("HS:"+hs);
		System.out.println("LHS:"+lhs);
		System.out.println("TS:"+ts);
	}
	
	public void lhs(){
		Iterator<Integer> it = lhs.iterator();
		//while()
		
		
	}
	
	void hs(){
		hs.removeAll(lhs);
	}
	
	void ss(){
		hs.retainAll(lhs);
	}
	
	void mm(){
		hs.addAll(ts);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetDemo sd = new SetDemo();	
		sd.getSets();
		sd.mm();
	}
		

}
