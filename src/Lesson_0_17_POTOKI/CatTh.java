package Lesson_0_17_POTOKI;

public class CatTh extends Thread{
	String name;
	Thread t;
	
	public CatTh(String name) {
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

	public String getCatName() {
		return name;
	}

	public void setCatName(String name) {
		this.name = name;
	}
}
