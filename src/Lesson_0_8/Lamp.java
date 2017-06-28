package Lesson_0_8;

public class Lamp {
	int brightness;
	boolean state = false;
	boolean intim;
	
	void setState(){
		state = state? false: true;
		
		if(state){
			brightness = 100;
		} else {
			brightness = 0;
		}
	}
	
	void setIntim(){
		state = true;
		brightness = 20;
		intim = true;
	}
	
	
	
	void setBrightness(int b){
		if(b == 0){
			state = false;
			brightness = 0;
		}
		
		if(b > 0 && b <= 100 ){
			state = true;
			brightness = b;
		}
	}
	
	boolean getState(){
		
		return state;
	}
	
	int getBrightness(){
		
		return brightness;
	}
	
	boolean getIntimState(){
		return intim;
	} 
	
	void getInfo(){
		System.out.println("Lamp is "+(state?"switched on":"switched off"));
		System.out.println("Brightness: "+brightness);
	}
	
	
	
}
