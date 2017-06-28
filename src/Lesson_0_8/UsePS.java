package Lesson_0_8;

public class UsePS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PowerSupply ps = new PowerSupply();		
		ps.getInfo(0);
		
		ps.usePowerSupply(220);
		ps.getInfo(220);
		
		ps.usePowerSupply(199);
		ps.getInfo(199);
		
		ps.usePowerSupply(251);
		ps.getInfo(251);
		
		ps.usePowerSupply(0);
		ps.getInfo(0);
	}

}
