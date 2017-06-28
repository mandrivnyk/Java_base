package Lesson_0_10;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] many = new Car[3];
		System.out.println(many.toString());
		Car car = new Car(new Engine(2.3, "A95"), new Wheels("Fulda"), "Audi", "Camry");
		car.getInfo();
		
		
	}

}
