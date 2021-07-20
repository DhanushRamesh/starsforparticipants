package com.starsforparticipants.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	private static Connection connection;



	public  Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		if (connection == null) {

		 connection = DriverManager.getConnection("jdbc:mysql://:3306/starsforparticipants?useSSL=false", "root",
					"rajadhdh22!");

		}
		return connection;

	}
	
	public  boolean isConnected() {
		return connection != null;
	}

}