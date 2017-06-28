package project_game;

import java.util.ArrayList;

public class Limitations {
	
	int bfWidth;
	int bfHeight;
	Barrier[][] limitMap;
	int step_size;
	
	
	
	public Limitations(int bfWidth, int bfHeight, int step_size) {
		// TODO Auto-generated constructor stub
		this.bfWidth = bfWidth;
		this.bfHeight = bfHeight;
		this.step_size = step_size;
		
		setLimitMap();
		setGroundWallX(5);
		setGroundWallY(7);
		setBrickWallY(1);
		setGround2WallX(1);
	}
	
	public void setLimitMap(){
		limitMap =new Barrier[(int)(bfWidth/step_size)][(int)(bfHeight/step_size)];
	}
	

	

	public void setBrickWallY(int x){
		x = x-1;
		if( x <= limitMap[0].length){
			for(int y=0; y<limitMap.length; y++){
				if(limitMap[x][y] == null){
					limitMap[x][y] = new BrickWall(x, y);			
				}
				
			}
		}
	}
	
	public void setBrickWallX(int y){
		y = y-1;
		if( y <= limitMap.length){
			for(int x=0; x<limitMap[0].length; x++){
				if(limitMap[x][y] == null){
					limitMap[x][y] = new BrickWall(x, y);			
				}
				
			}
		}
	}
	
	
	
	public void setGroundWallY(int x){
		x = x-1;
		if( x <= limitMap[0].length){
			for(int y=0; y<limitMap.length; y++){
				if(limitMap[x][y] == null){
					limitMap[x][y] = new GroundWall(x, y);			
				}
				
			}
		}
	}
	
	public void setGroundWallX(int y){
		y = y-1;
		if( y <= limitMap.length){
			for(int x=0; x<limitMap[0].length; x++){
				if(limitMap[x][y] == null){
					limitMap[x][y] = new GroundWall(x, y);			
				}
				
			}
		}
	}
	
	public void setGround2WallX(int y){
		y = y-1;
		if( y <= limitMap.length){
			for(int x=0; x<limitMap[0].length; x++){
				if(limitMap[x][y] == null){
					limitMap[x][y] = new Ground2Wall(x, y);			
				}
				
			}
		}
	}

	
	public void clearLimitMap(){
		for(int y=0; y < limitMap.length; y++){
			for(int x = 0; x < limitMap[y].length; x++){
				if(limitMap[x][y] != null && limitMap[x][y].getHealth() == 0){
					
					limitMap[x][y] = null;
				}
			}
		}
	}
	

	public ArrayList<Barrier> getWall(){		
		ArrayList<Barrier> wall = new ArrayList<>();
		
		for(int y=0; y < limitMap.length; y++){
			for(int x = 0; x < limitMap[y].length; x++){
				if(limitMap[x][y] != null){
					wall.add(limitMap[x][y]);
				}
			}
		}
		return wall;
	}
	
	public void getInfo(){
		String line = "";
		for(int y=0; y < limitMap.length; y++){
			for(int x = 0; x < limitMap[y].length; x++){
				line += " "+limitMap[x][y];
			}
			
			System.out.println(line);
			line ="";
		}
		
	}
	
	

	
	public boolean checkFrameLimit(int x, int y){
		boolean returnValue = false;

		if(x >= 0 && x <= (limitMap[0].length-1) 
		   && y >= 0 && y <= (limitMap.length-1)) {
			returnValue =  true;
		} 
		
		return returnValue;
		
	}
	
	public boolean getPermit(FigureMovable fm ){
 
		boolean returnValue = false;
		
		int nextStep[] = fm.getNextXY();		
		int nextX = nextStep[0];
		int nextY = nextStep[1];
		
		if(checkFrameLimit(nextX, nextY) && checkBarrierLimit(nextX, nextY, fm)){
			returnValue =  true;
		};
		
		return returnValue;
	}
	
	public boolean crash(Bullet fm){
		boolean returnValue = false;
		
		int nextStep[] = fm.getNextXY();		
		int nextX = nextStep[0];
		int nextY = nextStep[1];
		
		if(checkFrameLimit(nextX, nextY) && limitMap[nextX][nextY] instanceof Barrier )
		{
			limitMap[nextX][nextY].damage();
			
			if( fm.getOwner() != null){				
				fm.getOwner().hitting();
			};
		}
		return returnValue;
	}
		
		
		
	public boolean checkBarrierLimit(int x, int y, FigureMovable fm ){
		boolean returnValue = false;
		
		if(limitMap[x][y] == null) 
		{
			returnValue =  true;
		}		
		return returnValue;
	}

	public Barrier[][] getLimitMap() {
		return limitMap;
	}
	
}
