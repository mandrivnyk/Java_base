package Lesson_0_8;

public class CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatBox smallBox;
		smallBox = new CatBox(); // ����� ������ ������ ��� ��������� ������
		System.out.println("h:"+smallBox.height); // �� �������� �������� � 0, ��� ��� ��� int �� ��������� � 0 ��������
 		System.out.println("w:"+smallBox.width);
		System.out.println("l:"+smallBox.length);
		
		smallBox.setLength(55);
		
//		smallBox.width = 100;
		smallBox.getInfo();		
		System.out.println("L  = "+smallBox.getLength());
		
		
	
		
		
		
	}

}
