package project_game;



public class  FigureMovable  extends Figure{



	protected Direction direction;
	
	public enum Direction {
		UP, DOWN, LEFT, RIGHT;
	};
	
	protected boolean movingNow;
	
	FigureMovable(int x, int y) {
		super(x, y);
		movingNow = false;
		
	}
	
	
	
	
	public boolean isMovingNow() {
		return movingNow;
	}




	public void setMovingNow(boolean movingNow) {
		this.movingNow = movingNow;
	}




	public Direction getDirection() {
		return direction;
	}


	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public  FigureMovable.Direction[] getDirections(){
		return Direction.values();
	}
	
	
	public void moveOneStep() {
		
		switch(direction){
		case LEFT: // turn left
			x -= 1;
			break;
		case UP: //ahead
			y -= 1;
			break;
		case RIGHT: // right
			x  += 1;
			break;
		case DOWN: // back
			y += 1;
			break;
		default:
			break;
		}
	}
	
	public int[] getNextXY(){
		int nextX = 0;
		int nextY = 0;
		
		switch(getDirection()){
		case LEFT: // turn left
			nextX = getX() - 1;
			nextY = getY();
			break;
		case RIGHT: // right
			nextX = getX() + 1;
			nextY = getY();
			break;
		case UP: //ahead
			nextX = getX();
			nextY = getY() - 1;
			break;
		case DOWN: // back
			nextX = getX();
			nextY = getY() + 1;
			break;
		default:
			break;
		} 
		return new int[]{nextX, nextY};		
	}
	
	public String getInfo(){
		return "info: X: "+getX()+" Y: "+getY()+" direction: "+getDirection()+" health: "+getHealth();
	}

}
