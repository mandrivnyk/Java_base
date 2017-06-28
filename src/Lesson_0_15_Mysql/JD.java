package Lesson_0_15_Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class JD {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.jdbc.Driver").newInstance();
		//Class.forName("org.sqlite.JDBC").newInstance();
		//Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost/itea?user=root&password=210684");
		Connection conn =  DriverManager.getConnection("jdbc:mysql://s3.thehost.com.ua/itea2?user=helen&password=123456");
		System.out.println(conn);
		Statement st = conn.createStatement();
		//String query = "CREATE TABLE IF NOT EXISTS users(id INT PRIMARY KEY, name TEXT)";
		//st.execute(query);
//		st.execute("INSERT INTO users VALUES(1, 'MAx'), (2, 'Kate')");
		ResultSet rs = st.executeQuery("SHOW TABLES");
		//ResultSet rs = st.executeQuery("SELECT * FROM users");
		while(rs.next()){
			System.out.println(rs.getString(1));
		}
//		st.execute("INSERT INTO users VALUES(1, 'MAx'), (2, 'Kate')");
		ResultSet rs1 = st.executeQuery("DESCRIBE ss");
		//ResultSet rs = st.executeQuery("SELECT * FROM users");
		while(rs1.next()){
			System.out.println(rs1.getString(1));
		}
		
		ResultSet rs2 = st.executeQuery("SELECT * from ss");
		while(rs2.next()){
			System.out.println(rs2.getString(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getString(4)+" "+rs2.getString(5)
			);
		}
		
		
	}

}
