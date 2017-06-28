package Lesson_0_11;

public class Honda extends Car{
	String gbo;
	Honda(String mark,String model){
		super(mark,model);
		gbo="IV Gen";
		//mark="Honda";
		//model="CR-V";
	}
	@Override
	String getInfo(){
		return "Mark: "+mark+"; Model: "+model+"; "+";gbo: "+gbo;
	}
}
