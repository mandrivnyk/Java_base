package Lesson_0_13_Swing;

public class Cat implements Voice,Tale{
	int age;
	Cat(int age){
		this.age=age;
	}
	
	public String toString(){
		return "Can age is "+age;
	}
	@Override
	public void getTale() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getVoice() {
		// TODO Auto-generated method stub
		
	}

}
