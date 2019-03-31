package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {

	public static Connection getConnection() {
		String jdbcURL = "jdbc:mysql://localhost/iscritticorsi?useTimezone=true&serverTimezone=UTC&user=root&password=484Stefano16";
		try {
			Connection conn = DriverManager.getConnection(jdbcURL);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
