package project_game;

import java.awt.Image;
import java.awt.Toolkit;

public class GroundWall extends Barrier{

	public GroundWall(int x, int y) {
		// TODO Auto-generated constructor stub
		super(x,y);
		
		img = Toolkit.getDefaultToolkit().getImage("src/images/GroundWallUp.png");
	}
	
	@Override
	public Image getImg(){
		if(getHealth() == 100){
			img = Toolkit.getDefaultToolkit().getImage("src/images/GroundWallUp.png");
		} else {
			img = Toolkit.getDefaultToolkit().getImage("src/images/GroundWallUpM50.png");
			}
		return img; 
	};
}
