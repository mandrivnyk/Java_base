package Lesson_0_17_POTOKI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

public class CatR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PrintWriter pw;
//		try {
//			pw = new PrintWriter(new File("C:/Log/DogCat.txt"));
//			pw.write("test");
//			pw.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
			RandomAccessFile raf = new RandomAccessFile(new File("C:/Log/DogCat.txt"), "r");
			int b;
			String res= "";
			//raf.seek();
			
			int i =0;
			while((b = raf.read())!=-1){
				res +=(char)b;
				//System.out.println((char)b);
				
				if(i == 8){
					raf.seek(8);
					System.out.println(res);
					i=0;
				}
				else {
					i++;
				}
				
			}
			//System.out.println(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
