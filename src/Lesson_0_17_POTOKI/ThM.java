package Lesson_0_17_POTOKI;

public class ThM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CatTh cat = new CatTh("Bublik");
		Thread t1 = new Thread(cat);
		t1.start();
		
		new Rat("krisa");
		
		System.out.println(Thread.activeCount());
	}

}
