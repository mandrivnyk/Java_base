package Lesson_0_16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class DogMain {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
//		File file = new File("C:/Log/dog.xml");
//		Scanner in = new Scanner(file);
//		Dog dog = new Dog();
//		while(in.hasNextLine()){
//			String currLine = in.nextLine();
//			//in.nextLine()
//			if(currLine.toLowerCase().contains("name"))
//			{
//				System.out.println(currLine);
//				 Matcher matcher = Pattern.compile("<name>(.+?)</name>").matcher(currLine);
//				    while (matcher.find()) {
//				     //   System.out.println();
//				    	
//				    	dog.setName(matcher.group(1));
//				    }
//			}
//		}
//		
//		System.out.println(dog.name);
		
		
		// запись 
		XStream xs = new XStream(new StaxDriver());
		Dog dog = new Dog();
		
		try {
			FileOutputStream fs = new FileOutputStream("C:/Log/dogStream1.xml");
			xs.toXML(dog, fs);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		
		// чтение
		
		xs = new XStream(new DomDriver());
		Dog e = new Dog();
		
		try {
			
			FileInputStream fis = new FileInputStream("C:/Log/dogStream.xml");
			xs.fromXML(fis, e);
			System.out.println(e.getName());
			
		}
		catch (FileNotFoundException ex){
			ex.printStackTrace();
		}
		
		
		

	}
}
