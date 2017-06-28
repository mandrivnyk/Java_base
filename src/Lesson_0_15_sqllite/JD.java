package Lesson_0_15_sqllite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class JD {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.jdbc.Driver").newInstance();
		Class.forName("org.sqlite.JDBC").newInstance();
		Connection conn =  DriverManager.getConnection("jdbc:sqlite:D:/Dota2.db");
		Statement st = conn.createStatement();
		String query = "CREATE TABLE IF NOT EXISTS users(id INT PRIMARY KEY, name TEXT)";
		st.execute(query);
//		st.execute("INSERT INTO users VALUES(1, 'MAx'), (2, 'Kate')");
		ResultSet rs = st.executeQuery("SELECT * FROM users");
		while(rs.next()){
			System.out.println(rs.getString(1)+"-"+rs.getString(2));
		}
		
	}

}
