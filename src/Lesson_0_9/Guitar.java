package Lesson_0_9;

public class Guitar {
	private String sound;
	
	Guitar(String voice, String  mode){
		new Combo(voice, mode);
		System.out.println("Sound is:"+sound);
	}
	
	class Combo {
		String[] mode = {"normal", "override"};
		
		Combo(String s, String m){
			
			if(m.equals("normal")){
				sound = s.toLowerCase();
			} else {
				sound = s.toUpperCase();
			}
			
		}
		
	}
}
