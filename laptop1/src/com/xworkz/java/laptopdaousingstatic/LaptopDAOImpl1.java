package com.xworkz.java.laptopdaousingstatic;

import java.sql.*;

import com.xworkz.java.laptop.util.ConnectionProvider;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public class LaptopDAOImpl1 implements LaptopDAO1 {

	@Override
	public void saveLaptopRecord() {

		System.out.println("invoked saveLaptopRecord()");
		String sqlQuery = "INSERT INTO laptop VALUES(2,'lenovo','silver',50000)";

		try {
			Connection connection = ConnectionProvider.getConnection();
			Statement statement = connection.createStatement();

			statement.executeUpdate(sqlQuery);
			System.out.println("1 row is inserted");
		} catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
	}

	@Override
	public void saveLaptopRecord(int laptopID, String laptopBrand, String laptopColor, double laptopPrice) {

		System.out.println("invoked parameterized saveLaptopRecord()");
		String insertQuery = "INSERT INTO laptop VALUES(?,?,?,?)";

		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			//set the values using setters
			preparedStatement.setInt(1, laptopID);
			preparedStatement.setString(2,laptopBrand);
			preparedStatement.setString(3,laptopColor);
			preparedStatement.setDouble(4,laptopPrice);

			preparedStatement.executeUpdate();
			System.out.println("1 row is inserted");
		} 
		catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}

	}

	@Override
	public void updateBrand() {

		System.out.println("invoked updateBrand()");
		String updateQuery = "UPDATE laptop SET BRAND = 'dell' WHERE ID = 2";

		try {
			Connection connection = ConnectionProvider.getConnection();

			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery);
			System.out.println("1 row is updated");
		} catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
	}

	@Override
	public void updateBrand(String laptopBrand) {
		System.out.println("invoked  parameterized updateBrand()");
		String updateBrand = "UPDATE laptop SET BRAND = ? WHERE ID = 5";

		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement(updateBrand);
			//set the values using setters
			prepareStatement.setString(1,laptopBrand);
			prepareStatement.executeUpdate();
			System.out.println("1 row is updated");
		}
		catch (SQLException sqlexception) {
			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
}
	
	@Override
	public void updateBrandAndPrice() {

		System.out.println("invoked updateBrandAndPrice()");
		String updateBrandAndPrice = "UPDATE laptop SET BRAND = 'HP',PRICE = 80000 WHERE ID = 4";

		try {
			Connection connection = ConnectionProvider.getConnection();

			Statement statement = connection.createStatement();
			statement.executeUpdate(updateBrandAndPrice);
			System.out.println("1 row is updated");
		} catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}

	}

	@Override
	public void updateBrandAndPrice(String laptopBrand, double laptopPrice) {

		System.out.println("invoked updateBrandAndPrice()");
		String updateBrandAndPrice = "UPDATE laptop SET BRAND = ?, PRICE = ? WHERE ID = 1";

		try {
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement prepareStatement = connection.prepareStatement(updateBrandAndPrice);
			//set the values using setters
			prepareStatement.setString(1,laptopBrand);
			prepareStatement.setDouble(2,laptopPrice);
			prepareStatement.executeUpdate();
			System.out.println("1 row is updated");
		} catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
	}

	@Override
	public void deleteLaptopByID() {

		System.out.println("invoked deleteLaptopByID()");
		String deleteQuery = "delete from laptop where id = 2";

		try {
			Connection connection = ConnectionProvider.getConnection();

			Statement statement = connection.createStatement();
			statement.executeUpdate(deleteQuery);
			System.out.println("1 row is deleted");
		} catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
	}
	
	@Override
	public void deleteLaptopByID(int laptopID) {
		System.out.println("invoked parameterized deleteLaptopByID()");
		String deleteQuery = "delete from laptop where id = ?";
		
		try {
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement(deleteQuery);
		prepareStatement.setInt(1,laptopID);
		prepareStatement.executeUpdate();
		System.out.println("1 row is deleted");
		}
		 catch (SQLException sqlexception) {

				System.out.println("inside catch block SQL exception");
				System.out.println(sqlexception.getMessage());
				sqlexception.printStackTrace();
			}
		
		
	}
	

	@Override
	public void readSingleRecordById() {

		System.out.println("invoked readSingleRecordById()");
		String readSingleRecordById = "SELECT * FROM laptop WHERE ID = 1";

		try {
			Connection connection = ConnectionProvider.getConnection();

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readSingleRecordById);
			resultSet.next();
			System.out.println("id " + resultSet.getInt(1));
			System.out.println("Brand " + resultSet.getString(2));
			System.out.println("Color " + resultSet.getString(3));
			System.out.println("Price " + resultSet.getDouble(4));
			System.out.println("1 row is read by readSingleRecordById()");
		} catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
	}
	
	public void readSingleRecordById(int laptopID) {
		System.out.println("parameterized readLaptopPriceByID() invoked");
		String readSingleRecordById = "select * from laptop where ID =?";
		try{
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(readSingleRecordById);
			//set the values using setters
			preparedStatement.setInt(1, laptopID);
			preparedStatement.executeQuery();
			
		}
		catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
	}
	

	@Override
	public void readAllRecord() {

		System.out.println("invoked readAllRecord()");
		String readAllRecord = "SELECT * FROM laptop";

		try {
			Connection connection = ConnectionProvider.getConnection();

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readAllRecord);
			while (resultSet.next()) {
				System.out.println("id " + resultSet.getInt(1));
				System.out.println("Brand " + resultSet.getString(2));
				System.out.println("Color " + resultSet.getString(3));
				System.out.println("Price " + resultSet.getDouble(4));
				System.out.println("all row is read by readAllRecord()");
			}
		} catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
	}

	@Override
	public void readLaptopPriceByID() {
		
		System.out.println("invoked readLaptopPriceByID()");
		String readLaptopPriceByID = "SELECT PRICE FROM laptop WHERE ID= 3";

		try {
			Connection connection = ConnectionProvider.getConnection();

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readLaptopPriceByID);
			resultSet.next();
			System.out.println("Price " + resultSet.getDouble(1));
			System.out.println("laptop price is read by readLaptopPriceByID()");
		} catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
	}
	
	@Override
	public void readLaptopPriceByID(int laptopID) {
	
		System.out.println("invoked  parameterized readLaptopPriceByID()");
		String readLaptopPriceByID = "SELECT PRICE FROM laptop WHERE ID= ?";
		try {
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement preparedStatement= connection.prepareStatement(readLaptopPriceByID);
			preparedStatement.setDouble(1,laptopID);

			preparedStatement.executeUpdate();
			System.out.println("laptop price is read by readLaptopPriceByID()");
		} catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
		
		
	}

	@Override
	public void readLaptopBrandByID() {

		System.out.println("invoked readLaptopBrandByID()");
		String readLaptopBrandByID = "SELECT BRAND FROM laptop WHERE ID= 3";

		try {
			Connection connection = ConnectionProvider.getConnection();

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readLaptopBrandByID);
			resultSet.next();
			System.out.println("Brand " + resultSet.getString(1));
			System.out.println("laptop brand is read by readLaptopBrandByID()");
		} catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}

	}
	
	@Override
	public void readLaptopBrandByID(int laptopID) {
		System.out.println("parameterized readLaptopBrandByID() invoked");
		String readLaptopBrandByID = "select  BRAND from laptop where ID =?";
		try{
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(readLaptopBrandByID);
			//set the values using setters
			preparedStatement.setInt(1, laptopID);
			preparedStatement.executeQuery();
			
		}
		catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
		
	}

	@Override
	public void readLaptopColorSByID() {

		System.out.println("invoked readLaptopColorSByID()");
		String readLaptopColorSByID = "SELECT COLOR FROM laptop WHERE ID=1";

		try {
			Connection connection = ConnectionProvider.getConnection();

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readLaptopColorSByID);
			resultSet.next();
			System.out.println("color " + resultSet.getString(1));
			System.out.println("laptop color is read by readLaptopColorSByID()");
		} catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}

	}

	@Override
	public void readLaptopColorSByID(int laptopID) {
		
		System.out.println("parameterized readLaptopColorSByID() invoked");
		String readLaptopBrandByID = "select  BRAND from laptop where ID =?";
		try{
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(readLaptopBrandByID);
			//set the values using setters
			preparedStatement.setInt(1, laptopID);
			preparedStatement.executeQuery();
			
		}
		catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
		
		
	}










}
