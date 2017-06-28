package Lesson_0_16;

public class ExceptionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
//		int g = 1;
//		int[] arr = {1,2,3}; 
//		arr[4] = 5 + arr[5];
//		try{
//			//System.out.println(10/0);
//			arr[4] = 5 + arr[5];
//			
//		}catch(ArithmeticException e){
//			System.out.println("Div by 0");
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("index out of bounds");
//		}finally{
//			System.out.println("all the time");
//		}
//		try {
//			throw new Exception();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		try {
			Cat cat1 = new Cat(5);
			cat1.some(5);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("in catch");
		}
		
		System.out.println("End");
	}

}
