package DBTesting.DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Base {
	
	public static Connection connection;
	
	
	public Connection getConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spotify","Vijaya", "Vijaya@1998");
		return connection;
		
	}

}
