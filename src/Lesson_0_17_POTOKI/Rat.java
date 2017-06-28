package Lesson_0_17_POTOKI;

public class Rat implements Runnable{
	String name;
	Thread t;
	
	public Rat(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		t = new Thread(this);
		t.start();
		
	}
	
	@Override
	public void run(){
		System.out.println("Therads");
		System.out.println("name : "+name);
	}

	public String getRatName() {
		return name;
	}

	public void setRatName(String name) {
		this.name = name;
	}
}
