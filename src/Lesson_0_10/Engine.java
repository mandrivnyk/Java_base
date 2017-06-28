package Lesson_0_10;

public class Engine {
	double volume;
	String fuel;
	
	public Engine(double volume, String fuel ) {
		this.setVolume(volume);
		this.setFuel(fuel);
	}
	
	void setVolume(double volume){
		this.volume = volume;
	}
	
	void setFuel(String fuel){
		this.fuel = fuel;
	}
	
	double getVolume(){
		return volume;
	}
	
	String getFuel(){
		return fuel;
	}
	
}
