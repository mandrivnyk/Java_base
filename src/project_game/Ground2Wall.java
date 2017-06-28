package project_game;

import java.awt.Image;
import java.awt.Toolkit;

public class Ground2Wall extends Barrier {

	public Ground2Wall(int x, int y) {
		// TODO Auto-generated constructor stub
		super(x,y);
		
		img = Toolkit.getDefaultToolkit().getImage("src/images/Ground2WallUp.png");
	}
	
	@Override
	public Image getImg(){
		if(getHealth() == 100){
			img = Toolkit.getDefaultToolkit().getImage("src/images/Ground2WallUp.png");
		} else {
			img = Toolkit.getDefaultToolkit().getImage("src/images/Ground2WallUpM50.png");
			}
		return img; 
	};
}
