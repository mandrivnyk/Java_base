package Lesson_0_12;

import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		
		System.out.println(Arrays.toString(planets));
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		Arrays.sort(planets,(first, second)-> first.length()-second.length());
		System.out.println(Arrays.toString(planets));
		Timer timer = new Timer(1000, event-> 
			System.out.println("time is: "+ new Date()));
		timer.start();
		
		JOptionPane.showMessageDialog(null, "Quit program");
		System.exit(0);

	}

}
