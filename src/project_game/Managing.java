package project_game;

import java.awt.event.KeyEvent;

import project_game.FigureMovable.Direction;

public class Managing {
	Tank tank;
	BulletsInGame bulletsInGame;

	public Managing(Tank tank, BulletsInGame bullets ) {
		// TODO Auto-generated constructor stub
		this.tank = tank;
		this.bulletsInGame = bullets;
	}
	


	public  void keyHandler(KeyEvent e){
		System.out.println(e.getKeyCode());
		switch(e.getKeyCode()){
			case 32: // space = fire 
				if(tank.getBullets() > 0)
				{
					tank.shoot();
					bulletsInGame.setBullet(new Bullet(tank));
				}	
				break;
			case 37: // turn left
				if(tank.direction != Direction.LEFT){
					tank.direction = Direction.LEFT;
				}
				else {
					tank.setMovingNow(true);
				}
				break;
			case 38: //up
				if(tank.direction != Direction.UP){
					tank.direction = Direction.UP;
				}
				else {
					tank.setMovingNow(true);
				}
				break;
			case 39: // right
				if(tank.direction != Direction.RIGHT){
					tank.direction = Direction.RIGHT;
				}
				else {
					tank.setMovingNow(true);
				}				
				break;
			case 40: // down
				if(tank.direction != Direction.DOWN){
					tank.direction = Direction.DOWN;
				}
				else {
					tank.setMovingNow(true);
				}
				break;
			default:
				break;
		}
	}

	
}
