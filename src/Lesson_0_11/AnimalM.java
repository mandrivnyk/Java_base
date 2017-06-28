package Lesson_0_11;

public class AnimalM {

	public static void main(String[] args) {
		Animal animal=new Animal();
		Cat cat=new Cat();
		Dog dog=new Dog();
		Animal[] animals={animal, cat,dog};
		for(Animal a: animals){
			a.getVoice();
		}
		
		
	}

}
