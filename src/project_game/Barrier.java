package project_game;

public abstract class Barrier  extends Figure{
	
	Barrier(int x, int y){
		super(x,y);
	}
	
	public void damage(){
		health = health - 50;
	}
}
