package lesson_2;

public class Frame_8_overriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(square(5.5));
System.out.println(square(5099999555555555999l));
System.out.println(square(4.1));
System.out.println(square(500));
	}
	public static double square(double number){
		System.out.println("double square function");
		return number*number;
	}
	public static long square(long number){
		System.out.println("long square function");
		return number*number;
	}

	public static int square(int number){
		System.out.println("int square function");
		return number*number;
	}
}
