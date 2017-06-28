package Lesson_0_12;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;


public class TimerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ActionListener listener = new TimerPrinter();
		Timer t = new Timer(1000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
	    System.exit(0);
	}
	
	

}


class TimerPrinter implements ActionListener {
	public void actionPerformed(ActionEvent event){
		System.out.println("At the tone, the time is" + new Date());
		Toolkit.getDefaultToolkit().beep();
	}
}