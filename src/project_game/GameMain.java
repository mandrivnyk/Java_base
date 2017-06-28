package project_game;

import javax.swing.JFrame;

public class GameMain {
    
	public static void main(String[] args) throws Exception {
		
		JFrame frame = new JFrame("BATTLE FIELD");
		Tank tank = new Tank(1,1);
		BattleFieldTemplate bf = new BattleFieldTemplate(frame, 704, 704, tank);
		bf.runTheGame();

	}
}
