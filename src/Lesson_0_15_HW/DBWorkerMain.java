package Lesson_0_15_HW;

import java.sql.SQLException;

public class DBWorkerMain {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DBWorker dbworker = new DBWorker("mysql");
		
 		dbworker.setFigure("triangle", "black", 10, 50);
 		dbworker.setFigure("triangle2", "black", 10, 50);
 		dbworker.setFigure("triangle3", "black", 10, 50);
 		dbworker.setFigure("triangle4", "black", 10, 50);
 		dbworker.setFigure("triangle5", "black", 10, 50);
		System.out.println("----------------------------");
		dbworker.getFigures();
		System.out.println("----------------------------");
		dbworker.getFigure(4);
		
	}
}
