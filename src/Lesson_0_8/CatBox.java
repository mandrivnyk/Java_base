package Lesson_0_8;

public class CatBox {
	int width = 5;
	int height = 5;
	int length = 5;
	
	void setLength(int l){
		length = l;
	}
	
	void getInfo(){
		System.out.println("h:"+height); 
 		System.out.println("w:"+width);
		System.out.println("l:"+length);
	}
	
	int getLength(){
		
		return length;
	}
}
