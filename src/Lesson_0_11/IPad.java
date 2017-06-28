package Lesson_0_11;

public class IPad extends TabletPC{
	boolean gps;
	IPad(String cpu) {
		super(cpu);
		gps=true;
	}
	void getInfo(){
		System.out.println(cpu+"-"+gps);
	}
}
