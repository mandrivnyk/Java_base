package lesson_2;

public class Frame_23_spring_waiting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("isSpring(1) = "+isSpring(1));
	System.out.println("isSpring(2) = "+isSpring(2));
	System.out.println("isSpring(3) = "+isSpring(3));
	System.out.println("isSpring(5) = "+isSpring(5));
	System.out.println("isSpring(13) = "+isSpring(13));
	
	}
	
	public static int isSpring(int month){
		if(month>12)
			return -1;
		else if(month>2 && month <=5)
			return 1;
		return 0;
		
	}

}
