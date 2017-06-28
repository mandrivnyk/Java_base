package Lesson_0_18;

public class AnyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassThatAnyType<Integer> ob = new ClassThatAnyType<Integer>(new Integer(5));
		ob.showType();
	}

}
