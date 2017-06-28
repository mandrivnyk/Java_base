package lesson_2;

public class Frame_25_first_method_of_tank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("a1 = "+getQuadrant("a", "1"));
		System.out.println("a2 = "+getQuadrant("a", "2"));
		System.out.println("b2 = "+getQuadrant("b", "2"));
		System.out.println("i9 = "+getQuadrant("i", "9"));
	}
/**
 * - TANKS 
 */
	public static String getQuadrant(String v, String h){		
		String VisyY = "abcdefghi";
		int y = VisyY.indexOf(v) * 64;
		int x = (Integer.valueOf(h)-1)*64;
		return x+"_"+y;		 
	}
	

}
