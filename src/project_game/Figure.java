package project_game;

import java.awt.Image;

public abstract class Figure {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected int health;
	protected Image img;
	
	
	Figure(int x, int y){
		
		health = 100;
		width = 64;
		height = 64;

		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Image getImg(){
		return img; 
	};
	
	
}
