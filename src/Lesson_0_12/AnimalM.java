package Lesson_0_12;

public class AnimalM {

	public static void main(String[] args) {
		//Animal animal=new Animal();
		Animal[] animals={new Cat(),new Snake()};
		for(Animal a: animals){
			a.getVoice();
		}

	}

}
