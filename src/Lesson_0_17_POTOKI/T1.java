package Lesson_0_17_POTOKI;

public class T1 implements Runnable{
	Res res;
	
	T1(Res res){
		this.res = res;
		new Thread(this).start();
	}
}
