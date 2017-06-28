package Lesson_0_13_Swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Act extends JFrame {
	JButton dep;
	JLabel text;
	JButton arr;
	JLabel counter;
	int count = 0;

	Act() {
		super("Demo action v1.0");
		dep = new JButton("Departured");
		arr = new JButton("Arrived");
		text = new JLabel("Crows on the tree: ");
		counter = new JLabel("" + count);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		panel.add(text);
		panel.add(counter);
		panel.add(dep);
		panel.add(arr);
		setContentPane(panel);
		setSize(400, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListeners();
	}

	private void initListeners() {
		dep.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				departure();
			}

		});
		arr.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				arrive();
			}
		});
	}
	private void departure() {
		if (count != 0) {
			count--;
			counter.setText("" + count);
		}
	}
	private void arrive() {
		count++;
		counter.setText("" + count);
	}
}
