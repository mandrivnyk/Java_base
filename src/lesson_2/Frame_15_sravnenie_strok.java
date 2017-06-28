package lesson_2;

public class Frame_15_sravnenie_strok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "a";
		String b = "b";
		String c = "a";
		String d = new String("a");
		if(a == c )
			System.out.println("a == c");
		
		if(a == d )
			System.out.println("a == d");
		if(a.equals(d))
			System.out.println("a.equals(d)");
		
		if("I love you".equals("I love you"))
			System.out.println("'I love you'.equals('I love you')");

	}

}
