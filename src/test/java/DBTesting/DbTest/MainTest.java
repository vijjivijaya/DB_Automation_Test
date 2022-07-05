package DBTesting.DbTest;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class MainTest extends Base {
	
 @Test
 public void getTableData() throws SQLException {
	 connection = this.getConnection();
	 Statement statement = connection.createStatement();
	 ResultSet resultSet = statement.executeQuery("Select * from users");
	 while(resultSet.next()) {
		 int id = resultSet.getInt(1);
		 String name = resultSet.getString(2);
		 String email = resultSet.getString(4);
		 String password = resultSet.getString(3);
		 System.out.println(id + "" + name + "" + email + "" + password); 
	 }
 }
	 @Test
	 public void insertData() throws SQLException {
		 connection = this.getConnection();
		 PreparedStatement preparedStatement = connection.prepareStatement("insert into users values(?,?,?,?)");
		 preparedStatement.setInt(1,103);
		 preparedStatement.setString(2, "vijju");
		 preparedStatement.setString(3, "vijji@mail.com");
		 preparedStatement.setString(4, "vijji29");
		 preparedStatement.executeUpdate();
		 getTableData();
	 }
	 
	 @Test 
	 
	 public void updateTableData () throws SQLException {
		 connection = this.getConnection();
		 PreparedStatement preparedStatement = connection.prepareStatement("update users set user_name = ? where user_id = ?");
		 preparedStatement.setString(1, "vijju");
		 preparedStatement.setInt(2, 102);
		 preparedStatement.executeUpdate();
		 getTableData(); 
	 }
     
	 
	@Test
	
	public void deleteTaleData() throws SQLException {
		 connection = this.getConnection();
		 PreparedStatement preparedStatement = connection.prepareStatement("delete from users where user_id= ?");
		 preparedStatement.setInt(1, 102);
		 preparedStatement.executeUpdate();
		 getTableData(); 
		
	}
}







