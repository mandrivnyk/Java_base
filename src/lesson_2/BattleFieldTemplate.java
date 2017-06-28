package lesson_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BattleFieldTemplate extends JPanel {

	boolean COLORDED_MODE = true;
	
	//int tankX = 0;
	//int tankY = 0;
	
	long speed = 225;
	Tank tank = new Tank(0,0);
	

	void runTheGame() throws Exception {
		
		
		while(true){
			int tankX = 5 + tank.getX();
			tank.setX(tankX);
			//tankY +=5;
			
			System.out.println(tankX);
			repaint();
			Thread.sleep(speed);
		}
	}
	
	void move(int direction) {
	}

	
	final int BF_WIDTH = 576;
	final int BF_HEIGHT = 576;
	
	public static void main(String[] args) throws Exception {
		BattleFieldTemplate bf = new BattleFieldTemplate();
		bf.runTheGame();
	}

	public BattleFieldTemplate() throws Exception {
		EventQueue.invokeLater(() -> {
			JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
			frame.setLocation(500, 150);
			frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.getContentPane().add(this);
			frame.pack();
			frame.setVisible(true);
		});
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}
		
		g.setColor(new Color(255, 0, 0));
		g.fillRect(tank.getX(), tank.getY(), 64, 64);
		
	}
}
