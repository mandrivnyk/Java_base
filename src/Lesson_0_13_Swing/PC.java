package Lesson_0_13_Swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PC extends JFrame {
	JButton b1=new JButton("to panel #2");
	JLabel l1=new JLabel("Panel #1");
	JButton b2=new JButton("to panel #1");
	JLabel l2=new JLabel("Panel #2");;
	JPanel panel1;
	JPanel panel2;

	PC() {
		super("Demo action v1.0");
		setContentPane(getPanel1());
		setSize(400, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListeners();
	}

	private void initListeners() {
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel1.setVisible(false);
				setContentPane(getPanel2());
				panel2.setVisible(true);
			}});
		b2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel2.setVisible(false);
				setContentPane(getPanel1());
				panel1.setVisible(true);
			}});
	}

	private JPanel getPanel2() {
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 2));
		panel2.add(l2);
		panel2.add(b2);
		return panel2;
	}
	private JPanel getPanel1() {
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1, 2));
		panel1.add(l1);
		panel1.add(b1);
		return panel1;
	}

}
