package lesson_2;

public class Tank {
	private int color;
	private int x;
	private int y;
	
	
	Tank(int startX, int startY) {
		setX(startX);
		setY(startY);
		
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
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
	

}
