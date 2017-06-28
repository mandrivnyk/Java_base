package lesson_2;

public class Frame_19_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min(11,-2004,300));
	}
	public static int min(int a, int b, int c){
		int minValue = a;
		if(b < minValue)
			minValue = b;
		if(c < minValue)
			minValue = c;
		
		return minValue;			
			
			
	} 

}
