package Lesson_0_3;

public class Some {
	// инициализация переменных по умолчанию
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	
	void getVars(){
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("e = "+e);
		System.out.println("f = "+f);
		System.out.println("g = "+g);
		System.out.println("h = "+h);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Some().getVars(); 
		
		int aa = 10;
		int bb = 0;
		// разница между && и 
		if(bb !=0 & (aa/bb>5)){
			System.out.println("wwwwwww");
			
		}
		
		
	}

}
