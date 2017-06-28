package Lesson_0_17_Collections;

public class Cat extends Animal{
	int age;
	String name;
	
	Cat(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public String getVoice(){
		return "Mya-Mya";
	}
	
	void getCat(){
		System.out.println("Name:"+name+"; age: "+age);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
