package employeeconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConnection {

	static Connection con;
	public static Connection getConnection() {
		try {
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee","User10","gana921@gmail.com");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return con;

	}

}
