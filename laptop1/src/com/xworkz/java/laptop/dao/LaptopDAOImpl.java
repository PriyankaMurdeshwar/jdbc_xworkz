package com.xworkz.java.laptop.dao;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public class LaptopDAOImpl implements LaptopDAO{
	@Override
	public void saveLaptopRecord() {

		String url = "jdbc:mysql://localhost:3306/laptopdb";
		String userName = "root";
		String password = "w1n5t0n";

		String sqlQuery = "INSERT INTO laptop VALUES(2,'lenovo','silver',50000)";
		Connection connection = null;
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			statement.executeUpdate(sqlQuery);
		}
		catch (SQLException sqlException) {

			System.out.println(sqlException.getMessage());
		}
		//catch (ClassNotFoundException classNotFoundException) {
		catch (Exception classNotFoundException) {	
			System.out.println(classNotFoundException.getMessage());
		}
		finally {

			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("---------------------------------------------------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}



	}

	@Override
	public void updateBrand() {
		String url = "jdbc:mysql://localhost:3306/laptopdb";
		String userName = "root";
		String password = "w1n5t0n";

		String updateQuery = "UPDATE laptop SET BRAND = 'dell' WHERE ID = 2";

		Connection connection = null;


		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery);
		}
		catch (SQLException sqlException) {

			System.out.println(sqlException.getMessage());
		}
		//catch (ClassNotFoundException classNotFoundException) {
		catch (Exception classNotFoundException) {	
			System.out.println(classNotFoundException.getMessage());
		}
		finally {

			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("---------------------------------------------------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	@Override
	public void updateBrandAndPrice() {

		String url = "jdbc:mysql://localhost:3306/laptopdb";
		String userName = "root";
		String password = "w1n5t0n";

		String updateBrandAndPrice = "UPDATE laptop SET BRAND = 'HP',PRICE = 80000 WHERE ID = 4";

		Connection connection = null;

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			statement.executeUpdate(updateBrandAndPrice);
		}
		catch (SQLException sqlException) {

			System.out.println(sqlException.getMessage());
		}
		//catch (ClassNotFoundException classNotFoundException) {
		catch (Exception classNotFoundException) {	
			System.out.println(classNotFoundException.getMessage());
		}
		finally {

			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("---------------------------------------------------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}


	}

	@Override
	public void deleteLaptopByID() {

		String url = "jdbc:mysql://localhost:3306/laptopdb";
		String userName = "root";
		String password = "w1n5t0n";

		String deleteQuery = "delete from laptop where id = 2";

		Connection connection = null;


		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			statement.executeUpdate(deleteQuery);
		}
		catch (SQLException sqlException) {

			System.out.println(sqlException.getMessage());
		}
		//catch (ClassNotFoundException classNotFoundException) {
		catch (Exception classNotFoundException) {	
			System.out.println(classNotFoundException.getMessage());
		}
		finally {

			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("---------------------------------------------------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	@Override
	public void readSingleRecordById() {

		String url = "jdbc:mysql://localhost:3306/laptopdb";
		String userName = "root";
		String password = "w1n5t0n";

		String readSingleRecordById = "SELECT * FROM laptop WHERE ID = 1";

		Connection connection = null;


		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(readSingleRecordById);
			//			by default resultSet is pointing to column so
			resultSet.next();
			System.out.println("id"+ resultSet.getInt(1));
			System.out.println("Brand"+ resultSet.getString(2));
			System.out.println("Color"+ resultSet.getString(3));
			System.out.println("Price"+ resultSet.getDouble(4));
		}
		catch (SQLException sqlException) {

			System.out.println(sqlException.getMessage());
		}
		//catch (ClassNotFoundException classNotFoundException) {
		catch (Exception classNotFoundException) {	
			System.out.println(classNotFoundException.getMessage());
		}
		finally {

			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("---------------------------------------------------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	@Override
	public void readAllRecord() {
		String url = "jdbc:mysql://localhost:3306/laptopdb";
		String userName = "root";
		String password = "w1n5t0n";

		Connection connection = null;

		String readAllRecord = "SELECT * FROM laptop";

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readAllRecord);
			//boolean isRowPresent = resultSet.next();
			//while(isRowPresent)
			while(resultSet.next()) {
				System.out.println("id " + resultSet.getInt(1));
				System.out.println("Brand " + resultSet.getString(2));
				System.out.println("Color " + resultSet.getString(3));
				System.out.println("Price " + resultSet.getDouble(4));



			}

		} catch (SQLException sqlException) {

			System.out.println(sqlException.getMessage());


		}
		//catch (ClassNotFoundException classNotFoundException) {
		catch (Exception classNotFoundException) {	
			System.out.println(classNotFoundException.getMessage());
		}
		finally {

			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("---------------------------------------------------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	@Override
	public void readLaptopPriceByID() {
		String url = "jdbc:mysql://localhost:3306/laptopdb";
		String userName = "root";
		String password = "w1n5t0n";

		Connection connection = null;

		//String readLaptopPriceByID = "SELECT PRICE FROM laptop WHERE ID IN (1,3,4)"; 
		String readLaptopPriceByID = "SELECT PRICE FROM laptop WHERE ID= 3";

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(readLaptopPriceByID);
			//by default resultSet is pointing to column so
			resultSet.next();
			System.out.println("Price " + resultSet.getDouble(1));
			//System.out.println("Price " + resultSet.getDouble(2));
			//System.out.println("Price " + resultSet.getDouble(3));
		}
		catch (SQLException sqlException) {

			System.out.println(sqlException.getMessage());


		}
		//catch (ClassNotFoundException classNotFoundException) {
		catch (Exception classNotFoundException) {	
			System.out.println(classNotFoundException.getMessage());
		}
		finally {

			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("---------------------------------------------------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}



	}

	@Override
	public void readLaptopBrandByID() {
		String url = "jdbc:mysql://localhost:3306/laptopdb";
		String userName = "root";
		String password = "w1n5t0n";

		Connection connection = null;

		//String readLaptopBrandByID = "SELECT BRAND FROM laptop WHERE ID IN (1,3,4)"; 
		String readLaptopBrandByID = "SELECT BRAND FROM laptop WHERE ID= 3";

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(readLaptopBrandByID);
			//by default resultSet is pointing to column so
			resultSet.next();
			System.out.println("Brand " + resultSet.getString(1));
		}
		catch (SQLException sqlException) {

			System.out.println(sqlException.getMessage());


		}
		//catch (ClassNotFoundException classNotFoundException) {
		catch (Exception classNotFoundException) {	
			System.out.println(classNotFoundException.getMessage());
		}
		finally {

			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("---------------------------------------------------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	@Override
	public void readLaptopColorSByID() {
		String url = "jdbc:mysql://localhost:3306/laptopdb";
		String userName = "root";
		String password = "w1n5t0n";

		Connection connection = null;

		//String readLaptopColorSByID = "SELECT COLOR FROM laptop WHERE ID IN (1,3,4)"; 
		String readLaptopColorSByID = "SELECT COLOR FROM laptop WHERE ID=1";

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(readLaptopColorSByID);
			//by default resultSet is pointing to column so
			resultSet.next();
			System.out.println("Color " + resultSet.getString(1));
		}
		catch (SQLException sqlException) {

			System.out.println(sqlException.getMessage());


		}
		//catch (ClassNotFoundException classNotFoundException) {
		catch (Exception classNotFoundException) {	
			System.out.println(classNotFoundException.getMessage());
		}

		finally {

			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("---------------------------------------------------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}


	}


}




