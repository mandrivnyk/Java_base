package Lesson_0_12;

public class DogM {

	public static void main(String[] args) throws CloneNotSupportedException {
		Owner owner=new Owner();
		Dog dog=new Dog(owner);
		Dog dog2=null;
		String str="Hello";
		//System.out.println(dog.equals(new Cat()));
		//dog2=(Dog) dog.clone();
		dog2=new Dog(dog);
		dog.owner.name="Max";
		System.out.println(dog);
		System.out.println(dog2);
		//str.e
		//System.out.println(str);
	}

}
