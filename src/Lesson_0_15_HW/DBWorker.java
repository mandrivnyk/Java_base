package Lesson_0_15_HW;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;

public class DBWorker {
	
	Connection conn = null;
	Statement st = null;
	String type;
	
	public DBWorker(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.jdbc.Driver").newInstance();
		setType(type);
		String query = "";
		
		switch(getType()) {
			case "sqllite":
				Class.forName("org.sqlite.JDBC").newInstance();
				conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/easier/Dropbox/DB/sqlite-lesson152.db");
				st = conn.createStatement();
				query = "CREATE TABLE IF NOT EXISTS figures (id INTEGER PRIMARY KEY, name TEXT, color TEXT, length DOUBLE, area DOUBLE)";
				st.execute(query);
			break;
			case "mysql":
			default:
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				conn = DriverManager.getConnection("jdbc:mysql://localhost/itea?user=root&password=");
				st = conn.createStatement();
				query = "CREATE TABLE IF NOT EXISTS figures (id INT PRIMARY KEY AUTO_INCREMENT, name TEXT, color TEXT, length DOUBLE, area DOUBLE)";
				st.execute(query);
				break;	
		}
		
		
		
			
	}
	
	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setFigure(String name, String color, double length, double area) throws SQLException{
		st.execute("INSERT INTO figures VALUES(NULL, '"+name+"', '"+color+"', '"+length+"', '"+area+"')");
	}

	public String getFigure(int id) throws SQLException{
					
			ResultSet rs = st.executeQuery("SELECT * FROM figures WHERE id="+id);
			String result = "";
			if(rs.next()){
				result ="id: "+rs.getString(1)+" name: "+rs.getString(2)+" color: "+rs.getString(3)+" length: "+rs.getString(4)+" area: "+rs.getString(5)+"\n";
			}
			return result;
	};
	
//	public String[] getFigures() throws SQLException{
		public String getFigures() throws SQLException{
			ResultSet rs = st.executeQuery("SELECT * FROM figures");
			
			//String[] result = new String[10];
			String result = "";
			int i = 0;
			while(rs.next()){

				//list.add("id: "+rs.getString(1)+" name: "+rs.getString(2)+" color: "+rs.getString(3)+" length: "+rs.getString(4)+" area: "+rs.getString(5));
				//result[i++] ="id: "+rs.getString(1)+" name: "+rs.getString(2)+" color: "+rs.getString(3)+" length: "+rs.getString(4)+" area: "+rs.getString(5)+"\n";
				result +=" id: "+rs.getString(1)+" name: "+rs.getString(2)+" color: "+rs.getString(3)+" length: "+rs.getString(4)+" area: "+rs.getString(5)+"<html><br></html>";
			}
			return result;
	}
	
	
}
