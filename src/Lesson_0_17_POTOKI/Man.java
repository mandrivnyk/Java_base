package Lesson_0_17_POTOKI;

public class Man  implements Runnable{
	String name;
	int shagi=0;
	
	Man(String name){
		this.name = name;
		
	}
	
	public void printShagi(){
		System.out.print ("Name: "+getName()+": ");
		//System.out.println(" "+getShagi());
		for(int i=0; i<getShagi();i++){
			System.out.print("-");
		}
		System.out.println("");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getShagi() {
		return shagi;
	}
	public void setShagi(int shagi) {
		this.shagi = shagi;
	}
	
	public void randomShagiCount(){
		int shagiRandom = (int) (Math.random()*4);
		//System.out.println(" "+shagiRandom);
		setShagi(getShagi()+shagiRandom);
		printShagi();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(shagi <=20){
			randomShagiCount();	
			
		}
	}
}
