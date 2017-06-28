package project_game;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;





public class BattleFieldTemplate extends JPanel {

	boolean COLORDED_MODE = true;
	int bfWidth;
	int bfHeight;
	Limitations limit;
	BulletsInGame bulletsInGame;
	Managing managing;
	long speed = 300;
	final int STEP_SIZE = 64;
	Tank tank;
	JFrame frame;
	JPanel panelOuter;
	JLabel summarize;
	JPanel panelText;
	
	public BattleFieldTemplate(JFrame frame, int bfWidth, int bfHeight, Tank tank) throws Exception {
		this.bfWidth = bfWidth;
		this.bfHeight = bfHeight;
		
		limit = new Limitations(this.bfWidth, this.bfHeight, STEP_SIZE);
		limit.getInfo();
		
		bulletsInGame = new BulletsInGame();
		
		managing = new Managing(tank, bulletsInGame);
		
		setFrame(frame);
		
		EventQueue.invokeLater(() -> {
			
			this.tank = tank;
			this.setPreferredSize(new Dimension(this.bfWidth, this.bfHeight));
			frame.setLocation(500, 150);	
			frame.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			frame.setMinimumSize(new Dimension(this.bfWidth + 322, this.bfHeight+100));
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			//frame.getContentPane().setLayout(new GridLayout(1, 2));
			
			panelText = new JPanel();
			panelText.setPreferredSize(new Dimension(this.bfWidth + 322, 20));
			summarize = new JLabel("summarize:"+tank.getInfo());
			summarize.setHorizontalAlignment(JLabel.LEFT);
			panelText.add(summarize);
			
			
			JPanel panelOuter = new JPanel();
			panelOuter.setPreferredSize(new Dimension(this.bfWidth + 322, this.bfHeight));
			panelOuter.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			panelOuter.add(panelText);
			panelOuter.add(this);
			panelOuter.setLocation(0, 0);	
			
			frame.getContentPane().add(panelOuter);
			frame.pack();
			frame.setVisible(true);	
			frame.addKeyListener(new KeyListener() {
				@Override
			    public void keyPressed(KeyEvent e) {
			    	System.out.println("key pressed");
			    	managing.keyHandler(e);
			    }

				@Override
				public void keyReleased(KeyEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyTyped(KeyEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			});	
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int i = 0;
		Color cc;
		for (int v = 0; v <(int) bfWidth/STEP_SIZE; v++) {
			for (int h = 0; h < (int) bfHeight/STEP_SIZE; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(139, 139, 139);
					} else {
						cc = new Color(139, 139, 139);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * STEP_SIZE, v * STEP_SIZE, STEP_SIZE, STEP_SIZE);
			}
		}
		
		g.drawImage(tank.getImg(), tank.getX()*tank.getWidth(), tank.getY()*tank.getHeight(), this);
		g.finalize();
		
		
		System.out.println(" bullets in Game: "+bulletsInGame.getBullets().size());
		if(bulletsInGame.getBullets().size() > 0){
			for(Bullet bullet : bulletsInGame.getBullets()){
				g.drawImage(bullet.getImg(), bullet.getX()*bullet.getWidth(), bullet.getY()*bullet.getHeight(), this);
				g.finalize();
			}

		}
		
		ArrayList<Barrier> wall = limit.getWall();
		for (Barrier el : wall) {
			g.drawImage(el.getImg(), el.getX()*el.getWidth(), el.getY()*el.getHeight(), this);
			g.finalize();
		}
	}
	

	public JFrame getFrame() {
		return frame;
	}
	
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public int getBfWidth() {
		return bfWidth;
	}

	public int getBfHeight() {
		return bfHeight;
	}

	void runTheGame() throws Exception {
		
		while(true){
			
			if(tank != null) {
				System.out.println("limit: "+limit.getPermit(tank));

				if(tank.isMovingNow() && limit.getPermit(tank)){
					tank.moveOneStep();
				}
				
				tank.setMovingNow(false);
				
				if(bulletsInGame.getBullets().size() > 0){	
					 for(Iterator<Bullet> i = bulletsInGame.getBullets().iterator(); i.hasNext();) {
						 Bullet bullet = i.next();
						 if(limit.getPermit(bullet)){
								bullet.moveOneStep();
							} else {
								limit.crash(bullet);
								i.remove();
								limit.clearLimitMap();								
							}
					 }
				}
				
				if(summarize != null) {
					summarize.setText("TANK "+tank.getInfo());
				}
				
				System.out.println("Tank: "+tank.getInfo());
				repaint();
				Thread.sleep(speed);
			}
		}	
	}
	
}



