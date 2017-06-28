package Lesson_0_17_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm= new HashMap<String, String>();
		hm.put("name", "Pupkin");
		hm.put("address", "Kiev");
		System.out.println(hm.get("address"));
		Set<String> set = hm.keySet();
		Iterator<String> it =set.iterator();
		while(it.hasNext()){
			System.out.println(hm.get(it.next()));
		}
	}
}
