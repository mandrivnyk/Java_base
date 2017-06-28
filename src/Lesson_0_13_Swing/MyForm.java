package Lesson_0_13_Swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyForm extends JFrame {
	JButton button;
	JLabel text;
	JTextField field;
	
	MyForm() {
		super("Demo action v1.0");
		button= new JButton("SEND");
		field=new JTextField();
		text = new JLabel("enter Cat age");	
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		panel.add(field);
		panel.add(button);
		panel.add(text);	
		setContentPane(panel);
		setSize(400, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListeners();
	}
	private void initListeners() {
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int age=Integer.parseInt(field.getText());
				Cat cat=new Cat(age);
				text.setText(cat.toString());			
			}});
	}
}
