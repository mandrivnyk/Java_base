package lesson_2;

public class Frame_17_sovershennoletie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oldEnough(121));
		System.out.println(oldEnough(1));
		System.out.println(oldEnough(12));
		System.out.println(oldEnough(21));

	}
	public static boolean oldEnough(int age){
		if(age >=21)
			return true;
		
		return false;					
	}

}
