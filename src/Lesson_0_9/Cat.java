package Lesson_0_9;

public class Cat {
	String name;
	int paws;
	
	// ��� ���� �������������, �� ����� ������� ��� �����������
	{
		String name= "suslo";
		int paws = "4";
	}
	
	Cat(){
		getInfo();
	}
	
	Cat(String n, int p){
		name = n;
		paws= p;
	}
	
	void setName(String n){
		name = n;
	}
	
	
	// overload, 
//	��������� - �������� � ����� ����������
	
	
	void setPaws(){
		paws = 3;
	}
	
	void setPaws(int p){
		paws = p;
	}
	
	void setPaws(double e){
		paws = e;
	}
	
	void setPaws(int p, double a){
		paws = p;
	}
	
	
	
	void getInfo(){
		System.out.println("Name: "+name+" Paws: "+paws);
	}
}
