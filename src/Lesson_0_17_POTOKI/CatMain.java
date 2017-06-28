package Lesson_0_17_POTOKI;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatOwner owner = new CatOwner("Kolya");
		Cat cat = new Cat("Bublik", 10, owner);
		
		// использование сериализации на лету, работа с потоками 
 		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(baos);
			oos.writeObject(cat);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		try {
			ObjectInputStream ois = new ObjectInputStream(bais);
			Cat cloneCat = (Cat) ois.readObject();
			ois.close();
			cat.name = "Krevetko";
			System.out.println(cloneCat.name+" owner: "+cloneCat.catowner.getName());
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
