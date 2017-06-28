package Lesson_0_10;

public class Car {
	String brand; 
	String model;
	Engine engine;
	Wheels wheels;
	
	Car(Engine engine, Wheels wheels, String brand, String model){
		setEngine(engine);
		
		this.wheels = wheels;
		this.brand = brand;
		this.model = model;
	}
	
	
	void setBrand(String brand){
		this.brand = brand;
	}
	
	void setModel(String model){
		this.model = model;
	}
	
	void setWheels(Wheels wheels){
		this.wheels = wheels;
	}
	
	
	void setEngine(Engine engine){
		this.engine = engine;
	}
	
	String getBrand(){
		return brand;
	}
	
	String getModel(){
		return model;
	}	
	
	void getInfo(){
		System.out.println("Brand: "+brand+" Model: "+model+" engine volume:"+engine.getVolume()+"engine fuel:"+engine.getFuel()+" wheels brand: "+wheels.getBrend());
	}
}
