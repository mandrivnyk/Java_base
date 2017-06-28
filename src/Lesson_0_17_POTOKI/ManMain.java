package Lesson_0_17_POTOKI;

public class ManMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man man1 = new Man("Petya");
		Man man2 = new Man("Vasya");
		
		Thread t1 = new Thread(man1);
		
		Thread t2 = new Thread(man2);
		t1.start();
		t2.start();
	}

}
