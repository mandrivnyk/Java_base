package Lesson_0_13_Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyWindow extends JFrame{
	MyWindow(){
		super("Infopulse v.1.1");
		JLabel label=new JLabel("Hello");
		JButton button=new JButton("SEND");
		JButton button1=new JButton("SEND");
		JButton button2=new JButton("SEND");
		JButton button3=new JButton("SEND");
		JButton button4=new JButton("SEND");
		JButton button5=new JButton("SEND");
		JPanel panel=new JPanel();
		//panel.setLayout(new FlowLayout());
		//panel.setLayout(new GridLayout(2,3,10,15));
		panel.setLayout(null);
		button.setLocation(50, 50);
		button.setSize(75, 45);
		button1.setLocation(125, 95);
		button1.setSize(75, 45);
		panel.add(button);
		panel.add(button1);
		/*
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		*/
		setContentPane(panel);
		//add(button,BorderLayout.NORTH);
		//add(label,BorderLayout.SOUTH);
		setSize(400,400);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
