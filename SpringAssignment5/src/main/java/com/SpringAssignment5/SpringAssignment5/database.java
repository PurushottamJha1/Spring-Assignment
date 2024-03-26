package com.SpringAssignment5.SpringAssignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {

	private static final String URL = "jdbc:mysql://localhost:3306/database";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Purushottam@391";
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}