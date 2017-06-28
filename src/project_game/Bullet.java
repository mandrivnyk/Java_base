package project_game;

import java.awt.Image;
import java.awt.Toolkit;



public class Bullet extends FigureMovable{

	private Tank owner;
	
	Bullet(Tank fm) {		
		super(fm.getX(), fm.getY());
		this.owner = fm;
		this.direction =  fm.getDirection();
		img = Toolkit.getDefaultToolkit().getImage("src/images/bulletLeftRight.png");
	}
	
	public Tank getOwner() {
		return owner;
	}

	public void setOwner(Tank owner) {
		this.owner = owner;
	}
	
	@Override
	public Image getImg(){
		
		switch(direction){
		case LEFT: 
		case RIGHT: 	
			img = Toolkit.getDefaultToolkit().getImage("src/images/bulletLeftRight.png");
			break;
		case UP: 
		case DOWN:	
			img = Toolkit.getDefaultToolkit().getImage("src/images/bulletUpDown.png");
			break;
		default:
			break;
		}
		
		return img;
	}
}
