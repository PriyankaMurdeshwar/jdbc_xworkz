package com.xworkz.java.laptop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	//	static String url = "jdbc:mysql://localhost:3306/laptopdb";
	//	static String userName = "root";
	//	static String password = "w1n5t0n";

	private static Connection connection = null;

	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopdb", "root", "w1n5t0n");
			System.out.println("connection is successfull");
			System.out.println("connection is singleton");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {

		System.out.println("invoked getConnection()");

		if(connection != null) {
			return connection;
		}
		else {
			System.out.println("connection is not closed");
			return connection;
		}

	}

	public static void closeConnection() {

		System.out.println("invoked closeConnection()");
		try {
			if(connection != null) {
				connection.close();
				System.out.println("connection is closed");
			} 
			else{
				System.out.println("connection is not closed");

			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}





