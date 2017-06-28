package Lesson_0_8_HW_figures;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Lesson_0_15_HW.DBWorker;



public class FigureSwing extends JFrame {
	private JButton button;
	private JButton button2;
	private JButton button3;
	private JLabel text;
	private JLabel text2;
	private JLabel text3;
	private JLabel text4;
	private JTextField field;
	private JTextField field2;
	private JPanel panel;
	DBWorker dbworker;
	
	FigureSwing(){
		super("Figures");
		button= new JButton("SEND");
		field=new JTextField();
		text = new JLabel("To create a figure please type \n from 1 to 3: \n 1 - circle, \n 2 - square, \n 3 - triangle");	
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 1));
		panel.add(text);
		panel.add(field);
		panel.add(button);
			
		setContentPane(panel);
		setSize(800, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListeners();
		

		
		
	}
	
	private void initListeners() {
		
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
	
				int yourChoose=Integer.parseInt(field.getText());
				button2 = new JButton("SEND");
				field2 =new JTextField();
				
				switch (yourChoose) {
					case 1:   //  -----   Circle -------
						panel.removeAll();
						text.setText("You typed: "+yourChoose);
						
						text2 = new JLabel("Please enter a value of radius:");	
						button2.addActionListener(e -> {
							
							double radius = 0;				
							
							radius=Double.parseDouble(field2.getText());
							String t2 = "You typed: "+radius;
							text2.setText(t2);
							if(radius > 0) {
								Color color = new Color();
								Circle newCircle =  new Circle(color.getRandomColour());	
								newCircle.setArea(radius);
								newCircle.setLength(radius);
								try {
									newCircle.dbworker.setFigure(newCircle.getName(), newCircle.getColour(), newCircle.getLength(), newCircle.getArea());
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								text3 =new JLabel(newCircle.getInfo(radius));
								panel.add(new JLabel("Output: "));	
								panel.add(text3);	
						    }
						    else {
						    	text2.setText(t2+" You must enter a valid number! Try again: ");
						    }
						});
						panel.add(text2);	
						panel.add(field2);
						panel.add(button2);						
						setContentPane(panel);
						break;
						
					case 2:		//  -----   Square -------
							panel.removeAll();
							text.setText("You typed: "+yourChoose);
							
							text2 = new JLabel("Please enter a value of side:");	
							button2.addActionListener(e -> {
								
								double side = 0;				
								
								side = Double.parseDouble(field2.getText());
								String t2 = "You typed: "+side;
								text2.setText(t2);
								if(side > 0) {
									Color color = new Color();
									Square newSquare =  new Square(color.getRandomColour());	
									newSquare.setArea(side);
									newSquare.setLength(side);    			    
									try {
										newSquare.dbworker.setFigure(newSquare.getName(), newSquare.getColour(), newSquare.getLength(), newSquare.getArea());
									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									text3 =new JLabel(newSquare.getInfo(side));
									panel.add(new JLabel("Output: "));	
									panel.add(text3);	
								}
								else {
									text2.setText(t2+" You must enter a valid number! Try again: ");
								}
							});
							panel.add(text2);	
							panel.add(field2);
							panel.add(button2);
							
							setContentPane(panel);
							break;
							
					case 3:		//  -----   Triangle -------
						panel.removeAll();
						text.setText("You typed: "+yourChoose);
						
						text2 = new JLabel("Please enter a value of side:");	
						button2.addActionListener(e -> {							
							double side = 0;
							side = Double.parseDouble(field2.getText());
							String t2 = "You typed: "+side;
							text2.setText(t2);
							if(side > 0) {
								Color color = new Color();
								Triangle newTriangle =  new Triangle(color.getRandomColour());	
								newTriangle.setArea(side);
								newTriangle.setLength(side);    			    
								try {
									newTriangle.dbworker.setFigure(newTriangle.getName(), newTriangle.getColour(), newTriangle.getLength(), newTriangle.getArea());
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								text3 =new JLabel(newTriangle.getInfo(side));
								panel.add(new JLabel("Output: "));	
								panel.add(text3);	
							}
							else {
								text2.setText(t2+" You must enter a valid number! Try again: ");
							}
						});
						panel.add(text2);	
						panel.add(field2);
						panel.add(button2);
						
						setContentPane(panel);
						break;
					default:
						text.setText("You must enter a valid number! Try again: ");
						break;
					}
				
				button3 = new JButton("Show all records in figures");
				button3.addActionListener(e -> { 
//					text4 = new JLabel("test");
//					panel.add(text4);
//					
//					System.out.println("test1111111111");
					try {
						dbworker = new DBWorker("mysql");
						text4 = new JLabel(dbworker.getFigures());
						panel.add(text4);
						
					} catch (InstantiationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IllegalAccessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				});
				panel.add(button3);
				setContentPane(panel);
			}});
	}
}
