package Lesson_0_10;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Tuzik", 2);
		Owner owner = new Owner("Yuriy");
		dog.addOwner(owner);
		dog.getInfo();
	}
}
