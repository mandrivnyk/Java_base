package project_game;

import java.util.ArrayList;

public class BulletsInGame {
	private ArrayList<Bullet> bullets;
	
	
	public BulletsInGame() {
		// TODO Auto-generated constructor stub
		bullets = new ArrayList<Bullet>();
		
	}
	public ArrayList<Bullet> getBullets() {
		return bullets;
	}

	public void setBullet(Bullet  bullet) {
		this.bullets.add(bullet);
	}
	
	public void getInfo(){
		System.out.println("");
	}
}
