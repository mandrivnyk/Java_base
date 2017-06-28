package Lesson_0_17_POTOKI;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CatMainInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatOwner owner = new CatOwner("Kolya");
		Cat cat = new Cat("Bublik", 10, owner);
		System.out.println("owner cat: "+cat.catowner);
		
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("C:/Log/cat.ser")));
			oos.writeObject(cat);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("C:/Log/cat.ser")));
					
					//new ObjectInputStream(new BufferedInputStream(new FileInputStream("C:/Log/cat.ser")));
			Cat cloneCat = (Cat) ois.readObject();
			ois.close();
			cat.name = "Krevetko";
			System.out.println(cloneCat.name);
			System.out.println( "owner catClone: "+cloneCat.catowner);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
