package lesson_2;

public class Frame_21_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min(11,2004,300));
	}
	public static int min(int a, int b, int c){		
		
		if(a<b){
			if(a<c){
				return a;
			}
		}
		else if(b<a){
			if(b<c){
				return b;
			}
		}
		else if(c<a){
			if(c<b){
				return c;
			}
		}
		
		return -1;
			
	} 

}