package project_game;

import java.awt.Image;
import java.awt.Toolkit;





public class Tank extends FigureMovable{
	private int bullets;
	private int score;


	Tank(int x, int y) {
		super(x, y);
		
		bullets = 1000;
		score = 0;
		direction =  Direction.RIGHT;
		img = Toolkit.getDefaultToolkit().getImage("src/images/tankRight.png");
	}

	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}

	public void hitting() {
		setScore(getScore()+1);
	}
	
	public void shoot(){
		setBullets(getBullets() - 1);
	}
	
	public int getBullets() {
		return bullets;
	}

	public void setBullets(int bullets) {
		this.bullets = bullets;
	}

	public  Tank.Direction getDirection(){
		return direction;
	}
	
	@Override
	public Image getImg(){
		
		switch(direction){
		case LEFT: 
			img = Toolkit.getDefaultToolkit().getImage("src/images/tankLeft.png");
			break;
		case UP: 
			img = Toolkit.getDefaultToolkit().getImage("src/images/tankUp.png");
			break;
		case RIGHT: 
			img = Toolkit.getDefaultToolkit().getImage("src/images/tankRight.png");
			break;
		case DOWN: 
			img = Toolkit.getDefaultToolkit().getImage("src/images/tankDown.png");
			break;
		default:
			break;
		}
		
		return img;
	}



	@Override
	public String getInfo(){
		return super.getInfo()+" bullets: "+getBullets()+" score: "+getScore();
	}





	
	

}
