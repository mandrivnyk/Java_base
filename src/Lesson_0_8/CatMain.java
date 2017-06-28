package Lesson_0_8;

public class CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatBox smallBox;
		smallBox = new CatBox(); // адрес €чейки пам€ти где находитс€ объект
		System.out.println("h:"+smallBox.height); // по умочанию значени€ в 0, так как тип int по умолчанию в 0 ставитс€
 		System.out.println("w:"+smallBox.width);
		System.out.println("l:"+smallBox.length);
		
		smallBox.setLength(55);
		
//		smallBox.width = 100;
		smallBox.getInfo();		
		System.out.println("L  = "+smallBox.getLength());
		
		
	
		
		
		
	}

}
