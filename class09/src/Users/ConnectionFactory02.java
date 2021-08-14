package Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory02 {//class to give connection class object
	private static Connection conn = null;
	
	private ConnectionFactory02() {}
	
	public static Connection getConnection() throws SQLException {
		
		if (conn==null) {
			ResourceBundle bundle = ResourceBundle.getBundle("Users/dbconfig"); // this might now work gotta recheck
			String url = bundle.getString("url");
			String username = bundle.getString("username");
			String password = bundle.getString("password");
			conn = DriverManager.getConnection(url, username, password);
		}
		return conn;
	}
}
