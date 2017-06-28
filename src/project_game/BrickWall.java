package project_game;

import java.awt.Image;
import java.awt.Toolkit;

public class BrickWall extends Barrier{

	public BrickWall(int x, int y) {
		// TODO Auto-generated constructor stub
		super(x,y);
		
		img = Toolkit.getDefaultToolkit().getImage("src/images/brickWallUp.png");
	}
	
	@Override
	public Image getImg(){
		if(getHealth() == 100){
			img = Toolkit.getDefaultToolkit().getImage("src/images/brickWallUp.png");
		} else {
			img = Toolkit.getDefaultToolkit().getImage("src/images/brickWallUpM50.png");
			}
		return img; 
	};
}
